package ub.ub;

import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class HelloController {
    @FXML
    private Pane menu;
    @FXML
    private Pane game;
    @FXML
    private Pane close;
    @FXML
    private Pane phone_pane;
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
    private Button half;
    @FXML
    private Button phone;
    @FXML
    private Label k;
    @FXML
    private Label dialog;


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
    public void changequestion(String id) {

        if (id.equals(questions[counter][5])) {
            counter++;
            k.setText(questions[counter][0]);
            a.setText(questions[counter][1]);
            b.setText(questions[counter][2]);
            c.setText(questions[counter][3]);
            d.setText(questions[counter][4]);
        } else {
            close.setVisible(true);
        }
    }

    // Gomb események
    @FXML
    private void startgame() {
        k.setText(questions[counter][0]);
        a.setText(questions[counter][1]);
        b.setText(questions[counter][2]);
        c.setText(questions[counter][3]);
        d.setText(questions[counter][4]);
        menu.setVisible(false);
        game.setVisible(true);

    }

    @FXML
    private void a_push() {
        changequestion(a.getId());
        b.setVisible(true);
        c.setVisible(true);
        d.setVisible(true);
        phone_pane.setVisible(false);
    }

    @FXML
    private void b_push() {
        changequestion(b.getId());
        a.setVisible(true);
        c.setVisible(true);
        d.setVisible(true);
        phone_pane.setVisible(false);
    }

    @FXML
    private void c_push() {
        changequestion(c.getId());
        a.setVisible(true);
        b.setVisible(true);
        d.setVisible(true);
        phone_pane.setVisible(false);
    }

    @FXML
    private void d_push() {
        changequestion(d.getId());
        a.setVisible(true);
        b.setVisible(true);
        c.setVisible(true);
        phone_pane.setVisible(false);
    }

    @FXML
    private void exit_push() {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }
    //Felezés segítség
    @FXML
    private void half_push() {
        String buttonid = questions[counter][5];
        Random rand = new Random();
        int randomnum = rand.nextInt((3 - 1) + 1) + 1;
        if (buttonid.equals("a")) {
            if (randomnum == 1) {
                b.setVisible(false);
                c.setVisible(false);
            }
            if (randomnum == 2) {
                b.setVisible(false);
                d.setVisible(false);
            }
            if (randomnum == 3) {
                c.setVisible(false);
                d.setVisible(false);
            }
        }
        if (buttonid.equals("b")) {
            if (randomnum == 1) {
                a.setVisible(false);
                c.setVisible(false);
            }
            if (randomnum == 2) {
                a.setVisible(false);
                d.setVisible(false);
            }
            if (randomnum == 3) {
                c.setVisible(false);
                d.setVisible(false);
            }
        }
        if (buttonid.equals("c")) {
            if (randomnum == 1) {
                a.setVisible(false);
                b.setVisible(false);
            }
            if (randomnum == 2) {
                a.setVisible(false);
                d.setVisible(false);
            }
            if (randomnum == 3) {
                b.setVisible(false);
                d.setVisible(false);
            }
        }
        if (buttonid.equals("d")) {
            if (randomnum == 1) {
                a.setVisible(false);
                b.setVisible(false);
            }
            if (randomnum == 2) {
                a.setVisible(false);
                c.setVisible(false);
            }
            if (randomnum == 3) {
                b.setVisible(false);
                c.setVisible(false);
            }
        }
        half.setTextFill(Color.RED);
        half.setDisable(true);


    }
    //Telefonos segítség
    @FXML
    private void phone_push() {

        phone_pane.setVisible(true);
        phone.setTextFill(Color.RED);
        phone.setDisable(true);


        Runnable task = () -> {
            try {

                String[] answers = {"Csörög...", "Szia! Várjál, had gonodlkozzak...", "Nem vagyok benne biztos, de talán...", "Szerintem a "+questions[counter][5].toUpperCase() +" lesz a jó válasz!" };

                for (int i = 0; i < 4; i++) {
                    int index = i;
                    Platform.runLater(() -> {
                        dialog.setText(answers[index]);
                    });

                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(task).start();

    }
}








