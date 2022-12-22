package br.com.briangui.teste;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TesteTransicaoEscala extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(50.0f);
        circle.setFill(Color.BROWN);
        circle.setStrokeWidth(20);

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setNode(circle);
        scaleTransition.setByY(1.5);
        scaleTransition.setByX(1.5);
        scaleTransition.setCycleCount(50);
        scaleTransition.setAutoReverse(false);
        scaleTransition.play();

        Group root = new Group(circle);        

        //Criando a scene
        Scene scene = new Scene(root, 600, 300);

        //Definindo o título
        primaryStage.setTitle("Brian - Gui");

        //Adicionando a scene ao stage
        primaryStage.setScene(scene);

        //Exibindo o conteúdo da stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Iniciando o aplicativo
        launch();
    }
}

