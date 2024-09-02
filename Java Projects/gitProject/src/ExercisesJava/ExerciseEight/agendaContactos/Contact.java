package ExercisesJava.ExerciseEight.agendaContactos;

public class Contact {

    private String contacto, numero, correo;

    public Contact(String contacto, String numero, String correo) {
        this.contacto = contacto;
        this.numero = numero;
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumero() {
        return numero;
    }



}
