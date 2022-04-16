package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RecipePage {

//    public WebElement recipePage = Driver.getDriver().findElement(By.cssSelector("a[href*=\"recipe_resizer.html\"]"));
//    public WebElement recipeName = Driver.getDriver().findElement(By.name("RecipeName"));
//    public WebElement recipeNotes = Driver.getDriver().findElement(By.xpath("//textarea[@id=\"Notes\"]"));
//    public WebElement origServ = Driver.getDriver().findElement(By.name("OriginalServings"));
//    public WebElement resizeServ = Driver.getDriver().findElement(By.name("ResizedServings"));

 public RecipePage() {
  PageFactory.initElements(Driver.getDriver(), this);
 }
 @FindBy (partialLinkText = "Recipe Resizer")
 public WebElement recipePage;

 @FindBy (name = "RecipeName")
 public WebElement recipeName;

 @FindBy (xpath= "//textarea[@id=\"Notes\"]")
 public WebElement recipeNotes;

 @FindBy (name = "OriginalServings")
 public WebElement origServ;

 @FindBy (name = "ResizedServings")
 public WebElement resizeServ;





    }

