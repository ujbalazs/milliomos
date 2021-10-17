package ub.ub;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class HelloController {
    @FXML
    private Pane menu;
    @FXML
    private Pane game;
    @FXML
    private Pane close;
    @FXML
    private Button a;
    @FXML
    private Button b;
    @FXML
    private Button c;
    @FXML
    private Button d;
    @FXML
    private Button exit;
    @FXML
    private Label k;


    // Kérdések
    String[][] questions = {
            {"Első kérdés?", "egy a valasz", "egy b valasz helyes", "egy c valasz", "egy d valasz", "b"},
            {"Masodik kérdés?", "kettő a valasz", "kettő b valasz", "kettő c valasz helyes", "kettő d valasz", "c"},
            {"Harmadik kérdés?", "harmadik a valasz", "harmadik b valasz", "harmadik c valasz", "harmadik d valasz helyes", "d"},
            {"Negyedik kérdés?", "negyedik a valasz", "negyedik b valasz", "negyedik c valasz", "negyedik d valasz helyes", "d"},
            {"Ötödik kérdés?", "ötödik a valasz helyes", "ötödik b valasz", "ötödik c valasz", "ötödik d valasz", "a"},
    };
    // Számláló amit növelek
    int counter = 0;

    // Kérdésváltó
    public void changequestion(String id){

        if(id.equals(questions[counter][5])){
            counter++;
            k.setText(questions[counter][0]);
            a.setText(questions[counter][1]);
            b.setText(questions[counter][2]);
            c.setText(questions[counter][3]);
            d.setText(questions[counter][4]);
        }
        else{
            close.setVisible(true);
        }
    }

    // Gomb események
    @FXML
    private void startgame(){
        k.setText(questions[counter][0]);
        a.setText(questions[counter][1]);
        b.setText(questions[counter][2]);
        c.setText(questions[counter][3]);
        d.setText(questions[counter][4]);
        menu.setVisible(false);
        game.setVisible(true);

    }
    @FXML
    private void a_push(){
      changequestion(a.getId());
    }
    @FXML
    private void b_push(){
        changequestion(b.getId());
    }
    @FXML
    private void c_push(){
        changequestion(c.getId());
    }
    @FXML
    private void d_push(){
        changequestion(d.getId());
    }
    @FXML
    private void exit_push(){
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }





    }



