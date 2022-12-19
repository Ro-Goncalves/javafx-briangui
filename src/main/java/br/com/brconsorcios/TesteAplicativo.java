package br.com.brconsorcios;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TesteAplicativo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //Criando a linha
        Line line = new Line();
        //Coordenadas da linha
        line.setStartX(100.0);
        line.setStartY(50.00);
        line.setEndX(500.0);
        line.setEndY(50.0);
        

        //Criando o objeto texto
        Text text = new Text();
        //Configurando o tamanho da fonte
        text.setFont(new Font(45));
        //Coordenadas do vertice inical
        text.setX(200);
        text.setY(150);
        //Definindo o texto
        text.setText("Brian - Gui");

        //Criando o group e passando a linha como parâmetro
        Group root = new Group(line, text);        

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

