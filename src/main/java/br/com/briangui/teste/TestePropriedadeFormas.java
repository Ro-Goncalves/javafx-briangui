package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class TestePropriedadeFormas extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       Rectangle rectangle = new Rectangle(20, 50, 560, 200);
       rectangle.setFill(Color.BLUE);
       rectangle.setStrokeType(StrokeType.CENTERED);
       rectangle.setStrokeWidth(20.0);
       rectangle.setStroke(Color.RED);
       rectangle.setStrokeLineJoin(StrokeLineJoin.ROUND);
       rectangle.setStrokeMiterLimit(5.0);
       rectangle.setStrokeLineCap(StrokeLineCap.BUTT);
       rectangle.setSmooth(false);

        //Criando o group e passando a linha como parâmetro
        Group root = new Group(rectangle);        

        //Criando a scene
        Scene scene = new Scene(root, 600, 300);

        //Definindo o título
        primaryStage.setTitle("BrianGui");

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

