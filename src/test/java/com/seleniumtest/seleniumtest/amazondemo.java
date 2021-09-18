import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazondemo {

    private WebDriver driver;

    @Test(priority = 0)
    public void test1() {
        driver.get("https://www.amazon.in");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,
                "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        // driver.manage().window().setPosition(new Point(100,30));
    }

    @Test(priority = 1)
    public void test2() {
        driver.manage().window().maximize();
        WebElement linktestElement = driver.findElement(By.linkText("Electronics"));
        linktestElement.click();

    }

    @Test(priority = 2)
    public void test3() {
        WebElement linktestElement = driver.findElement(By.linkText("Laptop & Accessories"));
        linktestElement.click();
    }

    @Test(priority = 3)
    public void test4() {
        WebElement cssElement = driver.findElement(By.cssSelector("#sobe_d_b_3_4 .a-dynamic-image"));
        cssElement.click();
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
