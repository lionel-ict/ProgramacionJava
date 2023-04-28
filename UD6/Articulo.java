package UD6;

public class Articulo {
    
    // ATRIBUTOS

    private final String nombre;
    private double precio;
    private int cuantosHay;

    public static int iva = 21;

    // CONTRUCTORES

    public Articulo(String n, double p, int c){
        this.nombre = n;
        this.precio = p;
        this.cuantosHay = c;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0)
            System.out.println("ERROR: El precio no puede ser negativo ni cero");
        else
            this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        if (iva <= 0)
            System.out.println("ERROR: El iva no puede ser negativo");
        else
            this.iva = iva;
    }

    public int getCuantosHay() {
        return cuantosHay;
    }

    // OTROS MÉTODOS

    public String toString() {
        return ("Nombre: " + nombre + " Precio: " + precio + " IVA: " + iva + " Cuantos: " + cuantosHay);
    }

    // Vendemos una cantidad de este artículo.
    public void vender(int cuantosVender){
        if (cuantosVender <= 0 ) {
            System.out.println("ERROR: No se puede vender cero ni negativos");
        }
        else if (cuantosVender > cuantosHay) {
            System.out.println("ERROR: No se pueden vender, no hay tantos.");
        }
        else {
            cuantosHay -= cuantosVender;
            System.out.println("Se han vendido. Salen de almacen");
        }
    }

    public void comprar(int cuantosComprar){
        if (cuantosComprar <= 0 ) {
            System.out.println("ERROR: No se puede comprar cero ni negativos");
        }
        else {
            cuantosHay += cuantosComprar;
            System.out.println("Se han Comprado. Entran al almacen");
        }
    }

    
    

    

}
