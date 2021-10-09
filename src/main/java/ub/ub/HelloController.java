package ub.ub;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;




public class HelloController {
    @FXML
    private Pane menu;
    @FXML
    private Pane game;
    @FXML
    private void startgame(){
        menu.setVisible(false);
        game.setVisible(true);
    }






    }



