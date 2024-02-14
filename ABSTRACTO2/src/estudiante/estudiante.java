package estudiante;

public class estudiante {
	  private String nombre;
	    private int edad;
	    private double promedioAcademico;


	    public estudiante() {
	        this.nombre = "Sin nombre";
	        this.edad = 0;
	        this.promedioAcademico = 0.0;
	    }


	    public estudiante(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.promedioAcademico = 0.0; 
	    }

	    public estudiante(String nombre, int edad, double promedioAcademico) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.promedioAcademico = promedioAcademico;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public double getPromedioAcademico() {
	        return promedioAcademico;
	    }

	    public void setPromedioAcademico(double promedioAcademico) {
	        this.promedioAcademico = promedioAcademico;
	    }


	    public void imprimirDetalles() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Promedio académico: " + promedioAcademico);
	    }

	    public static void main(String[] args) {
	        
	        estudiante estudiante1 = new estudiante(); 
	        estudiante estudiante2 = new estudiante("JOSE", 10);
	        estudiante estudiante3 = new estudiante("JUANJO", 25, 10.5);

	        System.out.println("Estudiante 1:");
	        estudiante1.imprimirDetalles();
	        System.out.println();

	        System.out.println("Estudiante 2:");
	        estudiante2.imprimirDetalles();
	        System.out.println();

	        System.out.println("Estudiante 3:");
	        estudiante3.imprimirDetalles();
	    }
	}