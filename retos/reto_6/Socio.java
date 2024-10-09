public class Socio {
    int numero;
    String nombreCompleto;
    String direccion;
    
    public Socio(int numero, String nombreCompleto, String direccion) {
        this.numero = numero;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
