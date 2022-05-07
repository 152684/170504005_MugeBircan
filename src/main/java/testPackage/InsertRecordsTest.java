/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackage;

import databaseFunctions.InsertRecords;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mbirc
 */
public class InsertRecordsTest {
    public void test(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        
        System.out.println("-----------insertMitarbeiter überprüfen---------------");
        
        Scanner sc = new Scanner(System.in);
        Date geburt = null;
        System.out.println("Geben Sie den Geburtsdatum ein: ");
        String d = sc.nextLine();
        try{
            geburt = dateFormat.parse(d);        
        }catch(ParseException e){
            System.out.println("Der eingegebene Datum ist nicht gueltig.");
            e.printStackTrace();
        }        

        java.sql.Date sqlDate = new java.sql.Date(geburt.getTime());
       
        InsertRecords r = new InsertRecords();

        r.insertMitarbeiter("muge", 170504005, "maltepe", "email", 55537203, sqlDate, 45, "user1", "pass1");
        r.insertMitarbeiter("ayse", 170504006, "kadikoy", "email", 55537203, sqlDate, 45, "user2", "pass2");
        r.insertMitarbeiter("mehmet", 170504007, "bostanci", "email", 55537203, sqlDate, 45061, "user3", "pass3");
        r.insertMitarbeiter("veli", 170504008, "uskudar", "email", 55537203, sqlDate, 45, "user4", "pass4");


        System.out.println("-----------insertChef überprüfen---------------");
        r.insertChef("osman", 170504009, "kadikoy", "email2", 654987123, sqlDate, 96, "user5", "pass5");
        r.insertChef("hasan", 170504010, "kadikoy", "email2", 654987123, sqlDate, 96, "user6", "pass6");
        r.insertChef("nur", 170504011, "kadikoy", "email2", 654987123, sqlDate, 96, "user7", "pass7");
        
        System.out.println("-----------insertKunde überprüfen---------------");
        r.insertKunde("nurgul", 170504012, "kadikoy", "email2", 654987123, sqlDate);
        
        System.out.println("-----------insertReiseLeiter überprüfen---------------");
        r.insertReiseLeiter("ali", 170504008, "kadikoy", "email2", 654987123, sqlDate);
        
        System.out.println("-----------insertHotel überprüfen---------------");
        r.insertHotel("antalyaHotel", "antalya", 15675342, "emailHotel", 150);
 
        System.out.println("-----------insertTour überprüfen---------------");
        r.insertTour("antalyaTour", sqlDate, "burada kalinacak, suraya gidilecek", 20, "antalyaHotel", 50, 20, "ali");
        
    }
    
}
