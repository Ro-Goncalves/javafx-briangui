package br.com.briangui.teste;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TesteFileImageMultiple extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(new FileInputStream("G:/SISTEMAS/RODRIGO/GIT/brian-gui/src/main/java/br/com/briangui/teste/testeImage.png"));
       
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(200);
        imageView.setFitWidth(250);
        imageView.setPreserveRatio(true);

        ImageView imageView2 = new ImageView(image);
        imageView2.setX(300);
        imageView2.setY(25);
        imageView2.setFitHeight(150);
        imageView2.setFitWidth(250);
        imageView2.setPreserveRatio(true);

        ImageView imageView3 = new ImageView(image);
        imageView3.setX(350);
        imageView3.setY(200);
        imageView3.setFitHeight(100);
        imageView3.setFitWidth(100);
        imageView3.setPreserveRatio(true);
        
        Group root = new Group(imageView, imageView2, imageView3);        
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

