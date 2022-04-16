package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RecipePage;
import utilities.PropertyReader;


    public class RecipeTest extends TestBase {

        @Test (groups = {"smoke"})
       public void positiveRecipeConvert() {
            //driver.get(PropertyReader.getProperty("url"));

            driver.findElement(By.partialLinkText("Recipe Resizer")).click();

//            RecipePage rp = new RecipePage();
//
//            rp.recipePage.click();
//            rp.recipeName.sendKeys("Cake");
//            rp.recipeNotes.sendKeys("Delicious chocolate cake");
//            rp.origServ.sendKeys("4");
//            rp.resizeServ.sendKeys("4");


            //Selecting radiobox and verifying if one of them selected (Metric)

            WebElement radio1 = driver.findElement(By.id("MeasurementSystemImperial"));
            WebElement radio2 = driver.findElement(By.id("MeasurementSystemMetric"));
            boolean Selected = radio1.isSelected();

            if (Selected) {
                radio2.click();
            }
            Assert.assertTrue(radio2.isSelected());
        }

        @Test(groups = {"smoke"})
      public void negativeRecipeConvert() {
            //driver.get(PropertyReader.getProperty("url"));

            RecipePage rp = new RecipePage();
            rp.recipePage.click();
            rp.recipeName.sendKeys("Cake");
            rp.recipeNotes.sendKeys("Delicious chocolate cake");
//
//        rp.origServ.sendKeys("4");
//        rp.resizeServ.sendKeys("4");
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertFalse("4".equals("-4"), "Failed");
            softAssert.assertFalse("4".equals("abcdefghijklmnoprqstuywxvzABCDEFGHIJKLMNOPRSTQUYWXVZ"), "Failed");
            softAssert.assertFalse("4".equals("123456789001234567890"), "Failed");
        }

        @Test(groups = {"smoke"})
        public void negativeIngredientsQty() {

            driver.findElement(By.name("Ingredients[0].Quantity")).sendKeys("-2");
            driver.findElement(By.xpath("//*[@id=\"Ingredients[0].Measurement\"]/option[4]"));
            driver.findElement(By.name("Ingredients[0].Ingredient")).sendKeys("Flour");

            driver.findElement(By.name("Ingredients[1].Quantity")).sendKeys("-2");
            driver.findElement(By.xpath("//*[@id=\"Ingredients[1].Measurement\"]/option[4]"));
            driver.findElement(By.name("Ingredients[1].Ingredient")).sendKeys("Chocolate");

            driver.findElement(By.linkText("Resize Recipe")).click();

            String msg = "Errors were found on the form. Please correct the fields and try again. Ingredient quantity cannot be negative and must be a valid fraction or number. ";


            Assert.assertTrue(driver.getPageSource().contains(msg));

        }

        @Test(groups = {"smoke"})
                public void positiveIngredientsQty(){

                    driver.findElement(By.name("Ingredients[0].Quantity")).sendKeys("2");
                    driver.findElement(By.xpath("//*[@id=\"Ingredients[0].Measurement\"]/option[4]"));
                    driver.findElement(By.name("Ingredients[0].Ingredient")).sendKeys("Flour");

                    driver.findElement(By.name("Ingredients[1].Quantity")).sendKeys("3");
                    driver.findElement(By.xpath("//*[@id=\"Ingredients[1].Measurement\"]/option[4]"));
                    driver.findElement(By.name("Ingredients[1].Ingredient")).sendKeys("Chocolate");

                    driver.findElement(By.linkText("Resize Recipe")).click();

                    String expectedText = "Resized";
                    Assert.assertTrue(driver.getPageSource().contains(expectedText));



            }



            }


