package com.ALH_Group.pages;

import com.ALH_Group.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@placeholder='Arbeitgeber eingeben']")
    public WebElement Arbeitgeber_Kununu;


    @FindBy(xpath = "//a[@href='/de/alhgruppe']")
    public WebElement ALH_Gruppe_Auswahlen_Kununu;

    @FindBy(xpath = "//div[@class='index__score__Ric3z']/span[1]")
    public WebElement score_kununu;

    @FindBy(xpath = "//button[@id='consent-accept-button']")
    public WebElement Cookies_akzeptieren;



    //div[@class="index__score__Ric3z"]/span[1]

}
