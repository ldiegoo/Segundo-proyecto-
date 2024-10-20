package producto;

import cine.Cine;
import producto.tipoProducto.TipoProducto;

public class Producto {
    public String nombre;
    public double precio;
    public TipoProducto tipo;
    public String id;

    // Constructor
    public Producto(String id, String nombre, double precio, TipoProducto tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo=tipo;
        

        

        // Preestablecidos
        Cine cine = new Cine();
        Producto palomitasJumbo = new Producto("001","Palomitas Jumbo", 85, TipoProducto.PALOMITAS);
        cine.listaProductos.add(palomitasJumbo);
        Producto palomitasGrandes = new Producto("002","Palomitas Grandes", 80, TipoProducto.PALOMITAS);
        cine.listaProductos.add(palomitasGrandes);
        Producto palomitasMedianas = new Producto("003","Palomitas Medianas", 75, TipoProducto.PALOMITAS);
        cine.listaProductos.add(palomitasMedianas);
        Producto palomitasChicas = new Producto("004","Palomitas Chicas", 70, TipoProducto.PALOMITAS);
        cine.listaProductos.add(palomitasChicas);
        Producto refrescoCocaCola = new Producto("005","Coca Cola", 42, TipoProducto.BEBIDA);
        cine.listaProductos.add(refrescoCocaCola);
        Producto c = new Producto("006","Squirt", 42, TipoProducto.BEBIDA);
        cine.listaProductos.add(refrescoCocaCola);
        Producto refrescoFanta = new Producto("007","Fanta", 42, TipoProducto.BEBIDA);
        cine.listaProductos.add(refrescoFanta);
        Producto panditas = new Producto("008","Panditas", 30, TipoProducto.SNACKS);
        cine.listaProductos.add(panditas);
        Producto agua = new Producto("009","Agua Natural", 15, TipoProducto.BEBIDA);
        cine.listaProductos.add(agua);
        Producto snickers = new Producto("010","Snickers", 35, TipoProducto.SNACKS);
        cine.listaProductos.add(snickers);
        Producto milkyWays = new Producto("011","MilkyWays", 35, TipoProducto.SNACKS);
        cine.listaProductos.add(milkyWays);
        Producto magnum = new Producto("012","Magnum", 50, TipoProducto.SNACKS);
        cine.listaProductos.add(magnum);
        Producto corneto = new Producto("013","Corneto", 40, TipoProducto.SNACKS);
        cine.listaProductos.add(corneto);
    }


    // Getters n Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoProducto getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }
}
