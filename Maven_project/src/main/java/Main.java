import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main( String[] args ) {
        // Подключение драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\Devtools\\chromedriver-win64\\chromedriver.exe");
        // Создание сеанса. Сеанс создается автоматически путем инициализации нового объекта класса Driver
        WebDriver driver = new ChromeDriver();
        // Запуск браузера
        driver.get("https://ya.ru");
    }
}
