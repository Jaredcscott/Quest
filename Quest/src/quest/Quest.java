/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author jareds
 */
public class Quest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane mainPane = new BorderPane();
        VBox bottomPanel = new VBox();
        Pane buttonPanel = new Pane();
        ImageView sceneImage = new ImageView();
        Image image = new Image("images/MainTitle.png");
        sceneImage.setImage(image);
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        Text line1 = new Text("  sddd");
        Text line2 = new Text("  My");
        Text line3 = new Text("  Name is Jared");
        Text space1 = new Text("");
        Text space2 = new Text("");
        Text space3 = new Text("");
        bottomPanel.getChildren().addAll(line1,line2,line3, space1, space2, space3);
        buttonPanel.getChildren().add(btn);
        bottomPanel.getChildren().add(buttonPanel);
        mainPane.setCenter(sceneImage);
        mainPane.setBottom(bottomPanel);
        
        Scene scene = new Scene(mainPane, 750, 750);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
