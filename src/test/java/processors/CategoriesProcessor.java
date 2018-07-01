package processors;

import contexts.TestContext;
import helpers.UtilHelper;
import io.restassured.response.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriesProcessor {

  private  UtilHelper utilHelper;
  ResponseBody response = null;

  public CategoriesProcessor(TestContext context){
     utilHelper = new UtilHelper(context);
  }

  public ResponseBody retrieveProductDetailsforCategory(String categoryId) {
    try {
      this.response = utilHelper.callService(null, categoryId, "Categories", null, "get");
      System.out.println(response.jsonPath().prettyPrint());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return response;
  }

  public boolean checkCanRelistStatus(){

    if(this.response.jsonPath().getString("CanRelist").equals("true")){
      return true;
    }else
      return false;

  }

  public boolean checkCategoryName(String categoryName) {
    if (this.response.jsonPath().getString("Name").equals(categoryName)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkPromotionElementInfo(String promotionElement,String description) {

    List<Map<String, String>> promotions = this.response.jsonPath().getList("Promotions");
    boolean descriptionStatus = false;
    for (int i = 0; i < promotions.size(); i++) {
      if (promotions.get(i).get("Name").equals(promotionElement)) {
        if (promotions.get(i).get("Description").contains(description)) {
           descriptionStatus = true;
           System.out.println("found " + promotions.get(i).get("Name") + " and its description " + promotions.get(i).get("Description"));
          break;
        } else {
           descriptionStatus = false;
        }
      }
    }
    return descriptionStatus;
  }
}


