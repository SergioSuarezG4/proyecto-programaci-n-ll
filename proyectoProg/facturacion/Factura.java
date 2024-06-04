package proyectoProg.facturacion;

import java.time.LocalDate;

import proyectoProg.limpieza.Cliente;
import proyectoProg.limpieza.Reserva;
import proyectoProg.limpieza.Servicio;


public class Factura implements Descuento {

    private LocalDate fechaFacturacion;
    private Reserva reserva;
    private Servicio servicio;
    private Cliente cliente;


    public Factura(
    Reserva reserva,
    Servicio servicio,
    Cliente cliente,
    LocalDate fechaFacturacion


    ) {
        this.reserva = reserva;
        this.servicio = servicio;
        this.cliente = cliente;
        this.fechaFacturacion = LocalDate.now();
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }
    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }
    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public Servicio getServicio() {
        return servicio;
    }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public double calcularTotal() {
        return servicio.getPrecio();
    }

    public double calcularTotalDescuento() {
        if(reserva.getHorasReserva() > 5){
            double calculoPorcentaje = calcularTotal() * 0.1;
            return calcularTotal() - calculoPorcentaje;
        }else{
            return calcularTotal();
        }
    }

    public void mostrarDetalles() {
        System.out.println("\n Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Fecha: " + fechaFacturacion);
        System.out.println("Servicio: " + servicio.getDescripcion()+ " (" + reserva.getHorasReserva() + " horas)");
        System.out.println("Total a pagar: " + calcularTotal());
        System.out.println("Total con Descuento : " + calcularTotalDescuento());

    }

    @Override
    public String toString() {
        return 
        "\nCliente : " + reserva.getCliente().getNombre()+ 
        "\nFecha: " +  fechaFacturacion +
        "\nServicio: " + servicio.getDescripcion()+ " (" + reserva.getHorasReserva() + " horas)" +
        "\nTotal a pagar: " + calcularTotal() +
        "\nTotal con Descuento : " + calcularTotalDescuento() + "\n";
    }
}
