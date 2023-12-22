/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rms;
public class MenuPrices {
    
        
    // ----------------- price --------------
    
    public double pbiryani = 100;
    public double pdaalchawal = 150;
    public double ppaneerhandhi = 500;
    public double pdaalmash = 300;
    public double ptomatochatni = 70;
    public double pladyfinger = 150;
    public double pmuttonkarai = 1100;
    public double pdaalMakhni  = 500;
    public double pchapatiroti = 200;
    public double ptandooriroti = 10;
    public double pdaalchana = 150;
    public double pchickenHandhi = 700;
    public double pchickenKarai = 750;
    public double pmuttonHandhi = 1500;
    public double pfish  = 1500;
    public double psalad = 60;
    public double praita = 40;
    public double pkheer = 150;
    public double picecream  = 200;
    public double pcustard = 200;
    //Drinks
    public double ptea = 40;
    public double plimca = 60;
    public double psevenup = 40;
    public double pAquafinaS = 30;
    public double pAquafinaL= 60;
    public double pcoffee=200;
    //Fast food...//
    public double proll=90;
    public double pfries = 50;
    public double ppizza= 750;
    public double pburger= 300;
    public double psandwitch= 150;
    
    
     public Double SetTax(Double cost)
    {
        
        Double tax =cost*0.13;
       
       Double costx  = cost+tax;
        
        return costx;
    }
    
     
}

