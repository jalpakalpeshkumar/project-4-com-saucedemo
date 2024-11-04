package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * 1. Set up EdgeBrowser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

public class EdgeBrowserTest {

    public static void main(String[] args) {
        //baseUrl
        String baseUrl = "https://www.saucedemo.com/";

        //1.  Set up Chrome browser.
        WebDriver driver = new EdgeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The Current URL : " + currentUrl);

        //5. Print the page source.
        System.out.println("The Page Source :" + driver.getPageSource());

        //6. Enter the email in the email field
        WebElement emileId = driver.findElement(By.name("user-name"));
        emileId.sendKeys("abc123@gmail.com");

        //7. Enter the password in the password field.
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("xyz123");

        //8.Click on the Login Button.
        WebElement login = driver.findElement(By.name("login-button"));
        login.click();

        //9.Print the current URL
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //10.  Navigate to baseUrl
        driver.get(baseUrl);

        //11.  Refresh the page.
        driver.navigate().refresh();

        //12.  Close the browser.
        driver.close();




    }

}
