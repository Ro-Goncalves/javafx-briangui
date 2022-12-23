package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class TesteCullFace extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Sphere sphere1 = new Sphere();
        sphere1.setRadius(50.0);
        sphere1.setTranslateX(100);
        sphere1.setTranslateY(150);
        sphere1.setCullFace(CullFace.FRONT);

        Sphere sphere2 = new Sphere();
        sphere2.setRadius(50.0);
        sphere2.setTranslateX(300);
        sphere2.setTranslateY(150);
        sphere2.setCullFace(CullFace.BACK);

        Sphere sphere3 = new Sphere();
        sphere3.setRadius(50.0);
        sphere3.setTranslateX(500);
        sphere3.setTranslateY(150);
        sphere3.setCullFace(CullFace.NONE);

        //Criando o group e passando a linha como parâmetro
        Group root = new Group(sphere1, sphere2, sphere3);        

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

