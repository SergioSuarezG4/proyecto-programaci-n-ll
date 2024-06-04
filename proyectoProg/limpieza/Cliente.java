package proyectoProg.limpieza;

public class Cliente extends Persona {

    private String correoElectronico;

    public Cliente(
    int idPersona, 
    String nombre, 
    String apellido, 
    String telefono, 
    String direccion,
    String correoElectronico
    
    ){
        super(idPersona, nombre, apellido, telefono, direccion);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString(){
        return " Cliente  N° "  + idPersona + ", Nombre: " + nombre + ", Apellido:" + apellido + ", Direccion:" + direccion + " Telefono:" + telefono + "\n" ;
    }
    
}
