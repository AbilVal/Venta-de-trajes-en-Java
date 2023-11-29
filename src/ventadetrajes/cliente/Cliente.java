package ventadetrajes.cliente;

import java.util.Scanner;

/**
 *
 * @author avaldiviesoc
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String pagoElectronico;

    public Cliente(String nombre, String direccion, String telefono, String pagoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pagoElectronico = pagoElectronico;
    }
    
    public static Cliente obtenerDatosCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente (sin apellidos): ");
        String nombre = scanner.next();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.next();
        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = scanner.next();
        System.out.print("Ingrese el método de pago electrónico del cliente (ej. Tarjeta de crédito, PayPal, Transferencia bancaria): ");
        String pagoElectronico = scanner.next();
        return new Cliente(nombre, direccion, telefono, pagoElectronico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPagoElectronico() {
        return pagoElectronico;
    }

    public void setPagoElectronico(String pagoElectronico) {
        this.pagoElectronico = pagoElectronico;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Pago Electrónico: " + pagoElectronico);
        System.out.println("---------------");
    }
}