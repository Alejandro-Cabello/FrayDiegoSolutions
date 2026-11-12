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
public class Libros {

    private int id;
    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private String editorial;
    private String pais;
    private int anio;
    private String edicion;
    private int ejemplares;
    private String estante;
    private String area;
    private int ejdisponibles;
    private int ejprestados;
    private String disponibilidad;

    public Libros(String isbn, String titulo, String autor, String genero, String editorial, String pais, int anio, String edicion, int ejemplares, String estante, String area, int ejdisponibles, int ejprestados, String disponibilidad) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
        this.pais = pais;
        this.anio = anio;
        this.edicion = edicion;
        this.ejemplares = ejemplares;
        this.estante = estante;
        this.area = area;
        this.ejdisponibles = ejdisponibles;
        this.ejprestados = ejprestados;
        this.disponibilidad = disponibilidad;
    }

    public Libros(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getEjdisponibles() {
        return ejdisponibles;
    }

    public void setEjdisponibles(int ejdisponibles) {
        this.ejdisponibles = ejdisponibles;
    }

    public int getEjprestados() {
        return ejprestados;
    }

    public void setEjprestados(int ejprestados) {
        this.ejprestados = ejprestados;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public static Libros cargar(String isbn) throws SQLException {
        try {
            String strSql = " Select Id_libro from consultas where ISBN like '" + isbn + "%'";

            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
            System.out.println(objRes);

            if (objRes.next()) {
                System.out.println("next");
                Conexion.buscarISBN = true;
                // asigna las variables al objeto

                int id = Integer.parseInt(objRes.getString("Id_libro"));

                return new Libros(id);
            } else {
                System.out.println("null");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Error al buscar el empleado" + e.getMessage());

        }
        return null;
    }
    

      

    public static Libros cargarISBN(String isbn) throws SQLException {

        try {
            String strSql = " Select * from consultas where ISBN like '" + isbn + "%'";

            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
            System.out.println(objRes);

            if (objRes.next()) {
                System.out.println("next");
                Conexion.buscarISBN = true;
                // asigna las variables al objeto
                String Newisbn = objRes.getString("ISBN");
                String Nombre = objRes.getString("Nombre");
                String Autor = objRes.getString("Autor");
                String Genero = objRes.getString("Genero");
                String Editorial = objRes.getString("Editorial");
                String Pais = objRes.getString("Pais");
                int Anio = Integer.parseInt(objRes.getString("Publicacion"));
                String Edicion = objRes.getString("Edicion");
                int Ejemplares = Integer.parseInt(objRes.getString("Unidades"));
                String Estante = objRes.getString("Estante");
                String Area = objRes.getString("Area");
                int ejdisponibles = Integer.parseInt(objRes.getString("Disponibles"));
                int ejprestados = Integer.parseInt(objRes.getString("Prestados"));
                String disponibilidad = objRes.getString("Disponibilidad");

                // Edad = Integer.parseInt(objRes.getString("Edad"));
                //String Telefono = objRes.getString("Telefono");
                //String NombreEm = objRes.getString("NombreEmergencia");
                //String TelefonoEm = objRes.getString("TelefonoEmergencia");
                return new Libros(Newisbn, Nombre, Autor, Genero, Editorial, Pais, Anio, Edicion, Ejemplares, Estante, Area, ejdisponibles, ejprestados, disponibilidad);
            } else {
                System.out.println("null");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Error al buscar el empleado" + e.getMessage());
            return null;
        } finally {
            //Conexion.desconectar();
        }
    }

    public static void actualizar(String isbn, String Nombre, String Autor, String Genero, String Editorial, String Pais, int Anio, String Edicion, int Ejemplares, String Estante) {
        try {
            String strSql = "update consultas set Nombre = '" + Nombre + "', Autor = '" + Autor + "', Genero = '" + Genero + "', Editorial = '" + Editorial + "', Pais = '" + Pais + "', Publicacion = '" + Anio + "', Edicion = '" + Edicion + "', Unidades = '" + Ejemplares + "', Estante = '" + Estante + "' where ISBN like '" + isbn + "%'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
            System.out.println("Libro actualizado");
            //Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al actualizar el libro" + e.getMessage());

        }
    }

    public static void actualizarPrestamo(String isbn, int ejdisponibles, int ejprestados, String disponibilidad) {
        try {
            String strSql = "update consultas set Disponibles = '" + ejdisponibles + "', Prestados = '" + ejprestados + "', Disponibilidad = '" + disponibilidad + "' where ISBN like '" + isbn + "%'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
            System.out.println("Libro actualizado");
            //Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al actualizar el libro" + e.getMessage());

        }
    }

    public static void borrar(String id) {
        try {
            String strSql = "delete from consultas where ISBN = '" + id + "'";;
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
            System.out.println("Lirbo eliminado");
            //Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al eliminar libro");

        }
    }

    public void imprimirLibro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
