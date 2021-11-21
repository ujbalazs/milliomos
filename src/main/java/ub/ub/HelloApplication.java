package ub.ub;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;


import java.io.IOException;

public class HelloApplication extends Application {
    Media sound = new Media(new File("src/music/music.mp3").toURI().toString());
    MediaPlayer player = new MediaPlayer(sound);
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Legyen Ön is Milliomos");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        player.play();

    }

    public static void main(String[] args) {launch();}
}