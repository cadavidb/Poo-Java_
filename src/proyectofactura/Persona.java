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
public class Persona {
    private String TipoDoc;
    private long NoDocumento;
    private String Direccion;
    private String Telefono;

    public String getTipoDoc() {
        return TipoDoc;
    }

    public void setTipoDoc(String TipoDoc) {
        this.TipoDoc = TipoDoc;
    }

    public long getNoDocumento() {
        return NoDocumento;
    }

    public void setNoDocumento(long NoDocumento) {
        this.NoDocumento = NoDocumento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Persona(String TipoDoc, long NoDocumento, String Direccion, String Telefono) {
        this.TipoDoc = TipoDoc;
        this.NoDocumento = NoDocumento;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
}
