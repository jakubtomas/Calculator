package com.tomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://itsovy.sk/testing/");


        WebElement amount = driver.findElement(By.xpath("//*[@id=\"amount\"]"));
        WebElement interest = driver.findElement(By.xpath("//*[@id=\"interest\"]"));

        WebElement period = driver.findElement(By.xpath("//*[@id=\"period\"]"));
        WebElement valuePeriod = driver.findElement(By.xpath("//*[@id=\"lblPeriod\"]"));

        WebElement taxYes = driver.findElement(By.cssSelector("input[value=\"y\"]"));
        WebElement taxNo = driver.findElement(By.cssSelector("input[value=\"n\"]"));
        WebElement agreementConfirm = driver.findElement(By.id("confirm"));

        WebElement resetBtn = driver.findElement(By.id("btnreset"));
        WebElement calculateBtn = driver.findElement(By.id("btnsubmit"));
        WebElement result = driver.findElement(By.id("result"));



        String amountErrorMsg = "Amount must be a number between 0 and 1000000 !";
        String interestErrorMsg = "Interest must be a number between 0 and 100 !";
        String agreementErrorMsg = "You must agree to the processing !";


        //Testcase postup krokov ktory ma vysledok
        //subor prikazov
        /*
        * Poziadavky zakaznika:
- amount, cislo v intervale <0;1000000>
- interest, cislo v intervale <0;100>
- period , pocet rokov: 1,2,3,4,5
uzivatel musim vyplnit vsetky vstupne polia, zaroven musi zaskrtnut suhlas so spracovanim udajov
- uzivatel ma na vyber, ci vynosy su zdanene ( prednastavena hodnota: yes)
- kliknutim na reset sa formular vymaze
- kliknuti na vypocet sa najprv skontroluje, ci je vsetko zadane a v rozmedzi,
ak ano, prevedie sa vypocet a vypise sa pod formularom.
- chybove hlasky su cervenou farbou.

Pokial uzivatel po vypocte zmeni nejaky parameter, vysledok sa zmaze a musi
uzivatel znova kliknut na tlacidlo vypocet.
        * */


      // pismeno e
      // chyba     Error: Attribute size not allowed on element input at this point.
        // ked neexistuje  element div




    }
}
