package com.test;//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;


//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    String mytext = "Hoi";


    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString(mytext,80,90);
    }
    //een (lege) methode die de Applet initialiseert
    public void init() {
      /*  mytext = "Hello Rohit";
        mytext = "Hello Roh";
        mytext = "Hello Rohi";
        */mytext = "Hello Rohit";
        setBackground(Color.CYAN);
    }
}