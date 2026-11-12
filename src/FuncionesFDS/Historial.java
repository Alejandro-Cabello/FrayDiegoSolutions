/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionesFDS;

import conexionBD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PepivskyPc
 */
public class Historial {
    private int lector;
    private int P_totales;
    private int P_disponibles;
    private int P_activos;
   
    
    public Historial (String lector1, int lector, int P_totales, int P_disponibles){
        this.lector = lector;
        this.P_activos = P_activos;
        this.P_disponibles = P_disponibles;
        this.P_totales = P_totales;
       
    }

    public int getLector() {
        return lector;
    }

    public void setLector(int lector) {
        this.lector = lector;
    }

    public int getP_totales() {
        return P_totales;
    }

    public void setP_totales(int P_totales) {
        this.P_totales = P_totales;
    }

    public int getP_disponibles() {
        return P_disponibles;
    }

    public void setP_disponibles(int P_disponibles) {
        this.P_disponibles = P_disponibles;
    }

    public int getP_activos() {
        return P_activos;
    }

    public void setP_activos(int P_activos) {
        this.P_activos = P_activos;
    }
    
     public static Historial buscarlector(String lector) throws SQLException{
      
        try{
            String strSql = " Select * from historial where id_lector like '"+lector+"%'";
            
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
            System.out.println(objRes);
            
            if (objRes.next()){
                System.out.println("next");
                Conexion.buscarISBN = true;
                // asigna las variables al objeto
                lector = objRes.getString("id_lector");
                int P_totales = Integer.parseInt(objRes.getString("Prestamos_totales"));
                int P_disponibles = Integer.parseInt(objRes.getString("Prestamos_disponibles"));
                int P_activos = Integer.parseInt(objRes.getString("Prestamos_activos"));
               
             
                return new Historial(lector, P_totales, P_activos, P_disponibles);
            } else {
                System.out.println("null");
                return null;
            }
            
        }catch(Exception e){
            System.out.println("Error al buscar el historial"+e.getMessage());
            return null;
        } finally {
            //Conexion.desconectar();
        }
    }
     
      public static void actualizar(int lector, int ptotales, int pdisponibles, int pactivos){
        try{
            String strSql = "update historial set Prestamos_totales = '"+ptotales+"', Prestamos_activos = '"+pactivos+"', Prestamos_disponibles = '"+pdisponibles+"'  where id_lector like '"+lector+"%'"; 
            Conexion.conectar();
            Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
            System.out.println("historial actualizado");
           // Conexion.desconectar();
        }catch(Exception e){
            System.out.println("Error al actualizar el historial" +e.getMessage());
            
        }
        
    }
    
}
