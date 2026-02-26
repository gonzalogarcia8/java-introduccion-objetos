package DAW;

/**
 * Descripcion de la clase clionte
 * @author Gonzalo
 * @version 1.0
 */
public class Cliente {

    private String nombre;
    private String documento;
    private String telefono;

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }



    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
