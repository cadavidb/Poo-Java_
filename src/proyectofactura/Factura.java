/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofactura;

import java.util.ArrayList;

/**
 *
 * @author moren
 */
public class Factura {

    private static int NoFactura;
    private static Cliente Cliente;
    public static ArrayList<DetalleFactura> ListaDetalle;

    public static ArrayList<Factura> Lista;

    public int getNoFactura() {
        return NoFactura;
    }

    public void setNoFactura(int NoFactura) {
        Factura.NoFactura = NoFactura;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        Factura.Cliente = Cliente;
    }
}
