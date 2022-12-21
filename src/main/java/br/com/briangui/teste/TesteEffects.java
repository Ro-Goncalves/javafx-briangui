package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TesteEffects extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image("https://www.tutorialspoint.com/green/images/logo.png");

        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(70);
        imageView.setFitHeight(200);
        imageView.setFitWidth(400);
        imageView.setPreserveRatio(true);

        Glow glow = new Glow();
        glow.setLevel(1.0);
        imageView.setEffect(glow);
        
        Group root = new Group(imageView);        
        Scene scene = new Scene(root, 600, 300);       
        primaryStage.setTitle("Brian - Gui");        
        primaryStage.setScene(scene);        
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Iniciando o aplicativo
        launch();
    }
}

