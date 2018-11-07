import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

reportsDir = new File("target/test-reports/geb")
reportOnTestFailureOnly = false
baseNavigatorWaiting = false
atCheckWaiting = true
cacheDriverPerThread = true
baseNavigatorWaiting = true
quitCachedDriverOnShutdown = true

unexpectedPages = [SystemErrorPage]

waiting {
    timeout = 30
    retryInterval = 1
}

baseUrl = ""

environments {
    // run via “./gradlew chromeTest”
    chrome {
        driver = { new ChromeDriver() }
    }
    // run via “./gradlew chromeHeadlessTest”
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }
    // run via “./gradlew firefoxTest”
    firefox {
        driver = { new FirefoxDriver() }
    }
}