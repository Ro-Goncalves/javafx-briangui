package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

public class TesteMaterial extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image("http://www.tutorialspoint.com/images/tp-logo.gif");

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setHeight(130.0f);
        cylinder1.setRadius(30.f);
        cylinder1.setTranslateX(200);
        cylinder1.setTranslateY(75);

        PhongMaterial material1 = new PhongMaterial();
        material1.setBumpMap(image);
        cylinder1.setMaterial(material1);

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setHeight(130.0f);
        cylinder2.setRadius(30.f);
        cylinder2.setTranslateX(100);
        cylinder2.setTranslateY(75);

        PhongMaterial material2 = new PhongMaterial();
        material2.setDiffuseMap(image);
        cylinder2.setMaterial(material2);

        Cylinder cylinder3 = new Cylinder();
        cylinder3.setHeight(130.0f);
        cylinder3.setRadius(30.f);
        cylinder3.setTranslateX(400);
        cylinder3.setTranslateY(75);

        PhongMaterial material3 = new PhongMaterial();
        material3.setSelfIlluminationMap(image);
        cylinder3.setMaterial(material3);

        Cylinder cylinder4 = new Cylinder();
        cylinder4.setHeight(130.0f);
        cylinder4.setRadius(30.f);
        cylinder4.setTranslateX(300);
        cylinder4.setTranslateY(75);

        PhongMaterial material4 = new PhongMaterial();
        material4.setSpecularMap(image);
        cylinder4.setMaterial(material4);

        Cylinder cylinder5 = new Cylinder();
        cylinder5.setHeight(130.0f);
        cylinder5.setRadius(30.f);
        cylinder5.setTranslateX(300);
        cylinder5.setTranslateY(75);

        PhongMaterial material5 = new PhongMaterial();
        material5.setDiffuseColor(Color.BLANCHEDALMOND);
        cylinder5.setMaterial(material5);

        Cylinder cylinder6 = new Cylinder();
        cylinder6.setHeight(130.0f);
        cylinder6.setRadius(30.f);
        cylinder6.setTranslateX(200);
        cylinder6.setTranslateY(300);

        PhongMaterial material6 = new PhongMaterial();
        material6.setSpecularColor(Color.BLANCHEDALMOND);
        cylinder6.setMaterial(material6);

        Cylinder cylinder7 = new Cylinder();
        cylinder7.setHeight(130.0f);
        cylinder7.setRadius(30.f);
        cylinder7.setTranslateX(300);
        cylinder7.setTranslateY(300);

        PhongMaterial material7 = new PhongMaterial();
        material7.setSpecularPower(0.1);
        cylinder7.setMaterial(material7);
       
        //Criando o group e passando a linha como parâmetro
        Group root = new Group(cylinder1, cylinder2, cylinder3, cylinder4, cylinder5, cylinder6, cylinder7);        

        //Criando a scene
        Scene scene = new Scene(root, 600, 400);

        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(-10);
        scene.setCamera(camera);

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

