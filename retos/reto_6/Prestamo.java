
import java.time.LocalDate;

public class Prestamo {
    Socio socio;
    Libro libro;
    LocalDate fechaRetiro;
    boolean activo;
    LocalDate fechaDevolucion;

    public Prestamo(LocalDate fechaRetiro, Libro libro, Socio socio, boolean activo, LocalDate fechaDevolucion) {
        this.fechaRetiro = fechaRetiro;
        this.libro = libro;
        this.socio = socio;
        this.activo = true;
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFecha() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
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

    public boolean isActivo() {
        return activo;
    }

    public void setEstadoP(boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
}
