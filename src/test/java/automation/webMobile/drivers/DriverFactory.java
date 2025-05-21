package automation.webMobile.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    //private static final String DRIVER_PATH = "/Users/jorgenavidadespliego/Developer/chromedrivers/136/chromedriver";
    private static final String DRIVER_PATH = "C:\\\\Drivers\\\\chromedriver.exe";

    public static WebDriver createMobileDriver() {
        //Verificamos si el archivo existe antes de usarlo
        if (!new java.io.File(DRIVER_PATH).exists()) {
            throw new RuntimeException("❌ ChromeDriver no encontrado en: " + DRIVER_PATH +
                "\n✅ Asegúr ate de descargar la versión compatible conChrome 136 y colocarlo ahí.");
        }

        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

        ChromeOptions options = new ChromeOptions();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Pixel 2"); // O "iPhone X"
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        options.addArguments("--remote-allow-origins=*");

        return new ChromeDriver(options);
    }
}