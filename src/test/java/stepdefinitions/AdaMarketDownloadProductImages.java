package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdaMarket;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

import static pages.AdaMarket.*;

public class AdaMarketDownloadProductImages
{

    @Given("user navigate to eMarket website")
    public void user_navigate_to_eMarket_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("adaMarketUrl"));
    }


    @Given("select the {string} catagory from HomePage")
    public void select_the_catagory_from_HomePage(String category) {
        //get all links' text and put into a list
        searchIntheListAndClick("//*[@id='homeLeftMenu']/li/a",category);


    }


    @Given("select a {string} subCatagory")
    public void select_a_subCatagory(String subCategory) {
        searchIntheListAndClick("//*[@id='category1']/ul/li/a",subCategory);


    }


    @When("Download All Product Images")
    public void download_All_Product_Images() {

    }


    @Then("Verify all images by their barcode")
    public void verify_all_images_by_their_barcode() {

    }


}
