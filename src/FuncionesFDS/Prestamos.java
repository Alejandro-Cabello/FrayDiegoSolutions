/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionesFDS;

import conexionBD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author PepivskyPc
 */
public class Prestamos {

    private String lector;
    private String libro;
    private String isbn;
    private String inicio;
    private String limite;
    private String real;

    public Prestamos(String lector, String libro, String inicio, String limite, String real, String isbn) {
        this.lector = lector;
        this.libro = libro;
        this.inicio = inicio;
        this.limite = limite;
        this.real = real;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public static Prestamos cargarISBN(String isbn) throws SQLException {

        try {
            String strSql = " Select * from prestamo where ISBN like '" + isbn + "%'";

            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
            System.out.println(objRes);

            if (objRes.next()) {
                System.out.println("next");
                Conexion.buscarISBN = true;
                // asigna las variables al objeto
                isbn = objRes.getString("ISBN");
                String Lector = objRes.getString("ID_usuario");
                String Libro = objRes.getString("ID_libro");
                String Limite = objRes.getString("Fecha_limite");
                String Real = objRes.getString("devolucion");
                String Inicio = objRes.getString("Fecha_inicio");

                return new Prestamos( Lector, Libro, Real, Limite , Inicio ,isbn);
            } else {
                System.out.println("null");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Error al buscar el isbn c" + e.getMessage());
            return null;
        } finally {
            Conexion.desconectar();
        }
    }

    public static void actualizar(String isbn, String devolucion) {
        try {
            String strSql = "update prestamo set devolucion = '" + devolucion + "'  where ISBN like '" + isbn + "%'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
            System.out.println("Libro actualizado");
            // Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al actualizar el libro" + e.getMessage());

        }
    }
}
