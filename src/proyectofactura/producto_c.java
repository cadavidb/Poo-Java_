package proyectofactura;
//import java.text.Normalizer;

public class producto_c {

    private String nombre;
    private int precio;
    private int cantidad;
    private int total;

    public producto_c() {
        nombre = "";
        precio = 0;
        cantidad = 0;
        total = 0;
    }

    // obtener nombre del producto , sin dar manera de modificar la variable
    public String getNombre() {
        return nombre;
    }

    // asignar el nombre a la variable
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int i) {
        this.precio = i;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
