package br.com.briangui.teste;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TesteTextNode extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {        
        Text text = new Text();
        text.setText("Brian - Gui");        
        text.setFont(Font.font("verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 45));        
        text.setX(150);
        text.setY(100);

        text.setFill(Color.BLUEVIOLET);
        text.setStrokeWidth(2);
        text.setStroke(Color.BLACK);

        Text text2 = new Text("Texto Riscado");
        text2.setX(150);
        text2.setY(150);
        text2.setStrikethrough(true);
        text2.setFont(Font.font(45));

        Text text3 = new Text("Texto Sublinhado");
        text3.setX(150);
        text3.setY(200);
        text3.setUnderline(true);
        text3.setFont(Font.font(45));

        //Criando o group e passando a linha como parâmetro
        Group root = new Group(text, text2, text3);        

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

