package br.com.brconsorcios;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TesteAplicativo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Criando a linha
        Line line = new Line();
        //Coordenadas da linha
        line.setStartX(100.0);
        line.setStartY(150.00);
        line.setEndX(500.0);
        line.setEndY(150.0);

        //Criando o group e passando a linha como parâmetro
        Group root = new Group(line);

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

