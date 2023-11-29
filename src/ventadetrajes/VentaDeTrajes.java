package ventadetrajes;

/**
 *
 * @author avaldiviesoc
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ventadetrajes.cliente.Cliente;
import ventadetrajes.estado.Estado;
import ventadetrajes.operacionestienda.OperacionesTienda;
import ventadetrajes.prenda.Prenda;


public class VentaDeTrajes {

    public static void main(String[] args) {
        List<Prenda> inventario = new ArrayList<>();

        Estado oaxaca = new Estado("Oaxaca", "Sureste");
        Estado chiapas = new Estado("Chiapas", "Sureste");
        Estado puebla = new Estado("Puebla", "Centrosur");
        Estado guanajuato = new Estado("Guanajuato", "Centronorte");
        Estado jalisco = new Estado("Jalisco", "Noroeste");

        ArrayList<Estado> estadosPrenda1 = new ArrayList<>(List.of(oaxaca, chiapas));
        Prenda prenda1 = new Prenda("Sombrero", estadosPrenda1, "Gala", 100, 50, 150);

        ArrayList<Estado> estadosPrenda2 = new ArrayList<>(List.of(puebla));
        Prenda prenda2 = new Prenda("Blusa", estadosPrenda2, "Común", 80, 30, 100);
        
        ArrayList<Estado> estadosPrenda3 = new ArrayList<>(List.of(guanajuato, chiapas));
        Prenda prenda3 = new Prenda("Pantalón", estadosPrenda3, "Gala", 200, 100, 250);

        ArrayList<Estado> estadosPrenda4 = new ArrayList<>(List.of(jalisco));
        Prenda prenda4 = new Prenda("Falda", estadosPrenda4, "Común", 170, 120, 230);
        
        ArrayList<Estado> estadosPrenda5 = new ArrayList<>(List.of(jalisco));
        Prenda prenda5 = new Prenda("Zapato", estadosPrenda5, "Gala", 400, 250, 600);
        
        inventario.add(prenda1);
        inventario.add(prenda2);
        inventario.add(prenda3);
        inventario.add(prenda4);
        inventario.add(prenda5);
        
        System.out.println("Tipo de Prenda: ");
        for (Prenda prenda : inventario) {
            System.out.println(prenda.getTipo());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea rentar o vender? ");
        String accion = scanner.next().toLowerCase();

        Cliente cliente = null;

        if (accion.equals("rentar")) {
            cliente = Cliente.obtenerDatosCliente(scanner);
            OperacionesTienda.rentarPrendas(cliente, inventario);
        } else if (accion.equals("vender")) {
            System.out.print("¿Desea registrarse? (si/no): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("si")) {
                cliente = Cliente.obtenerDatosCliente(scanner);
            }

            OperacionesTienda.venderPrendas(cliente, inventario);
        }
    }
}