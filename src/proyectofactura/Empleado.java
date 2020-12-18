package proyectofactura;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Empleado extends Persona {

    private Rol Rol;
    public static ArrayList<Empleado> Lista;

    public Empleado(String TipoDoc, long NoDocumento, String Direccion, String Telefono, Rol Rol) {
        super(TipoDoc, NoDocumento, Direccion, Telefono);
        this.Rol = Rol;
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

    }

    /*public  void Show(){
        menus.WriteT("Datos Empleado");
        menus.WriteT("id: " + +"\n" + "Nombre: " + Nombre+"\n" 
        + "Contacto" + Contacto );
    }*/
    public Empleado Find() {

        return new Empleado("", 0, "", "", new Rol());
    }
}
