package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TesteColorUniform extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       Circle circle = new Circle();
       circle.setCenterX(300.0f);
       circle.setCenterY(180.0f);
       circle.setRadius(90.0f);

       circle.setFill(Color.DARKRED);

       circle.setStrokeWidth(3);
       circle.setStroke(Color.DARKSLATEBLUE);

       Text text = new Text("Brian - Gui - Colored");
       text.setFont(Font.font("Edwardian Script ITC", 50));
       text.setX(100);
       text.setY(50);

       text.setFill(Color.BEIGE);

       text.setStrokeWidth(3);
       text.setStroke(Color.DARKSLATEBLUE);
        
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

