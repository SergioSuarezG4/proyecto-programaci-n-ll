package proyectoProg;

import java.time.LocalDate;
import java.util.List;
import proyectoProg.facturacion.Factura;
import proyectoProg.limpieza.Cliente;
import proyectoProg.limpieza.Empleado;
import proyectoProg.limpieza.Limpieza;
import proyectoProg.limpieza.Reserva;
import proyectoProg.limpieza.Servicio;

public class MainLimpieza {

    public static void main(String[] args) {

       //Crear limpieza
       Limpieza limpieza = new Limpieza();

       //CREAR CLIENTES
        Cliente cliente1 = new Cliente(1, "Sergio Alejandro", "Suarez", 
        "3148387013", "Carrera 21", null);
        Cliente cliente2 = new Cliente(2, "Juan Alejandro", "Bermudez", 
        "8238412", "Conjuto Cerro", null);

        //CREAR EMPLEADOS
        Empleado Empleado1 = new Empleado(1, "Arnulfo ", "Dominguez", 
        "1231232", "Casa 3", 5000);
        Empleado Empleado2 = new Empleado(2, "Brayant ", "Diaz", 
        "2472614", "FATIMA", 8000);
        Empleado Empleado3 = new Empleado(3, "Kevin ", "Castro", 
        "31173821", "Calle transversal", 10000);

        //CREAR SERVICIOS
        Servicio servicioGeneral = new Servicio("Servicio General", "General", 50000, "Limpieza general de la casa.", Empleado1);
        Servicio servicioProfundo = new Servicio("Servicio Profunda", "Profunda", 100000, "Limpieza a fondo de la casa.",Empleado2); 
        Servicio servicioEspecial = new Servicio("Servicio Especial", "Especial", 120000, "Limpieza especializada de la casa.", Empleado3);
       
        //Agregar Servicios Al sisitema de limpieza
        System.out.println("\n----- AGREGAR SERVICIOS  ----");
        limpieza.agregarServicio(servicioGeneral);
        limpieza.agregarServicio(servicioEspecial);
        limpieza.agregarServicio(servicioProfundo);

        //CREACION DE RESERVAS
        Reserva reserva1 = new Reserva(cliente1, servicioEspecial, 1,
        "Carrera 21", LocalDate.of(2024, 07, 16), "Activa", 8);
        Reserva reserva2 = new Reserva(cliente1, servicioGeneral, 2,
        "Carrera 21", LocalDate.of(2024, 05, 31), "Activa", 5);
        Reserva reserva3 = new Reserva(cliente2, servicioProfundo, 3,
        "Carrera 21", LocalDate.of(2024, 9, 10), "Activa", 5);
        
        //Agregar Reservas Al sisitema de limpieza
        System.out.println("\n----- AGREGAR RESERVAS  ----");
       
        //CREAR FACTURAS DE LAS RESERVAS
        Factura factura1 = new Factura(reserva1, servicioEspecial, cliente1, null);
        Factura factura2 = new Factura(reserva2, servicioGeneral, cliente1, null);
        Factura factura3 = new Factura(reserva3, servicioProfundo, cliente2, null);

        //Agregar Facturas Al sisitema de limpieza
        limpieza.agregarFactura(factura1);
        limpieza.agregarFactura(factura2);
        limpieza.agregarFactura(factura3);

        //Mostrar Informacion Sobre las facturas
        System.out.println("\n----- DETALLES FACTURAS  ----");
        factura1.mostrarDetalles();
        factura2.mostrarDetalles();
        factura3.mostrarDetalles();

       System.out.println("\n----- Reservas Activas ----");
       List<Reserva> reservaActivas = limpieza.consultarReservaActivas();
       System.out.println(reservaActivas);


       System.out.println("\n----- Reservas por CLiente (Alejando) ----");
       List<Reserva> reserva = limpieza.consultarReservasPorCliente(cliente2);
       System.out.println(reserva);

       System.out.println("\n----- Facturas por CLiente (Sergio Alejandro) ----");
       List<Factura> clienteFactura = limpieza.consultarFacturaPorCliente(cliente1);
       System.out.println(clienteFactura);

       System.out.println("\n----- Calcular Salario Empleado ----");
       double salarioEmpleado = Empleado1.calcularSalarioEmpleado(5);
       System.out.println(salarioEmpleado);

       System.out.println("\n----- Duracion de reservas por CLiente (Sergio Alejandro) ----");
       limpieza.calcularDuracionTotalReservasPorCliente(cliente1);
     

       //ELIMINAR RESERVAS DEL SISTEMA
       System.out.println("\n----- Reservas ELIMINADAS ----");
       limpieza.eliminarReserva(reserva1);
       limpieza.eliminarReserva(reserva1); //Ya se elimino.


       System.out.println("\n----- Reservas Activas Despues de Elimnar Reservas ----");
       List<Reserva> reservaActivas2 = limpieza.consultarReservaActivas();
       System.out.println(reservaActivas2);

    }
}
