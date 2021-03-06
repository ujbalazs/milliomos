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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;




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
    @FXML
    private Label prize;
    @FXML
    private Label lab_a;
    @FXML
    private Label lab_b;
    @FXML
    private Label lab_c;
    @FXML
    private Label lab_d;
    @FXML
    private Label lab_e;
    @FXML
    private Label lab_f;
    @FXML
    private Label lab_g;
    @FXML
    private Label lab_h;
    @FXML
    private Label lab_i;
    @FXML
    private Label lab_j;
    @FXML
    private Label lab_k;
    @FXML
    private Label lab_l;
    @FXML
    private Label lab_m;
    @FXML
    private Label lab_n;
    @FXML
    private Label lab_o;





    Questions q = new Questions();

    // Számlálók
    int counter = 0;
    int assigment_counter_a = 0;
    int assigment_counter_b = 0;
    int assigment_counter_c = 0;
    int assigment_counter_d = 0;


    Random rand = new Random();

    //Eredménytábla
    public void score(){
        switch (counter) {
            case 1 -> {
                lab_a.setTextFill(Color.BLACK);
                lab_b.setTextFill(Color.DARKORANGE);
                prize.setText("Az ön nyereménye:          0 Ft");
            }
            case 2 -> {
                lab_b.setTextFill(Color.BLACK);
                lab_c.setTextFill(Color.DARKORANGE);
            }
            case 3 -> {
                lab_c.setTextFill(Color.BLACK);
                lab_d.setTextFill(Color.DARKORANGE);
            }
            case 4 -> {
                lab_d.setTextFill(Color.BLACK);
                lab_e.setTextFill(Color.DARKORANGE);
            }
            case 5 -> {
                lab_e.setTextFill(Color.WHITE);
                lab_f.setTextFill(Color.DARKORANGE);
                prize.setText("Az ön nyereménye:    100.000 Ft");
            }
            case 6 -> {
                lab_f.setTextFill(Color.BLACK);
                lab_g.setTextFill(Color.DARKORANGE);
            }
            case 7 -> {
                lab_g.setTextFill(Color.BLACK);
                lab_h.setTextFill(Color.DARKORANGE);
            }
            case 8 -> {
                lab_h.setTextFill(Color.BLACK);
                lab_i.setTextFill(Color.DARKORANGE);
            }
            case 9 -> {
                lab_i.setTextFill(Color.BLACK);
                lab_j.setTextFill(Color.DARKORANGE);
            }
            case 10 -> {
                lab_j.setTextFill(Color.WHITE);
                lab_k.setTextFill(Color.DARKORANGE);
                prize.setText("Az ön nyereménye:  1.500.000 Ft");
            }
            case 11 -> {
                lab_k.setTextFill(Color.BLACK);
                lab_l.setTextFill(Color.DARKORANGE);
            }
            case 12 -> {
                lab_l.setTextFill(Color.BLACK);
                lab_m.setTextFill(Color.DARKORANGE);
            }
            case 13 -> {
                lab_m.setTextFill(Color.BLACK);
                lab_n.setTextFill(Color.DARKORANGE);
            }
            case 14 -> {
                lab_n.setTextFill(Color.BLACK);
                lab_o.setTextFill(Color.DARKORANGE);
            }
        }
    }
    // Kérdésváltó
    public void changequestion(String id) {

        if (id.equals(q.questions[counter][5])) {
            counter++;
            k.setText(q.questions[counter][0]);
            a.setText(q.questions[counter][1]);
            b.setText(q.questions[counter][2]);
            c.setText(q.questions[counter][3]);
            d.setText(q.questions[counter][4]);
            if(counter == 15){
                prize.setText("Az ön nyereménye: 40.000.000 Ft");
                close.setVisible(true);
            }
        }
        else {
            close.setVisible(true);
        }
    }

    Media sound = new Media(new File("src/music/music2.mp3").toURI().toString());
    MediaPlayer player = new MediaPlayer(sound);



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
        player.play();
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

        score();
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

        score();
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

        score();
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

        score();
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









