package ExercisesJava.ExerciseEight.agendaContactos;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public interface Agenda {


    private void showAddAlert() {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText("Rellene todos los campos");
        alert.show();
    }

    private void showDeleteAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText("El contacto seleccionado no existe");
        alert.show();
    }

    public default EventHandler<ActionEvent> addButtonAction(ObservableList datos, TextField contacto, TextField numero, TextField correo){

        return actionEvent -> {
            String nombre = contacto.getText();
            String number = numero.getText();
            String mail = correo.getText();

            if (nombre.isEmpty()|| number.isEmpty()|| mail.isEmpty()) {
                showAddAlert();

            } else {

                datos.add(new Contact(nombre, number, mail));

                contacto.clear();
                numero.clear();
                correo.clear();

            }

        };

    }

    public default EventHandler<ActionEvent> deleteButtonAction(ObservableList datos, TableView<Contact> tableView) {
        return actionEvent -> {

            Contact selectedContact = tableView.getSelectionModel().getSelectedItem();

            if (selectedContact != null) {

                datos.remove(selectedContact);
            } else {
                showDeleteAlert();
            }



        };

    }


}
