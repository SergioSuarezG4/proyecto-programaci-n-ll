package proyectoProg.limpieza;

public class Empleado extends Persona {

    private double salario;
    
    public Empleado(
    int idPersona, 
    String nombre, 
    String apellido, 
    String telefono, 
    String direccion,
    double salario

    ){
        super(idPersona, nombre, apellido, telefono, direccion);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calcularSalarioEmpleado(int horasTrabajadas){
        return horasTrabajadas * getSalario();
    }
    @Override
    public String toString(){
        return " Nombre: "  + nombre + ", Salario hra: " + salario + " Direccion:" + direccion + "\n" ;

    }
    
}
