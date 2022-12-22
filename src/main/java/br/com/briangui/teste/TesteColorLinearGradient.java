package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TesteColorLinearGradient extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(180.0f);
        circle.setRadius(90.0f);

        circle.setFill(Color.DARKRED);

        circle.setStrokeWidth(3);
        circle.setStroke(Color.DARKSLATEBLUE);

        Text text = new Text("BrianGui - LinearGradient");
        text.setFont(Font.font("Edwardian Script ITC", 50));
        text.setX(5);
        text.setY(50);

        Stop[] stops = new Stop[]{
            new Stop(0, Color.DARKSLATEBLUE),
            new Stop(1, Color.DARKRED),
        };

        LinearGradient linearGradient = 
            new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        circle.setFill(linearGradient);
        text.setFill(linearGradient);
        
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

