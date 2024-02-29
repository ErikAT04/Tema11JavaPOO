package Ej1_3;

public class Persona implements Cliente, Empleado{
    private String dni;
    private String nombre;
    private boolean esCliente;
    private boolean esEmpleado;
    private double saldoCuenta;
    private int numHoras;

    public Persona(String dni, String nombre, boolean esCliente, boolean esEmpleado) {
        this.dni = dni;
        this.nombre = nombre;
        this.esCliente = esCliente;
        this.esEmpleado = esEmpleado;
    }
    public void subirSaldoCliente(double cant){
        if(esCliente){
            this.saldoCuenta += cant;
        } else {
            System.out.println("No es cliente, no se puede hacer");
        }
    }
    public void incrementarNumHoras(int num){
        if(esEmpleado){
            this.numHoras += num;
        } else {
            System.out.println("No es empleado");
        }
    }
}
