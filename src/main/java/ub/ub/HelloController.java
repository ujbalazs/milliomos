package ub.ub;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;



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
    @FXML
    private Pane audience_pane;
    @FXML
    private Button audience;
    @FXML
    private BarChart<String, Number> audience_chart;
    @FXML
    private Label a_chart;
    @FXML
    private Label b_chart;
    @FXML
    private Label c_chart;
    @FXML
    private Label d_chart;
    @FXML
    private Label question_click;




    Questions q = new Questions();

    // Számlálók
    int counter = 0;
    int assigment_counter_a = 0;
    int assigment_counter_b = 0;
    int assigment_counter_c = 0;
    int assigment_counter_d = 0;


    Random rand = new Random();

    // Kérdésváltó
    public void changequestion(String id) {

        if (id.equals(q.questions[counter][5])) {
            counter++;
            k.setText(q.questions[counter][0]);
            a.setText(q.questions[counter][1]);
            b.setText(q.questions[counter][2]);
            c.setText(q.questions[counter][3]);
            d.setText(q.questions[counter][4]);
        } else {
            close.setVisible(true);
        }
    }

    // Gomb események
    @FXML
    private void startgame() {
        k.setText(q.questions[counter][0]);
        a.setText(q.questions[counter][1]);
        b.setText(q.questions[counter][2]);
        c.setText(q.questions[counter][3]);
        d.setText(q.questions[counter][4]);
        menu.setVisible(false);
        game.setVisible(true);

    }

    @FXML
    private void a_push() {
        assigment_counter_a++;
        assigment_counter_b = 0;
        assigment_counter_c = 0;
        assigment_counter_d = 0;
        b.setTextFill(Color.BLACK);
        c.setTextFill(Color.BLACK);
        d.setTextFill(Color.BLACK);

        if(assigment_counter_a == 1){
            a.setTextFill(Color.DARKORANGE);
            question_click.setVisible(true);
        }

        if(assigment_counter_a == 2){
        changequestion(a.getId());
        b.setVisible(true);
        c.setVisible(true);
        d.setVisible(true);
        phone_pane.setVisible(false);
        assigment_counter_a = 0;
        question_click.setVisible(false);
        a.setTextFill(Color.BLACK);}
    }

    @FXML
    private void b_push() {
        assigment_counter_b++;
        assigment_counter_a = 0;
        assigment_counter_c = 0;
        assigment_counter_d = 0;
        a.setTextFill(Color.BLACK);
        c.setTextFill(Color.BLACK);
        d.setTextFill(Color.BLACK);

        if(assigment_counter_b == 1){
            question_click.setVisible(true);
            b.setTextFill(Color.DARKORANGE);}

        if(assigment_counter_b == 2){
        changequestion(b.getId());
        a.setVisible(true);
        c.setVisible(true);
        d.setVisible(true);
        phone_pane.setVisible(false);
        audience_pane.setVisible(false);
        assigment_counter_b = 0;
        question_click.setVisible(false);
        b.setTextFill(Color.BLACK);}
    }

    @FXML
    private void c_push() {
        assigment_counter_c++;
        assigment_counter_a = 0;
        assigment_counter_b = 0;
        assigment_counter_d = 0;
        a.setTextFill(Color.BLACK);
        b.setTextFill(Color.BLACK);
        d.setTextFill(Color.BLACK);

        if(assigment_counter_c == 1){
            question_click.setVisible(true);
            c.setTextFill(Color.DARKORANGE);}

        if(assigment_counter_c == 2){
        changequestion(c.getId());
        a.setVisible(true);
        b.setVisible(true);
        d.setVisible(true);
        phone_pane.setVisible(false);
        audience_pane.setVisible(false);
        assigment_counter_c = 0;
        question_click.setVisible(false);
        c.setTextFill(Color.BLACK);}
    }

    @FXML
    private void d_push() {
        assigment_counter_d++;
        assigment_counter_a = 0;
        assigment_counter_b = 0;
        assigment_counter_c = 0;
        a.setTextFill(Color.BLACK);
        b.setTextFill(Color.BLACK);
        c.setTextFill(Color.BLACK);

        if(assigment_counter_d == 1){
            question_click.setVisible(true);
            d.setTextFill(Color.DARKORANGE);}

        if(assigment_counter_d == 2){
        changequestion(d.getId());
        a.setVisible(true);
        b.setVisible(true);
        c.setVisible(true);
        phone_pane.setVisible(false);
        audience_pane.setVisible(false);
        assigment_counter_d = 0;
        question_click.setVisible(false);
        d.setTextFill(Color.BLACK);}
    }

    @FXML
    private void exit_push() {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }
    //Felezés segítség
    @FXML
    private void half_push() {
        String buttonid = q.questions[counter][5];
        int randomnum = rand.nextInt(4 - 1) + 1;
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

                String[] answers = {"Csörög...", "Szia! Várjál, had gonodlkozzak...", "Nem vagyok benne biztos, de talán...", "Szerintem a "+q.questions[counter][5].toUpperCase() +" lesz a jó válasz!" };

                for (int i = 0; i < 4; i++) {
                    int index = i;
                    Platform.runLater(() -> dialog.setText(answers[index]));

                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(task).start();

    }
    @FXML
    private void audience_push(){
        audience_pane.setVisible(true);
        audience.setTextFill(Color.RED);
        audience.setDisable(true);

        XYChart.Series<String, Number> aud = new XYChart.Series<>();
        aud.setName("Szavazatok");

        int one_random = rand.nextInt(100 - 26) + 26;
        int supp_number_one = 100 - one_random;
        int two_random = rand.nextInt(supp_number_one);
        int supp_number_two = supp_number_one - two_random;
        int three_random = rand.nextInt(supp_number_two);
        int four_random = supp_number_two - three_random;


        if(q.questions[counter][5].equals("a")){

            aud.getData().add(new XYChart.Data<>("", one_random));
            a_chart.setText("A: "+one_random+"%");
            aud.getData().add(new XYChart.Data<>(" ", two_random));
            b_chart.setText("B: "+two_random+"%");
            aud.getData().add(new XYChart.Data<>("  ", three_random));
            c_chart.setText("C: "+three_random+"%");
            aud.getData().add(new XYChart.Data<>("   ", four_random));
            d_chart.setText("D: "+four_random+"%");

            audience_chart.getData().add(aud);
        }

        if(q.questions[counter][5].equals("b")){

            aud.getData().add(new XYChart.Data<>("", two_random));
            a_chart.setText("A: "+two_random+"%");
            aud.getData().add(new XYChart.Data<>(" ", one_random));
            b_chart.setText("B: "+one_random+"%");
            aud.getData().add(new XYChart.Data<>("  ", three_random));
            c_chart.setText("C: "+three_random+"%");
            aud.getData().add(new XYChart.Data<>("   ", four_random));
            d_chart.setText("D: "+four_random+"%");

            audience_chart.getData().add(aud);
        }

        if(q.questions[counter][5].equals("c")){

            aud.getData().add(new XYChart.Data<>("", two_random));
            a_chart.setText("A: "+two_random+"%");
            aud.getData().add(new XYChart.Data<>(" ", three_random));
            b_chart.setText("B: "+three_random+"%");
            aud.getData().add(new XYChart.Data<>("  ", one_random));
            c_chart.setText("C: "+one_random+"%");
            aud.getData().add(new XYChart.Data<>("   ", four_random));
            d_chart.setText("D: "+four_random+"%");

            audience_chart.getData().add(aud);
        }

        if(q.questions[counter][5].equals("d")){

            aud.getData().add(new XYChart.Data<>("", two_random));
            a_chart.setText("A: "+two_random+"%");
            aud.getData().add(new XYChart.Data<>(" ", three_random));
            b_chart.setText("B: "+three_random+"%");
            aud.getData().add(new XYChart.Data<>("  ", four_random));
            c_chart.setText("C: "+four_random+"%");
            aud.getData().add(new XYChart.Data<>("   ", one_random));
            d_chart.setText("D: "+one_random+"%");

            audience_chart.getData().add(aud);
        }


    }


}









