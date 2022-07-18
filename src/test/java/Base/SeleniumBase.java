package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumBase {
    public static void main(String[] args) throws InterruptedException {
       letsCodeItTest();


    }
    public static void amazonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/arpinekhachatryan/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("macbook");
        driver.findElement(By.cssSelector("[id ='nav-search-submit-button']")).click();

        boolean bbb =true;
        List<WebElement> chosenMacBook = driver.findElements(By.cssSelector("[class =\"sg-row\"]"));
        for (int i = 0; i < chosenMacBook.size(); i++) {
            if(chosenMacBook.get(i).getText().contains("1,199")){
                System.out.println("GREAT" + chosenMacBook.get(i).getText());
                bbb = false;
                break;

            }


        }
        if(bbb){
            System.out.println("BAD");
        }
        driver.close();


    }
    public static void letsCodeItTest (){
        System.setProperty("webdriver.chrome.driver","/Users/arpinekhachatryan/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement bmvRadioButton = driver.findElement(By.id("bmwradio"));
        bmvRadioButton.click();

        WebElement checkboxHonda = driver.findElement(By.id("hondacheck"));
        checkboxHonda.click();

        WebElement disableButton = driver.findElement(By.id("disabled-button"));
        disableButton.click();
        System.out.println("Disabled");

        WebElement enableButton = driver.findElement(By.id("enabled-button"));
        enableButton.click();
        System.out.println("Enabled");

        WebElement supportButton = driver.findElement(By.linkText("SUPPORT"));
        supportButton.click();
        System.out.println("Support");

        driver.close();


    }

}
