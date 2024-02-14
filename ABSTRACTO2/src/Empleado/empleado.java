package Empleado;
/*1. Implementa una clase llamada Empleado con constructores sobrecargados que permitan
inicializar el nombre, el salario y el departamento del empleado. Luego, en el programa
principal, crea instancias de esta clase utilizando diferentes combinaciones de parámetros en
los constructores para representar empleados con distintas características.
*/
public class empleado {
	private String nombre;
    private double salario;
    private String departamento;

    public empleado() {
        this.nombre = "Sin nombre";
        this.salario = 0.0;
        this.departamento = "Sin departamento";
    }

    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = "Sin departamento";
    }

    public empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    public static void main(String[] args) {
       
        
        empleado empleado2 = new empleado("KEBAB", 2500.0);
        empleado empleado3 = new empleado("Chanquete", 3000.0, "PARLA");


        

        System.out.println("Empleado 1:");
        empleado2.imprimirDetalles();
        System.out.println();

        System.out.println("Empleado 2:");
        empleado3.imprimirDetalles();
    }

}
