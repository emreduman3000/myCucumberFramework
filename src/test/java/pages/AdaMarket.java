package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdaMarket
{
    public AdaMarket()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='homeLeftMenu']/li/a")
    public static WebElement mainCategory;

    public static By mainList = By.xpath("//*[@id='homeLeftMenu']/li/a");


    public static void searchIntheListAndClick(String xpath,String itemInTheList)
    {
        List<WebElement> catagoriesInHomePage= Driver.getDriver().findElements(By.xpath(xpath));

        for (WebElement e : catagoriesInHomePage){
            System.out.println("Main Categories" + e.getText());

            if(e.getText().equals(itemInTheList)){
                e.click();
            }
        }
    }

}
