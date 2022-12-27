package br.com.briangui.teste;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TesteTelaLogin extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text txEmail = new Text("Email");
        Text txPwd = new Text("Password");

        TextField tfEmail = new TextField();
        PasswordField tfPwd = new PasswordField();

        Button btnSubmit = new Button("Submit");
        Button btnClear = new Button("Clear");
        
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(txEmail, 0, 0);
        gridPane.add(tfEmail, 1, 0);
        gridPane.add(txPwd, 0, 1);
        gridPane.add(tfPwd, 1, 1);
        gridPane.add(btnSubmit, 0, 2);
        gridPane.add(btnClear, 1, 2);

        btnClear.setStyle("-fx-brackground-color: darkslateblue; -fx-text-fill: white;");
        btnSubmit.setStyle("-fx-brackground-color: darkslateblue; -fx-text-fill: white;");
        txEmail.setStyle("-fx-font: normal bold 20px 'serif' ");
        txPwd.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-brackground-color: BEIGE;");

        //Criando a scene
        Scene scene = new Scene(gridPane);

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

