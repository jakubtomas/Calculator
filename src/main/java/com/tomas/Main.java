package com.tomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        Amount100Test amount100Test = new Amount100Test();
        amount100Test.amount100();




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
