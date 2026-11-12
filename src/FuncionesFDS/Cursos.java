
package FuncionesFDS;

import conexionBD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class Cursos {
    
    
    
    private int ID_Lector;
    private String Apellido_Materno_Lector;
    private String Apellido_Paterno_Lector;
    private String Nombre_Lector;
    private String Edad_Lector;
    private String Telefono_Lector;

    public Cursos(int ID_Lector, String Apellido_Materno_Lector, String Apellido_Paterno_Lector, String Nombre_Lector, String Edad_Lector, String Telefono_Lector) {
        this.ID_Lector = ID_Lector;
        this.Apellido_Materno_Lector = Apellido_Materno_Lector;
        this.Apellido_Paterno_Lector = Apellido_Paterno_Lector;
        this.Nombre_Lector = Nombre_Lector;
        this.Edad_Lector = Edad_Lector;
        this.Telefono_Lector = Telefono_Lector;
    }

    public int getID_Lector() {
        return ID_Lector;
    }

    public void setID_Lector(int ID_Lector) {
        this.ID_Lector = ID_Lector;
    }

    public String getApellido_Materno_Lector() {
        return Apellido_Materno_Lector;
    }

    public void setApellido_Materno_Lector(String Apellido_Materno_Lector) {
        this.Apellido_Materno_Lector = Apellido_Materno_Lector;
    }

    public String getApellido_Paterno_Lector() {
        return Apellido_Paterno_Lector;
    }

    public void setApellido_Paterno_Lector(String Apellido_Paterno_Lector) {
        this.Apellido_Paterno_Lector = Apellido_Paterno_Lector;
    }

    public String getNombre_Lector() {
        return Nombre_Lector;
    }

    public void setNombre_Lector(String Nombre_Lector) {
        this.Nombre_Lector = Nombre_Lector;
    }

    public String getEdad_Lector() {
        return Edad_Lector;
    }

    public void setEdad_Lector(String Edad_Lector) {
        this.Edad_Lector = Edad_Lector;
    }

    public String getTelefono_Lector() {
        return Telefono_Lector;
    }

    public void setTelefono_Lector(String Telefono_Lector) {
        this.Telefono_Lector = Telefono_Lector;
    }



    
    
    
    
    
    
    
                    
    /*private int ID_Curso;
    private String Actividades;
     private String Fecha_Actividad;
    private String Curso;
    
    

    public Cursos(int ID_Curso, String Actividades, String Curso) {    //guardar actividad
        this.ID_Curso = ID_Curso;
        this.Actividades = Actividades;
        this.Curso = Curso;
    }

    public Cursos(int ID_Curso, String Actividades, String Fecha_Actividad, String Curso) {  //Cargar actividad
        this.ID_Curso = ID_Curso;
        this.Actividades = Actividades;
        this.Fecha_Actividad = Fecha_Actividad;
        this.Curso = Curso;
    }


  
    //setters a getters de las variables 

    public int getID_Curso() {
        return ID_Curso;
    }

    public void setID_Curso(int ID_Curso) {
        this.ID_Curso = ID_Curso;
    }

    public String getActividades() {
        return Actividades;
    }

    public void setActividades(String Actividades) {
        this.Actividades = Actividades;
    }

    public String getFecha_Actividad() {
        return Fecha_Actividad;
    }

    public void setFecha_Actividad(String Fecha_Actividad) {
        this.Fecha_Actividad = Fecha_Actividad;
    }
     
    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    //-------------------
    
    public void guardarActividad()throws SQLException{     //agregar Actividad a datos a la DB
       
      try{
           
          String strSql = "insert into cursos_actividades values ("+ID_Curso+",'"+Actividades+"',CURRENT_TIMESTAMP(),'"+Curso+"')";  
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
            System.out.println("Datos almacenados");
            Conexion.desconectar();
        } catch (Exception e){
            System.out.println("Error en el metodo guardarActividad");
        } 
      
   }
    
    public void cargarActividad()throws SQLException{
        
      try{
            Conexion.buscarActividad = false;
            String strSql = "select * from cursos_actividades"; //where ID_Curso = '"+ID_Curso+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
            if (objRes.next()){
                Conexion.buscarActividad = true;
                ID_Curso = Integer.parseInt(objRes.getString(1));
                Actividades = objRes.getString(2);
                Fecha_Actividad = objRes.getString(3);
                Curso = objRes.getString(4);
               
            }
            Conexion.desconectar();
        }catch(Exception e){
            System.out.println("Error al buscar Actividad");
            
        }     
    
    }*/
    
    public static Cursos cargarLectorAl(String ID_Lector){
        
        try{
            Conexion.buscarlector = false;
            String strSql = "SELECT * FROM lector where ID_Lector = '"+ID_Lector+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
            
            if (objRes.next()){
                
                Conexion.buscarlector  = true;
                            
                int NEWID_Lector = objRes.getInt("ID_Lector");
                String Apellido_Materno_Lector = objRes.getString("Apellido_Materno_Lector");
                String  Apellido_Paterno_Lector = objRes.getString("Apellido_Paterno_Lector");
                String Nombre_Lector = objRes.getString("Nombre_Lector");
                String Edad_Lector = objRes.getString("Edad_Lector");
                String Telefono_Lector = objRes.getString("Telefono_Lector");
                
                              
                return new Cursos(NEWID_Lector, Apellido_Materno_Lector, Apellido_Paterno_Lector, Nombre_Lector, Edad_Lector, Telefono_Lector);
            
            }else{          
                    return null;        
            }
               
        }catch(Exception e){
            System.out.println("Error al buscar el cliente");
            return null;
            
        }finally {
            Conexion.desconectar();
        }
    }
    
    
    
    
 
    
    
}
