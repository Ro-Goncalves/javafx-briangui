package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TesteColorImagePattern extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       Circle circle = new Circle();
       circle.setCenterX(300.0f);
       circle.setCenterY(180.0f);
       circle.setRadius(90.0f);       

       Text text = new Text("Brian - Gui - ImagePartterned");
       text.setFont(Font.font("Edwardian Script ITC", 50));
       text.setX(50);
       text.setY(50);

       String link = "https://encrypted-tbn1.gstatic.com" 
       + "/images?q=tbn:ANd9GcRQub4GvEezKMsiIf67U" 
       + "rOxSzQuQ9zl5ysnjRn87VOC8tAdgmAJjcwZ2qM";

       Image image = new Image(link);
       ImagePattern radialGradiente = new ImagePattern(image, 20, 20, 40, 40, false);

       circle.setFill(radialGradiente);
       text.setFill(radialGradiente);
        
        Group root = new Group(circle, text);        
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

