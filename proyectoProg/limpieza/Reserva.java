package proyectoProg.limpieza;

import java.time.LocalDate;

public class Reserva {

    private int numeroReserva;
    private String direccionReserva;
    private LocalDate fechaReserva;
    private String estadoReserva;
    private int horasReserva;
    private Cliente cliente;
    private Servicio servicio;

    public Reserva(
    Cliente cliente,
    Servicio servicio,
    int numeroReserva,
    String direccionReserva, 
    LocalDate fechaReserva, 
    String estadoReserva,
    int horasReserva
  
    ){
        this.numeroReserva = numeroReserva;
        this.direccionReserva = direccionReserva;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
        this.horasReserva = horasReserva;
        this.cliente = cliente;
        this.servicio = servicio;
    
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }
    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }
    public String getDireccionReserva() {
        return direccionReserva;
    }
    public void setDireccionReserva(String direccionReserva) {
        this.direccionReserva = direccionReserva;
    }
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public String getEstadoReserva() {
        return estadoReserva;
    }
    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    public int getHorasReserva() {
        return horasReserva;
    }
    public void setHorasReserva(int horasReserva) {
        this.horasReserva = horasReserva;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Servicio getServicio() {
        return servicio;
    }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "\nReserva  N° " + numeroReserva + ", Estado : " + estadoReserva + "\nServicio:" + servicio.getDescripcion() +"\nFecha: " + fechaReserva + ", Cliente :" + cliente.getNombre() + "\n" ;
    }

}
