package stepdefinitions;

import contexts.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import processors.CategoriesProcessor;

public class CategoriesSteps {

  private TestContext context;
  CategoriesProcessor catProcessor ;

  public CategoriesSteps(TestContext context){
    this.context = context;
    catProcessor = new CategoriesProcessor(context);
  }

  @Given("^I am an existing user$")
  public void i_am_an_existing_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

  }


  @When("^I call the category service with categoryId \"([^\"]*)\"$")
  public void i_call_the_category_service_with_categoryId(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    context.addSharedData("categoryId",arg1);
    catProcessor.retrieveProductDetailsforCategory(arg1);
  }

  @Then("^I can see the name \"([^\"]*)\" of the category$")
  public void i_can_see_the_name_of_the_category(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assert catProcessor.checkCategoryName(arg1):"Category name is incorrect";
  }

  @Then("^I can see the canRelist  \"([^\"]*)\" status of the product$")
  public void i_can_see_the_canRelist_status_of_the_product(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assert catProcessor.checkCanRelistStatus():"CanRelist status is incorrect";
  }

  @Then("^I can see a promotion element with promotionName \"([^\"]*)\" and Description \"([^\"]*)\"$")
  public void i_can_see_a_promotion_element_with_promotionName_and_Description(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assert catProcessor.checkPromotionElementInfo(arg1,arg2):"Can't find" + arg1 + "with description" + arg2 ;
  }


}
