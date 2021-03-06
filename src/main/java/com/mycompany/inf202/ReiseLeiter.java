/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inf202;

//import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author mbirc
 * 
 * Klasse ReiseLeiter
 */
public class ReiseLeiter extends Person{
    
    //private ArrayList<String> touren = new ArrayList();
    //private int reiseAnzahl = 0;
    
    /**
     * Konstruktor fuer ReiseLeiter
     * @param n -- ReiseLeiter Name
     * @param ID -- ReiseLeiter BurgerID
     * @param anschr -- ReiseLeiter Anschrift
     * @param e -- ReiseLeiter Email
     * @param telefon -- ReiseLeiter Telefonnummer
     * @param geburt -- ReiseLeiter Geburtsdatum
     * @throws UngueltigeIDException 
     */
    public ReiseLeiter(String n, long ID, String anschr, String e, int telefon, Date geburt) throws UngueltigeIDException{
        super(n, ID, anschr, e, telefon, geburt);
    }
    
}
