package ExercisesJava.ExerciseEight.interfazGraficaFX;

import ExercisesJava.ExerciseEight.agendaContactos.Agenda;
import ExercisesJava.ExerciseEight.agendaContactos.Contact;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class InterfazAgenda extends Application implements Agenda {

    TextField nameTextField;
    TextField numberTextField;
    TextField correoTextField;

    Button addButton;
    Button deleteButton;

    @Override
    public void start(Stage stage) {

        nameTextField = new TextField();
        nameTextField.setPromptText("Nombre");

        numberTextField = new TextField();
        numberTextField.setPromptText("Número");

        correoTextField = new TextField();
        correoTextField.setPromptText("Correo");

        VBox layoutEntrada = new VBox(15);
        layoutEntrada.setPadding(new Insets(10)); // Ajustar el padding
        layoutEntrada.getChildren().addAll(nameTextField, numberTextField, correoTextField);

        TableView<Contact> tableView = new TableView<>();

        TableColumn<Contact, String> columnaNombre = new TableColumn<>("Nombre");
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("contacto"));
        columnaNombre.setMinWidth(155);
        TableColumn<Contact, String> columnaNumero = new TableColumn<>("Número");
        columnaNumero.setCellValueFactory(new PropertyValueFactory<>("numero"));
        columnaNumero.setMinWidth(155);
        TableColumn<Contact, String> columnaCorreo = new TableColumn<>("Correo");
        columnaCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        columnaCorreo.setMinWidth(216);

        tableView.getColumns().add(columnaNombre);
        tableView.getColumns().add(columnaNumero);
        tableView.getColumns().add(columnaCorreo);

        ObservableList<Contact> datos = FXCollections.observableArrayList();
        tableView.setItems(datos);


        addButton = new Button("Añadir");
        addButton.setOnAction(addButtonAction(datos, nameTextField, numberTextField, correoTextField));
        deleteButton = new Button("Eliminar");
        deleteButton.setOnAction(deleteButtonAction(datos, tableView));

        HBox layoutButtons = new HBox(15);
        layoutButtons.setAlignment(Pos.CENTER_RIGHT);
        layoutButtons.setPadding(new Insets(10));
        layoutButtons.getChildren().addAll(addButton, deleteButton);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(layoutEntrada);
        borderPane.setCenter(tableView);
        borderPane.setBottom(layoutButtons);

        Scene scene = new Scene(borderPane, 700, 500);
        stage.setScene(scene);
        stage.setTitle("Interfaz de Agenda");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
