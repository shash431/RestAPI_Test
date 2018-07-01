package helpers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {

  private Properties properties;
  private final String propertyFilePath= "src\\test\\resources\\properties\\env.properties";


  public PropertiesHelper(){
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader(propertyFilePath));
      properties = new Properties();
      try {
        properties.load(reader);
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("env.properties not found at " + propertyFilePath);
    }
  }

  public String getServicesUri() {
    String uri = properties.getProperty("base.uri");
    if(uri != null) return uri;
    else throw new RuntimeException("base.uri not specified in the env.properties file.");
  }

  public String getCategoriesEndPoint(){
    String categoriesEndPoint = properties.getProperty("CategoriesEndPoint");
    if(categoriesEndPoint !=null) return this.getServicesUri()+ categoriesEndPoint;
    else throw new RuntimeException("categories end point not specified in the properties file");
  }



}
