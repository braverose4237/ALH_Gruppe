package com.ALH_Group.step_definitions;
import com.ALH_Group.pages.BasePage;
import com.ALH_Group.utilities.BrowserUtils;
import com.ALH_Group.utilities.ConfigurationReader;
import com.ALH_Group.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinition {
    BasePage basePage=new BasePage();
    @When("Der Benutzer navigiert zur Website kununu.com.")
    public void der_benutzer_navigiert_zur_website_kununu_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_kununu"));
        BrowserUtils.sleep(5);
    }
    @And("Der Benutzer akzeptiert Cookies.")
    public void der_benutzer_akzeptiert_cookies() {
       basePage.Cookies_akzeptieren.click();

    }
    @And("Der Benutzer gibt ALH Group in das Suchfeld auf kununu ein und drückt auf die Suchtaste.")
    public void derBenutzerGibtALHGroupInDasSuchfeldAufKununuEinUndDrucktAufDieSuchtaste() {
        String companyName = ConfigurationReader.getProperty("CompanyName");
        basePage.Arbeitgeber_Kununu.sendKeys(companyName);
        BrowserUtils.sleep(3);
        basePage.ALH_Gruppe_Auswahlen_Kununu.click();
        System.out.println("Page is opened");

        // basePage.Arbeitgeber_Kununu.sendKeys(Driver.getDriver().get(ConfigurationReader.getProperty("CompanyName")));
    }


    @Then("Der Benutzer erhält die Bewertungen von Kununu und gibt eine Bewertung aus.")
    public void der_benutzer_erhält_die_bewertungen_von_kununu_und_gibt_eine_bewertung_aus() {
        BrowserUtils.sleep(3);
        String score = basePage.score_kununu.getText();
        System.out.println("score = " + score);
        score = score.replace(',', '.');
        double doubleScore = Double.parseDouble(score);
        String companyName = ConfigurationReader.getProperty("CompanyName");
        if(doubleScore>= 3.5){

            System.out.println(companyName+" ist ein Unternehmen, das von seinen Mitarbeitern geliebt wird. ");
        }
        else{
            System.out.println(companyName+" ist ein Unternehmen, das von seinen Mitarbeitern nicht geliebt wird. ");
        }
        Assert.assertTrue(doubleScore>=3.5);
        }
    }



