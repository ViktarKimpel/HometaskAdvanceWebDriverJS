package HomeTaskPatterns;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



    public class AbstractedPage {
        protected WebDriver driver;
        private static final int WAIT_FOR_ELEMENT_SECONDS = 10;

        public AbstractedPage (WebDriver driver){
            this.driver= driver;
        }

        protected void waitForElementVisible (By locator){
            new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS ).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        }

        protected void highLightElement (By locator){
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3000px black'", driver.findElement(locator));
        }
        protected void unHighlightElement (By locator){
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='0px'", driver.findElement(locator));
        }
        protected void clickByJS (By locator){
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(locator));
        }


    }

