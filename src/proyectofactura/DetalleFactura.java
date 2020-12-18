/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofactura;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author HP
 */
public class DetalleFactura {

    public static producto_c producto_c;
    private static int Cantidad;

    public DetalleFactura(producto_c producto_c, int Cantidad) {
        DetalleFactura.producto_c = producto_c;
        DetalleFactura.Cantidad = Cantidad;
    }

    public producto_c getProducto() {
        return producto_c;
    }

    public void setProducto(producto_c producto_c) {
        DetalleFactura.producto_c = producto_c;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        DetalleFactura.Cantidad = Cantidad;
    }

    public static void Show() {

        System.out.println("═══════════════════════════════════");
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        System.out.println("Fecha compra: " + fechaActual);
        System.out.println("Hora compra: " + horaActual);
        System.out.printf("N° Factura: %04d ", 0001);
        System.out.println("");
        System.out.println("═══════════════════════════════════");

       for (int i = 0; i <menus.facturas.size(); i++) {
        menus.facturas.get(i).getCliente().Show();
       }

        // System.out.println("Provedor: "+ p.setIdProveedor() + "Nombre" + p.setNombre + "Contacto" +p.setContacto()+"\n");
        System.out.println("═══════════════════════════════════");
        String value = String.format("%-10s", "Id") + String.format("%-15s", "Nombre") + String.format("%-12s", "Precio") + String.format("%-12s", "Cantidad") + String.format("%-10s\n", "Total");
        //String value = String.format("%-10s", "Id") + String.format("%-12s", "Nombre") + String.format("%-12s", "Precio    cantidad")+String.format("%-10s\n", "Total");

        for (int i = 0; i < menus.pedido.size(); i++) {
            value += (String.format("%-10s", (i + 0001) + (String.format("%-15s", menus.pedido.get(i).getNombre()) + (String.format("%-12s", String.valueOf( menus.pedido.get(i).getPrecio()) + (String.format("%-12s", String.valueOf( menus.pedido.get(i).getCantidad()) + (String.format("%-10s\n", producto_c.getTotal())))))))));
        }

        System.out.println(value);
        System.out.println("═════════════════════════════════");
        menus.MenuCajero();

    }
}
