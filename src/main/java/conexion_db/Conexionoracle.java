/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion_db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author derek
 */
public class Conexionoracle {
    private Connection conexion1 = null ;
    private String url,user, pass;
    
   public Conexionoracle(){
        conectar();
    }
    private void conectar(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");// Driver BD
            url = "jdbc:oracle:thin:@localhost:1521:free";
            user = "system";
            pass = "Ora1234";
            conexion1 = DriverManager.getConnection(url, user, pass);
            System.out.println("conectado");
            
        }catch (Exception e) {
            System.out.println("Error no se pudo conectar");
        }
    }
public void desconectar(){
    try{
        conexion1.close();
    }catch (Exception e){
        System.out.println("Error, no se pudo desconectar");
    }
}

    public void estableceConexionoracle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



