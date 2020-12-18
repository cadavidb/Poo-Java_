package proyectofactura;

import java.util.ArrayList;
import java.util.Scanner;

public class menus {

    static int acc = 0;
    static ArrayList<producto_c> pedido = new ArrayList<>();
    static ArrayList<Factura> facturas= new ArrayList<>();
    static ArrayList<Cliente> ListaClientes= new ArrayList<>();
    static int totalF=0;
    
    

    static boolean existenciaP=false;//change
    static boolean proveedoresE=false;


    public static void showdataFacturas(){


        if (!facturas.isEmpty()) {
            
            for (int i = 0; i <facturas.size() ; i++) {
            ListaClientes.get(i).Show();
            }
        }else{
            System.out.println("No se han generado facturas aun");
            MenuAdmin();

        }

    }







    public static void ADDPRODUCT() {
       
       if (proveedoresE) {
           WriteT("ingresa el codigo del producto");
           int codigo = Leer().nextInt();
           WriteT("ingresa el nombre del producto");
           String nombre = Leer().nextLine();
           WriteT("ingresa la descripcion");
           String descripcion = Leer().nextLine();
           WriteT("ingresa el precio del producto");
           int precio = Leer().nextInt();
           //productos registrados por el admin
           Producto producto = new Producto(codigo, nombre, descripcion, precio);
           existenciaP=true;
           
   
           System.out.println("Desea añadir otro producto?   1.si / 2.no");
           byte op = Leer().nextByte();
           switch (op) {
               case 1:
                   ADDPRODUCT();
                   break;
               default:
                   MenuRoles();
                   break;
           }
           
       }else{
           System.out.println("no hay ningun proveedor :( añade uno");
           MenuRoles();
       }

    }

    public static void MenuEmpleado() {

        WriteT("Ingresa el nombre del empleado");
        String name = Leer().nextLine();

        WriteT("Ingresa el tipo de documento");
        String tipod = Leer().nextLine();

        WriteT("Ingresa el numero de documento");
        Long document = Leer().nextLong();

        WriteT("Ingresa la direccion");
        String direccion = Leer().nextLine();

        WriteT("ingresa el telefono");
        String tel = Leer().nextLine();

        WriteT("ingresa el rol");
        String rol = Leer().nextLine();
        Rol role = new Rol(rol);

        Empleado empleado = new Empleado(tipod, document, direccion, tel, role);
        MenuRoles();
    }

    public static void MenuRoles() {
        //inicializar las listas
        

        System.out.println("**************BIENVENIDOS A LA TIENDA**************\n");
        WriteT("¿cual es tu rol? ");
        WriteT("1.)administrador\n2.)Empleado\n3.)Cajero ");
        byte role = Leer().nextByte();
        switch (role) {
            case 1:
                MenuAdmin();
                break;
            case 2:
                MenuEmpleado();
                break;
            case 3:
                MenuCajero();
                break;

            default:
                MenuRoles();
                break;
        }
    }

    // proveedor
    // empleado
    // cliente
    // factura
    public static void MenuAdmin() {

        WriteT("******BIENVENIDO A LA ADMINISTRACION******\n");
        WriteT("Elegir una opcion: \n1.)Proveedores\n2.)añadir productos\n3.)Ver todas las Facturas\n4.)Atras");
        byte op = Leer().nextByte();
        if (op == 1) {
            MenuProveedor();
        } else if (op == 2) {
            ADDPRODUCT();

        }else if (op == 3) {
         showdataFacturas();    
        }
        else if (op == 4) {
            MenuRoles();
           }
        
        
        else {
            MenuRoles();
        }

    }

    public static void MenuProveedor() {

        proveedoresE=true;

        System.out.println("***********Menú Proovedor***********");
        Proveedor proveedor = new Proveedor();

        WriteT("Ingresa el id del proveedor");
        proveedor.setIdProveedor(Leer().nextInt());

        WriteT("Ingresa el nombre del proveedor");
        proveedor.setNombre(Leer().nextLine());

        WriteT("Ingresa el tipo de documento");
        String tipod = Leer().nextLine();

        WriteT("Ingresa el numero de documento");
        Long document = Leer().nextLong();

        WriteT("Ingresa la direccion");
        String direccion = Leer().nextLine();

        WriteT("ingresa el telefono");
        String tel = Leer().nextLine();
        Persona persona = new Persona(tipod, document, direccion, tel);
        proveedor.setContacto(persona);
        WriteT("proveedor añadido con exito");
        System.out.println("");
        MenuRoles();
      
    }

    public static void Facturar(int acc) {

        // funcion tipo cajero sirve para redundamente facturar productos
        // añadidos por el admin
//
        System.out.println("Ingresa el nombre del producto");
        String nombre = Leer().nextLine();

        System.out.println("Ingresa el precio del producto");
        int precio = Leer().nextInt();

        System.out.println("Ingresa la cantidad del producto");
        int cantidad = Leer().nextInt();
        producto_c productosClientes = new producto_c();

        productosClientes.setNombre(nombre);
        productosClientes.setPrecio(precio);
        productosClientes.setCantidad(cantidad);
        int totalu= cantidad * precio;
        productosClientes.setTotal(totalu);
        totalF+=totalu;
        

        DetalleFactura detalleF = new DetalleFactura(productosClientes, cantidad);
        detalleF.setCantidad(cantidad);
        pedido.add(productosClientes);
        acc++;

        System.out.println("Deseas añadir otro producto  (1. si) / (2. no )?\n");
        byte op = Leer().nextByte();
        switch (op) {
            case 1:
                Facturar(acc);
                break;
            default:
                 WriteT("Ingresa el tipo de documento");
                 String tipod=Leer().nextLine();

                 WriteT("Ingresa el numero de documento");
                 Long document=Leer().nextLong();
                 WriteT("Ingresa la direccion");
                 String direccion=Leer().nextLine();
                 WriteT("ingresa el telefono");
                 String tel=Leer().nextLine();
                  Cliente cliente = new Cliente(tipod,document,direccion,tel);
                  ListaClientes.add(cliente);
                  Factura fact = new Factura();
                  fact.setCliente(cliente);
                  facturas.add(fact);
                MenuCajero();
                break;
        }

        //TipoDoc, NoDocumento, Direccion, Telefono
    }

    public static void ImprimirF() {
        
        DetalleFactura.Show();

    }

    public static void MenuCajero() {
        existenciaP=true;
        System.out.println("***********Menú Cajero***********");
        System.out.println("1.)facturar\n2.)Ver factura guardadas(cliente)\n3.)borrar factura\n4.)atras\n0.)salir\n");
        byte eleccion = Leer().nextByte();

        switch (eleccion) {
            case 0:
                System.exit(0);
            case 1:
                //facturar
                if (existenciaP) {
                    Facturar(acc);
                    
                }else{
                    System.out.println("no hay productos, pide al administrador que añada alguno");
                    MenuRoles();
                    System.out.println("");
                }

                break;
            case 2:
                ImprimirF();
                System.out.println("");
                break;
            case 4:
            MenuRoles();
                System.out.println("");
                break;

            default:
            MenuCajero();
                System.out.println("");

        }
    }

    public static void WriteT(String texto) {
        System.out.println(texto);

    }

    public static Scanner Leer() {
        return new Scanner(System.in);
    }

}
