package br.com.brconsorcios;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class TesteFormaComplexa extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Criando um Path
        Path path = new Path();
        
        //Movendo ao ponto inicial
        MoveTo initialPath = new MoveTo(108, 71);
        //Criando a 1ª linha
        LineTo lineTo1 = new LineTo(321, 161);
        //Criando a 2ª linha
        LineTo lineTo2 = new LineTo(126, 232);
        //Criando a 3ª linha
        LineTo lineTo3 = new LineTo(232, 52);
        //Criando a 4ª linha
        LineTo lineTo4 = new LineTo(269, 250);
        //Criando a 5ª linha
        LineTo lineTo5 = new LineTo(108, 71);

        //Adicionando todos os elementos ao Path
        path.getElements().add(initialPath);
        path.getElements().addAll(lineTo1, lineTo2, lineTo3, lineTo4, lineTo5);
        
        Group root = new Group(path);        

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

