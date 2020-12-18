/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofactura;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Proveedor {

    public long IdProveedor;
    public String Nombre;
    public Persona Contacto;
    public static ArrayList<Proveedor> Lista;

    public Proveedor() {

    }

    public Proveedor(long IdProveedor, String Nombre, Persona Contacto) {
        this.IdProveedor = IdProveedor;
        this.Nombre = Nombre;
        this.Contacto = Contacto;
    }

    public long getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(long IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Persona getContacto() {
        return Contacto;
    }

    public void setContacto(Persona Contacto) {
        this.Contacto = Contacto;
    }

    public void Add() {

    }

    public void Update() {

    }

    public void Delete() {

    }

    public void List() {

    }

    public void Show() {
        menus.WriteT("Datos Proveedor");
        menus.WriteT("id: " + IdProveedor + "\n" + "Nombre: " + Nombre + "\n"
                + "Contacto: " + Contacto);
    }

    public Proveedor Find() {

        return new Proveedor();
    }
}
