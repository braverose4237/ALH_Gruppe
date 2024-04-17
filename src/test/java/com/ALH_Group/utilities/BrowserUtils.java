package com.ALH_Group.utilities;

import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String linkcheck(){

// Save a object of the new Window
        String currentWindow = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(currentWindow)) {
                Driver.getDriver().switchTo().window(windowHandle);
                break;
            }
        }

// Take a Url of new Window
        String newWindowUrl = Driver.getDriver().getCurrentUrl();
        return newWindowUrl;
    }
}


