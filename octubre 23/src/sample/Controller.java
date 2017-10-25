package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txtExistencia;
    public TextField txtCompra;
    public Button btnComprar;

    public void realizarComparacion(ActionEvent actionEvent) {
        if (!txtCompra.getText().isEmpty() && !txtExistencia.getText().isEmpty()) {
        }
    }
}

