package org.example.old;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.fetch.Fetch;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Optional;

public class Check {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions(); //DesiredCapabilities no longer available
        options.addArguments("InPrivate");
        WebDriver webDriver = new EdgeDriver(options);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");
        webDriver.findElement(By.xpath("//textarea[@title='Search']") ).sendKeys("Hello");

        Actions action = new Actions(webDriver);
        action.keyDown(Keys.ENTER).build().perform();

    }
    public void instEdge(WebDriver webDriver){
        if(webDriver instanceof EdgeDriver edgeDriver){
           DevTools devTools = edgeDriver.getDevTools();
           devTools.createSessionIfThereIsNotOne();

           devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
           devTools.addListener(Fetch.requestPaused(), request ->
           {
               if ( request.getRequest().getUrl().contains("manoj")){
                   String mockedURL = request.getRequest().getUrl().replace("=","+");
                  devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockedURL), Optional.of(request.getRequest().getMethod()),
                 Optional.empty() ,Optional.empty(), Optional.empty() ));
               }
           });
        }
    }

}
