package ventadetrajes.operacionestienda;

/**
 *
 * @author avaldiviesoc
 */
import java.util.List;
import ventadetrajes.cliente.Cliente;
import ventadetrajes.prenda.Prenda;

public class OperacionesTienda {
    public static void rentarPrendas(Cliente cliente, List<Prenda> prendasARentar) {
        double costoTotal = prendasARentar.stream().mapToDouble(Prenda::getCostoRenta).sum();

        System.out.println("\nPrendas a Rentar:");
        for (Prenda prenda : prendasARentar) {
            prenda.mostrarInfoBasica();
        }

        cliente.mostrarInfo();
        System.out.println("Costo Total de Renta: $" + costoTotal);
        System.out.println("---------------");
        System.out.println("¡Gracias por su renta!");
    }

    public static void venderPrendas(Cliente cliente, List<Prenda> prendasAVender) {
        double costoTotal = prendasAVender.stream().mapToDouble(Prenda::getCostoVenta).sum();

        System.out.println("\nPrendas a Vender:");
        for (Prenda prenda : prendasAVender) {
            prenda.mostrarInfoBasica();
        }

        if (cliente != null) {
            cliente.mostrarInfo();
        } else {
            System.out.println("Cliente no registrado");
        }

        System.out.println("Costo Total de Venta: $" + costoTotal);
        System.out.println("---------------");
        System.out.println("¡Gracias por su compra!");
    }
}