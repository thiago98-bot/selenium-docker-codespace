import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URI;
import java.net.URL;

public class DockerTest {
    public static void main(String[] args) throws Exception {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(
         new URI("http://0.0.0.0:4444/wd/hub").toURL(),
         options
);


        driver.get("https://www.google.com");
        System.out.println("Título: " + driver.getTitle());

        Thread.sleep(10000); // tiempo para mirar la ejecución en NoVNC
        driver.quit();
    }
}
