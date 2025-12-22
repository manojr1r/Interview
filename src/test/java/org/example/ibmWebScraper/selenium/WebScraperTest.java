package org.example.ibmWebScraper.selenium;
//
//import org.apache.commons.lang3.RandomStringUtils;
//import org.example.ibmWebScraper.selenium.server.JettyServer;
//
//import org.openqa.selenium.WebDriver;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Random;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
public class WebScraperTest {
//    private static JettyServer server = null;
//    private static int TEST_PORT = 8001;
//    private static WebDriver driver = null;
//
//    private static String pagUrl = "http://localhost:" + TEST_PORT + "/home.html";
//
//    private static Set<String> expectedEmails = new HashSet<>();
//    private static Set<String> expectedMobiles = new HashSet<>();
//
//    @BeforeClass
//    public static void setup() {
//        driver = new HtmlUnitDriver(BrowserVersion.CHROME, true) {
//
//            @Override
//            protected WebClient newWebClient(BrowserVersion version) {
//                WebClient webClient = super.newWebClient(version);
//                webClient.getOptions().setThrowExceptionOnScriptError(false);
//
//                Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
//                Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);
//
//                return webClient;
//            }
//        };
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//
//        server = new JettyServer(TEST_PORT);
//        server.start();
//
//        generateData();
//
//        driver.get(pagUrl + "?emailAddresses=" + String.join(",", expectedEmails) + "&mobileNumbers=" + String.join(",", expectedMobiles));
//    }
//
//    @Test
//    public void testScrapeEmailAddresses() {
//        List<String> actualEmails = WebScraper.scrapeEmailAddresses(driver, pagUrl);
//
//        assertEquals(expectedEmails.size(), actualEmails.size());
//        for (String actualEmail : actualEmails) {
//            assertTrue(expectedEmails.contains(actualEmail));
//        }
//    }
//
//    @AfterClass
//    public static void tearDown() {
//        driver.close();
//        server.stop();
//    }
//
//    private static void generateData() {
//        int counterSeed = new Random().nextInt(7) + 5;
//
//        for (int i = 0; i < counterSeed; i++) {
//            int valueSize = new Random().nextInt(4) + 2;
//
//            String prefix = RandomStringUtils.random(valueSize, true, true);
//            String suffix = RandomStringUtils.random(2, true, false);
//            expectedEmails.add(prefix + "@" + prefix + "." + suffix);
//
//            StringBuilder number = new StringBuilder();
//            for (int j = 0; j < 10; j++) {
//                number.append(new Random().nextInt(8) + 1);
//            }
//
//            expectedMobiles.add(number.toString());
//        }
//    }
//
//    @Test
//    public void testScrapeMobileNumbers() {
//        List<String> actualMobiles = WebScraper.scrapeMobileNumbers(driver, pagUrl);
//
//        assertEquals(expectedMobiles.size(), actualMobiles.size());
//        for (String actualMobile : actualMobiles) {
//            assertTrue(expectedMobiles.contains(actualMobile));
//        }
//    }
}
