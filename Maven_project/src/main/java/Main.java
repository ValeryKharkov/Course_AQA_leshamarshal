import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main( String[] args ) {
        // Подключение драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\Devtools\\chromedriver-win64\\chromedriver.exe");
        // Создание сеанса. Сеанс создается автоматически путем инициализации нового объекта класса Driver
        WebDriver driver = new ChromeDriver();
        // Запуск браузера
        driver.get("https://www.google.com/");

    // Поиск определённого элемента
    WebElement element = driver.findElement(By.xpath("//img[contains(@alt,'Google')]"));
    // Получение свойства элемента из раздела DevTools → Elements → Properties
    String elementProperty = element.getAttribute("currentSrc"); // "https://www.google.com/images/branding/googlelogo/1x/googlelogo_light_color_272x92dp.png"
    System.out.println(elementProperty);
    }
}
