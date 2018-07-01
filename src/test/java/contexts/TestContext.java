package contexts;

import java.util.HashMap;

public class TestContext {

  private HashMap<Object, Object> sharedData;

  public TestContext (){
    sharedData = new HashMap<>();
  }

  public HashMap<Object, Object> getSharedData() {
    return sharedData;
  }

  public void addSharedData(Object key, Object value) {
    sharedData.put(key, value);
  }
}
