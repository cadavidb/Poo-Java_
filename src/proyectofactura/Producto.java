/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofactura;

/**
 *
 * @author HP
 */
public class Producto {

    private int Codigo;
    private String Nombre;
    private String Descripcion;
    private int Precio;

    //Hace falta importar fecha y hora
    public Producto(int Codigo, String Nombre, String Descripcion, int Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
}
