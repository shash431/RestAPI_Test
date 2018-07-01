package helpers;

import contexts.TestContext;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class UtilHelper {

  private TestContext context;
  PropertiesHelper propertyHelper = new PropertiesHelper();

  public UtilHelper(TestContext context){
    this.context = context;
  }

  public ResponseBody callService (Map<String, String> requestHeaders, String requestBody, String endPoint, String contentType, String apiAction ) throws Exception {
    String categoryId = requestBody;
    String endpoint = setEndpoint(endPoint);
    Response response;
    RequestSpecification request;

    RestAssured.baseURI = endpoint;
    RestAssured.useRelaxedHTTPSValidation();


    request = RestAssured.given().log().all();
    switch (apiAction.trim().toLowerCase()){
      case "get":{
        request.get();
        break;
      }
      case "post":{
        request.post();
        break;
      }
      case "put":{
        request.put();
        break;
      }
      default: {
        request.get();
      }
    }
    response = request.get();
    assert 200 == response.getStatusCode():"The request to: " + endPoint + " failed";
    try {
      return response.body();
    } catch (Exception e){
      System.out.println("An error occurred when attempting to retrieve the body for request: " + endPoint);
      throw e;
    }

  }

  public static String removePlaceholders(String rawString, String parameter, String replacementValue){
    return rawString.replaceAll("\\{" + parameter + "\\}",replacementValue);
  }



  public String setEndpoint(String endpoint){

    String endPoint = null;

    switch (endpoint.toLowerCase()){
      case "categories":{
        endPoint = propertyHelper.getCategoriesEndPoint();
        endPoint = UtilHelper.removePlaceholders(endPoint,"categoryId",context.getSharedData().get("categoryId").toString());
        break;
      }
      default: {
        return propertyHelper.getCategoriesEndPoint();
      }
    }
    return  endPoint;
  }


}
