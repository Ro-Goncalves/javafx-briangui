package br.com.briangui.teste;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TesteEventFilter extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(25.0f);
        circle.setFill(Color.BROWN);

        Text text = new Text("Clique no circulo para trocar sua cor.");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.CRIMSON);
        text.setX(150);
        text.setY(50);

        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e){
                System.out.println("Oi Sou Brian");
                circle.setFill(Color.DARKSLATEBLUE);
            }
        };
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        //Criando o group e passando a linha como parâmetro
        Group root = new Group(circle, text);        

        //Criando a scene
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.LAVENDER);

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

