/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseFunctions;

import com.mycompany.inf202.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mbirc
 */
public class SelectRecords {
    
    public static void allMitarbeiterInArray(ArrayList<Mitarbeiter> mitarbeitern){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM mitarbeiter"; 
        
          
        try {  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) { 
                Mitarbeiter m = new Mitarbeiter(rs.getString("name"), rs.getString("burgerID"), rs.getString("anschrift"), rs.getString("email"), 
                                                rs.getInt("telefonnummer"), rs.getDate("geburtsdatum"), rs.getInt("personalID"), rs.getString("userName"),
                                                rs.getString("passwort"));
                mitarbeitern.add(m);
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());                      
                }
            }
        }
          
    }    

    public static Mitarbeiter findMitarbeiter(int id){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM mitarbeiter WHERE burgerID = ?"; 
        
        Mitarbeiter m = null;
        
        
        try {              
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setInt(1, id);
  
            ResultSet rs    = pstmt.executeQuery();
            m = new Mitarbeiter(rs.getString("name"), rs.getString("burgerID"), rs.getString("anschrift"), rs.getString("email"), 
                                                rs.getInt("telefonnummer"), rs.getDate("geburtsdatum"), rs.getInt("personalID"), rs.getString("userName"),
                                                rs.getString("passwort"));
            
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException e){
                    System.out.println(e.getMessage());                      
                }
            }
        }
      
        return m;
    }
    
    public static Chef findChef(int id){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM mitarbeiter WHERE burgerID = ?"; 
        
        Chef chef = null;
        
        
        try {              
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setInt(1, id);
  
            ResultSet rs    = pstmt.executeQuery();
            chef = new Chef(rs.getString("name"), rs.getString("burgerID"), rs.getString("anschrift"), rs.getString("email"), 
                                   rs.getInt("telefonnummer"), rs.getDate("geburtsdatum"), rs.getInt("personalID"), rs.getString("userName"),
                                   rs.getString("passwort"));
            
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException e){
                    System.out.println(e.getMessage());                      
                }
            }
        }
      
        return chef;
    }

    public static void allChefInArray(ArrayList<Chef> chefs){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM chef"; 
        
          
        try {  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) { 
                Chef c2 = new Chef(rs.getString("name"), rs.getString("burgerID"), rs.getString("anschrift"), rs.getString("email"), 
                                   rs.getInt("telefonnummer"), rs.getDate("geburtsdatum"), rs.getInt("personalID"), rs.getString("userName"),
                                   rs.getString("passwort"));
                chefs.add(c2);
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());                      
                }
            }
        }
          
    }    

    public static void allKundenInArray(ArrayList<Kunde> kunden){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM kunde"; 
        
          
        try {  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) { 
                Kunde k2 = new Kunde(rs.getString("name"), rs.getString("burgerID"), rs.getString("anschrift"), rs.getString("email"), 
                                   rs.getInt("telefonnummer"), rs.getDate("geburtsdatum"), rs.getString("reisen"));
                kunden.add(k2);
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());                      
                }
            }
        }
          
    }    

    public static void allReiseLInArray(ArrayList<ReiseLeiter> reiseLeitern){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM reiseLeiter"; 
        
          
        try {  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) { 
                ReiseLeiter k2 = new ReiseLeiter(rs.getString("name"), rs.getString("burgerID"), rs.getString("anschrift"), rs.getString("email"), 
                                   rs.getInt("telefonnummer"), rs.getDate("geburtsdatum"));
                reiseLeitern.add(k2);
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());                      
                }
            }
        }
          
    }    

    public static void hotelNamenInArray(ArrayList<String> hotels){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM hotel"; 
        
          
        try {  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) { 
                String c2 = rs.getString("name");
                hotels.add(c2);
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());                      
                }
            }
        }
          
    }    

    public static void tourNamenInArray(ArrayList<String> tours){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT * FROM tour"; 
        
          
        try {  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) { 
                //String n, Date d, String info, int maxT, String hN, float p, ReiseLeiter rL
                String c2 = rs.getString("tourName");
                tours.add(c2);
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());                      
                }
            }
        }
          
    }    

    public static String selectTourKunden(String n){
        Connect c = new Connect();
        Connection conn = c.connect();
    
        String sql = "SELECT kunden FROM tour WHERE tourName = ?";  
        
          
        try {              
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setString(1, n);
  
            ResultSet rs    = pstmt.executeQuery();
            return rs.getString("kunden");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        finally {
            if(conn != null){
                try{
                    conn.close();                    
                }catch(SQLException e){
                    System.out.println(e.getMessage());                      
                }
            }
        }
        return null;
          
    }    
    
    
}
