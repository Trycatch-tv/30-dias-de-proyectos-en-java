
import java.util.Date;

public class Prestamo {
    Socio socio;
    Libro libro;
    Date fechaRetiro;
    boolean estadoP = false;
    Date fechaDevolucion;

    public Prestamo(Date fechaRetiro, Libro libro, Socio socio, boolean estadoP, Date fechaDevolucion) {
        this.fechaRetiro = fechaRetiro;
        this.libro = libro;
        this.socio = socio;
        this.estadoP = estadoP;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFecha() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public boolean isEstadoP() {
        return estadoP;
    }

    public void setEstadoP(boolean estadoP) {
        this.estadoP = estadoP;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
}
