package ventadetrajes.prenda;

/**
 *
 * @author avaldiviesoc
 */
import java.util.ArrayList;
import java.util.List;
import ventadetrajes.estado.Estado;

public class Prenda {
    private String tipo;
    private ArrayList<Estado> estados;
    private String categoria;
    private double costoProduccion;
    private double costoRenta;
    private double costoVenta;

    public Prenda(String tipo, ArrayList<Estado> estados, String categoria, double costoProduccion, double costoRenta, double costoVenta) {
        this.tipo = tipo;
        this.estados = estados;
        this.categoria = categoria;
        this.costoProduccion = costoProduccion;
        this.costoRenta = costoRenta;
        this.costoVenta = costoVenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public double getCostoRenta() {
        return costoRenta;
    }

    public void setCostoRenta(double costoRenta) {
        this.costoRenta = costoRenta;
    }

    public double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(double costoVenta) {
        this.costoVenta = costoVenta;
    }
    public void mostrarInfoBasica() {
        System.out.println("Tipo de Prenda: " + tipo);
        System.out.print("Estados: ");
        for (Estado estado : estados) {
            System.out.print(estado.getNombre() + " ");
        }
        System.out.println("\n---------------");
    }
    
    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Estados: " + obtenerNombresEstados());
        System.out.println("Categoría: " + categoria);
        System.out.println("Costo de Producción: $" + costoProduccion);
        System.out.println("Costo de Renta: $" + costoRenta);
        System.out.println("Costo de Venta: $" + costoVenta);
        System.out.println("---------------");
    }

    private String obtenerNombresEstados() {
        List<String> nombresEstados = new ArrayList<>();
        for (Estado estado : estados) {
            nombresEstados.add(estado.getNombre());
        }
        return String.join(", ", nombresEstados);
    }
}
