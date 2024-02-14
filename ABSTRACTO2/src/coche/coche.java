package coche;

public class coche {
	 private String marca;
	    private String modelo;
	    private int año;
	    private String color;

	    public coche() {
	        this.marca = "Sin marca";
	        this.modelo = "Sin modelo";
	        this.año = 0;
	        this.color = "Sin color";
	    }

	    public coche(String marca, String modelo) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.año = 0;
	        this.color = "Sin color";
	    }


	    public coche(String marca, String modelo, int año) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.año = año;
	        this.color = "Sin color";
	    }


	    public coche(String marca, String modelo, int año, String color) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.año = año;
	        this.color = color;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public int getAño() {
	        return año;
	    }

	    public void setAño(int año) {
	        this.año = año;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public void imprimirDetalles() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Año: " + año);
	        System.out.println("Color: " + color);
	    }


	    public static void main(String[] args) {
	    	
	        coche coche1 = new coche(); 
	        coche coche2 = new coche("SEAT", "LEON"); 
	        coche coche3 = new coche("FERRARI", "PAGANE", 2008); 
	        coche coche4 = new coche("FORD", "FOCUS", 2023, "BLANCO");

	       
	        System.out.println("Coche 1:");
	        coche1.imprimirDetalles();
	        System.out.println();

	        System.out.println("Coche 2:");
	        coche2.imprimirDetalles();
	        System.out.println();

	        System.out.println("Coche 3:");
	        coche3.imprimirDetalles();
	        System.out.println();

	        System.out.println("Coche 4:");
	        coche4.imprimirDetalles();
	    }
	}