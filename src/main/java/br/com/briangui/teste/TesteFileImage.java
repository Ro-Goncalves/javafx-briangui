package br.com.briangui.teste;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TesteFileImage extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(new FileInputStream("G:/SISTEMAS/RODRIGO/GIT/brian-gui/src/main/java/br/com/briangui/teste/testeImage.png"));
       
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);
        
        Group root = new Group(imageView);        
        Scene scene = new Scene(root, 800, 500);       
        primaryStage.setTitle("Brian - Gui");        
        primaryStage.setScene(scene);        
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Iniciando o aplicativo
        launch();
    }
}

