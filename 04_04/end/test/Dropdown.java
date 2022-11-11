import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/ys/Downloads/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        Thread.sleep(3000);
        dropDownMenu.click();
        Thread.sleep(3000);
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        Thread.sleep(3000);
        autocompleteItem.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
