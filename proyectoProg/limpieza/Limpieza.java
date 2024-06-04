package proyectoProg.limpieza;
import java.util.ArrayList;
import java.util.List;
import proyectoProg.facturacion.Factura;


public class Limpieza {

    public List<Reserva> reservas;
    public List<Servicio> servicios;
    public List<Factura> facturas;

    public Limpieza(){
    this.reservas = new ArrayList<Reserva>();
    this.servicios = new ArrayList<Servicio>();
    this.facturas = new ArrayList<Factura>();
    
    }

    /**
     * 
     * Agregar Reserva al programa.
     * 
     * @param reserva la cual queremos agregar
     */

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("La reserva N° '" + reserva.getNumeroReserva()+  "' se agrego correctamente al sistema.");

    }

    /**
     * Agregar Factura al programa
     * 
     * 
     * @param factura la cual queremos agregar.
     */

    public void agregarFactura(Factura factura) {
        this.facturas.add(factura);
    }

    /**
     * Agrega Servicio al programa.
     * 
     * 
     * @param servicio el cual queremos agregar.
     */

    public void agregarServicio(Servicio servicio){
        this.servicios.add(servicio);
        System.out.println("La servicio   '" + servicio.getNombre() +  "' se agrego correctamente a nuestro sistema.");
    }


    /**
     * 
     * Consultar reservas activas.
     *      * 
     * @return lista de reservas activas
     */
    public List<Reserva> consultarReservaActivas() {
        List<Reserva> reservasActivas = new ArrayList<>();
         for (Reserva reserva : this.reservas) {
            if (reserva.getEstadoReserva().equals("Activa"))  {
                reservasActivas.add(reserva);
            }
        }
        return reservasActivas;
    }

    /**
     * Eliminar Reserva
     * 
     * @param reserva la cual queremos eliminar del programa.
     */

    public void eliminarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.remove(reserva);
            System.out.println("La reserva N° '" + reserva.getNumeroReserva()+  "' se elimino correctamente de nuestro sistema.");
        }else {
            System.out.println("La reserva no existe o ya se ha eliminado del sistema.."); 
        }
    }

    /**
     * 
     * Consultar Reservas que haya realizado el cliente.
     * 
     * 
     * @param cliente el cual queremos consultar sus reservas.
     * @return lista de reservas del cliente.
     */

    public List<Reserva> consultarReservasPorCliente(Cliente cliente) {
        List<Reserva> reservaCliente = new ArrayList<>();
        for (Reserva reserva : this.reservas) {
            if (reserva.getCliente().equals(cliente)) {
                reservaCliente.add(reserva);
            }
        }
        return reservaCliente;
    }
    
    /**
     * 
     * Consultar Factura Por cliente
     * 
     * @param cliente el cual consultaremos su factura.
     * @return lista de facturas por cliente.
     */
    
    public List<Factura> consultarFacturaPorCliente(Cliente cliente) {
        List<Factura> facturaCliente = new ArrayList<>();
        for (Factura factura : this.facturas) {
            if (factura.getCliente().equals(cliente)) {
                facturaCliente.add(factura);
            }
        }
        return facturaCliente;
    }

    /**
     * Calcular duracion total de las reservas del cliente.
     * 
     * @param cliente el cual queremos calcular su duracion.
     */

    public void calcularDuracionTotalReservasPorCliente(Cliente cliente) {
        int duracionTotal = 0;
        for (Reserva reserva : this.reservas) {
            if (reserva.getCliente().equals(cliente)) {
                duracionTotal += reserva.getHorasReserva();
            }
        }
        System.out.println("Duracion total de reservas para Cliente: " + duracionTotal + " horas");
    }
    
}
