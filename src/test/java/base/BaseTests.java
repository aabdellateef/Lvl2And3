package base;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTests {
    WebDriver driver;
    protected HomePage homePage;

    protected ReadDataFromJson readDataFromJson;

    @BeforeClass
    public void SetUp() throws FileNotFoundException {
        driver = new ChromeDriver();
        readDataFromJson = new ReadDataFromJson();
        driver.get(readDataFromJson.readJsonFile().URL);
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
