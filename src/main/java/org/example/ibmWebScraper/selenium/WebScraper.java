package org.example.ibmWebScraper.selenium;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScraper {

    public static List<String> scrapeEmailAddresses(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);

        String pageText = driver.getPageSource();
        //email pattern
        Pattern emailPattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+");
        Matcher matcher = emailPattern.matcher(pageText);

        Set<String> emails = new LinkedHashSet<>();

        while (matcher.find()){
            emails.add(matcher.group());
        }
        return new ArrayList<>(emails);
    }

    public static List<String> scrapeMobileNumbers(WebDriver driver, String pageUrl) {

        driver.get(pageUrl);

        String pageText = driver.getPageSource();
        //mobile pattern
        Pattern mobilepattern = Pattern.compile("\\b\\d{10}\\b+");
        Matcher matcher = mobilepattern.matcher(pageText);

        Set<String> mobNum = new LinkedHashSet<>();

        while (matcher.find()){
            mobNum.add(matcher.group());
        }
        return new ArrayList<>(mobNum);
    }
}
