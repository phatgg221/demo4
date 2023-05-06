package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Text text1;
    private Text text2;

    @FXML
    protected void onHelloButtonClick() {
       text1.setVisible(true);
    }
}