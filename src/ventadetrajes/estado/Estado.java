package ventadetrajes.estado;

/**
 *
 * @author avaldiviesoc
 */
public class Estado {
    private String nombre;
    private String region;

    public Estado(String nombre, String region) {
        this.nombre = nombre;
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}