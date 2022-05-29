/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huxas
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class connectionDB {
         // koneksi - rysis
 Connection koneksi=null;
public static Connection koneksiDb(){
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection filekoneksi = DriverManager.getConnection("jdbc:mysql://localhost/posdb","root",""); // Prisijungimas prie MySQL locahost database
        System.out.println("Connection Success");
        return filekoneksi;
    }
    catch (Exception e){
        System.out.println("Connection error");
        return null;
    }
}   
}