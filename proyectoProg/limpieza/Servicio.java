package proyectoProg.limpieza;

public class Servicio {

    private String nombre;
    private String tipo;
    private double precio;
    private String descripcion;
    private Empleado empleado;

    public Servicio(

    String nombre,
    String tipo,
    double precio,
    String descripcion,
    Empleado empleado

    ){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.empleado = empleado;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public void setEmpleado(Empleado empleado){
        this.empleado = empleado;
    }

    public String toString() {
        return "\nEmpleado encargado: " + getEmpleado().nombre + getEmpleado().apellido + "\nTipo:" + tipo   + "\nServicio: " + descripcion + "\n" ;
    }
    
}
