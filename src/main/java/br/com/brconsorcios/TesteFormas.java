package br.com.brconsorcios;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TesteFormas extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Line line = new Line();
        line.setStartX(5);
        line.setStartY(30);
        line.setEndX(65);
        line.setEndY(30);

        //x inicial, y inicial, tamanho em x, tamanho em y
        Rectangle rectangle = new Rectangle(70, 15, 60, 30);

        Rectangle rectangle2 = new Rectangle(135, 15, 60, 30);
        rectangle2.setArcHeight(20.0);
        rectangle2.setArcWidth(20.0);

        //x inicial, y inicial, raio
        Circle circle = new Circle(220, 30, 15);

        //x inicial, y inicial, raio x, raio y
        Ellipse ellipse = new Ellipse(270, 30, 30, 15);
        
        Group root = new Group(line, rectangle, rectangle2, circle, ellipse);        

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

