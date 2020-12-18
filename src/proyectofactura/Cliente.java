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
public class Cliente extends Persona {

    public static ArrayList<Cliente> Lista;

    public Cliente(String TipoDoc, long NoDocumento, String Direccion, String Telefono) {
        super(TipoDoc, NoDocumento, Direccion, Telefono);

    }

    void Show() {

        System.out.println("Tipo Documento: " + this.getTipoDoc() +"\n"
        + "Numero Documento: "  + this.getNoDocumento() + "\n"
        + "Direccion: " + this.getDireccion() +  "\n"
        + " Telefono: " + this.getTelefono() );

    }
}
