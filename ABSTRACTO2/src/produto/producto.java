package produto;

public class producto {
	 private String nombre;
	    private double precio;
	    private int cantidadEnStock;

	    public producto() {
	        this.nombre = "Sin nombre";
	        this.precio = 0.0;
	        this.cantidadEnStock = 0;
	    }

	    public producto(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.cantidadEnStock = 0;
	    }

	    public producto(String nombre, double precio, int cantidadEnStock) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.cantidadEnStock = cantidadEnStock;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public int getCantidadEnStock() {
	        return cantidadEnStock;
	    }

	    public void setCantidadEnStock(int cantidadEnStock) {
	        this.cantidadEnStock = cantidadEnStock;
	    }

	    public static void main(String[] args) {

	        
	        producto producto2 = new producto("CHANCLA", 10.99);
	        producto producto3 = new producto("SUDADERA", 20.50, 30);



	        System.out.println("Producto 1:");
	        System.out.println("Nombre: " + producto2.getNombre());
	        System.out.println("Precio: " + producto2.getPrecio());
	        System.out.println("Cantidad en stock: " + producto2.getCantidadEnStock());
	        System.out.println();

	        System.out.println("Producto 2:");
	        System.out.println("Nombre: " + producto3.getNombre());
	        System.out.println("Precio: " + producto3.getPrecio());
	        System.out.println("Cantidad en stock: " + producto3.getCantidadEnStock());
	    }
}