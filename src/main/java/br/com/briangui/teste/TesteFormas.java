package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
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

        Polygon polygonTriangle = new Polygon();
        polygonTriangle.getPoints().addAll(new Double[]{
            //XY
            5.0, 80.0,
            35.0, 80.0,
            20.0, 50.0,
        });

        Polygon polygonRectangle = new Polygon();
        polygonRectangle.getPoints().addAll(new Double[]{
            40.0, 50.0,
            100.0, 50.0,
            100.0, 80.0,
            40.0, 80.0,
        });

        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
            130.0, 50.0,
            160.0, 50.0,
            180.0, 70.0,
            160.0, 90.0,
            130.0, 90.0,
            110.0, 70.0,
        });
        
        
        Group root = new Group(
            line, 
            rectangle, 
            rectangle2, 
            circle, 
            ellipse, 
            polygonTriangle, 
            polygonRectangle,
            polyline
        );        

        //Criando a scene
        Scene scene = new Scene(root, 600, 300);

        //Definindo o t??tulo
        primaryStage.setTitle("Brian - Gui");

        //Adicionando a scene ao stage
        primaryStage.setScene(scene);

        //Exibindo o conte??do da stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Iniciando o aplicativo
        launch();
    }
}

