package com.example.fx_dz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextArea tipArea;

    @FXML
    private TextField field;

    public void onClickAddButton(ActionEvent actionEvent) {
        final String text = field.getText();
        if(!text.isEmpty() && text!=null){
            tipArea.appendText(text + "\n");
        }
        field.clear();

    }
}