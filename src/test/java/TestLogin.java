import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
    WebDriver driver = new ChromeDriver();
    //private WebDriver driver;

    @Before
    public void setUp() {
        // 🔁 Chemin vers ton chromedriver
        System.setProperty("webdriver.chrome.driver", "");
//driver = new ChromeDriver();
    }

    @Test
    public void testRechercheGoogle() {
        driver.get("https://www.google.com");
        WebElement barreRecherche = driver.findElement(By.name("q"));
        barreRecherche.sendKeys("Jenkins CI");
        barreRecherche.submit();

        Assert.assertTrue(driver.getTitle().toLowerCase().contains("jenkins"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

