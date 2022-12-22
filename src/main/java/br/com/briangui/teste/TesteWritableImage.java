package br.com.briangui.teste;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TesteWritableImage extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(new FileInputStream("G:/SISTEMAS/RODRIGO/GIT/brian-gui/src/main/java/br/com/briangui/teste/testeImage.png"));
       
        int width = (int)image.getWidth();
        int height = (int)image.getHeight();

        WritableImage writableImage = new WritableImage(width, height);
        PixelReader pixelReader = image.getPixelReader();
        PixelWriter pixelWriter = writableImage.getPixelWriter();

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                Color color = pixelReader.getColor(x, y);
                pixelWriter.setColor(x, y, color.darker());
            }
        }

        ImageView imageView = new ImageView(writableImage);
        imageView.setX(50);
        imageView.setY(25);        
        
        Group root = new Group(imageView);        
        Scene scene = new Scene(root, 800, 500);       
        primaryStage.setTitle("Brian - Gui");        
        primaryStage.setScene(scene);        
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Iniciando o aplicativo
        launch();
    }
}

