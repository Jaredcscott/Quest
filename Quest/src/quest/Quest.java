/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author jareds
 */
public class Quest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane mainPane = new BorderPane();
        Insets insets = new Insets(1);
        VBox bottomPanel = new VBox();
        HBox buttonPanelLow = new HBox();
        HBox buttonPanelMid = new HBox();
        HBox buttonPanelHigh = new HBox();
        ImageView sceneImage = new ImageView();
        Image image = new Image("images/MainTitle.png");
        sceneImage.setImage(image);
        BorderPane.setMargin(sceneImage, insets);
        Button inventory = new Button();
        inventory.setMinSize(130, 30);
        inventory.setMaxSize(130, 30);
        inventory.setText("Inventory");
        inventory.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Inventory");
            }
        });
        Button attack = new Button();
        attack.setMinSize(130, 30);
        attack.setMaxSize(130, 30);
        attack.setText("Attack");
        attack.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Attack");
            }
        });
        Button defend = new Button();
        defend.setMinSize(130, 30);
        defend.setMaxSize(130, 30);
        defend.setText("Defend");
        defend.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Defend");
            }
        });
        Button map = new Button();
        map.setMinSize(130, 30);
        map.setMaxSize(130, 30);
        map.setText("Map");
        map.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Map");
            }
        });
        Button questBook = new Button();
        questBook.setMinSize(130, 30);
        questBook.setMaxSize(130, 30);
        questBook.setText("Quest Book");
        questBook.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Quest Book");
            }
        });
        Button search = new Button();
        search.setMinSize(130, 30);
        search.setMaxSize(130, 30);
        search.setText("Search");
        search.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Search");
            }
        });
        Button north = new Button();
        north.setMinSize(130, 30);
        north.setMaxSize(130, 30);
        north.setText("North");
        north.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("North");
            }
        });
        Button south = new Button();
        south.setMinSize(130, 30);
        south.setMaxSize(130, 30);
        south.setText("South");
        south.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("South");
            }
        });
        Button stats = new Button();
        stats.setMinSize(130, 30);
        stats.setMaxSize(130, 30);
        stats.setText("Stats");
        stats.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Stats");
            }
        });
        Button craft = new Button();
        craft.setMinSize(130, 30);
        craft.setMaxSize(130, 30);
        craft.setText("Craft");
        craft.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Craft");
            }
        });
        Button skills = new Button();
        skills.setMinSize(130, 30);
        skills.setMaxSize(130, 30);
        skills.setText("Skills");
        skills.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Skills");
            }
        });
        Button magic = new Button();
        magic.setMinSize(130, 30);
        magic.setMaxSize(130, 30);
        magic.setText("Magic");
        magic.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Magic");
            }
        });
        Button options = new Button();
        options.setMinSize(130, 30);
        options.setMaxSize(130, 30);
        options.setText("Options");
        options.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Options");
            }
        });
        Button east = new Button();
        east.setMinSize(130, 30);
        east.setMaxSize(130, 30);
        east.setText("East");
        east.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("East");
            }
        });
        Button west = new Button();
        west.setMinSize(130, 30);
        west.setMaxSize(130, 30);
        west.setText("West");
        west.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("West");
            }
        });
        Button btn = new Button();
        btn.setMinSize(130, 30);
        btn.setMaxSize(130, 30);
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        Button rat = new Button();
        rat.setMinSize(130, 30);
        rat.setMaxSize(130, 30);
        rat.setText("Bring on the rat'");
        rat.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Image image = new Image("images/smallRat.png");
                sceneImage.setImage(image);
            }
        });
        Text line1 = new Text("line1");
        line1.setWrappingWidth(700);
        line1.setTextAlignment(TextAlignment.CENTER);
        Text line2 = new Text("line2");
        line2.setWrappingWidth(700);
        line2.setTextAlignment(TextAlignment.CENTER);
        Text line3 = new Text("line3");
        line3.setWrappingWidth(700);
        line3.setTextAlignment(TextAlignment.CENTER);
        Text line4 = new Text("line4");
        line4.setWrappingWidth(700);
        line4.setTextAlignment(TextAlignment.CENTER);
        Text line5 = new Text("line5");
        line5.setWrappingWidth(700);
        line5.setTextAlignment(TextAlignment.CENTER);
        Text line6 = new Text("line6");
        line6.setWrappingWidth(700);
        line6.setTextAlignment(TextAlignment.CENTER);
        Text line7 = new Text("line7");
        line7.setWrappingWidth(700);
        line7.setTextAlignment(TextAlignment.CENTER);
        Text line8 = new Text("line8");
        line8.setWrappingWidth(700);
        line8.setTextAlignment(TextAlignment.CENTER);
        Text space1 = new Text("");
        Text space2 = new Text("");
        Text space3 = new Text("              ");
        Text space4 = new Text("              ");
        Text space5 = new Text("              ");
        bottomPanel.getChildren().addAll(line1,line2,line3,line4,line5,line6,line7, line8, space1);
        buttonPanelLow.getChildren().addAll(space3,craft, skills, south,magic,options);
        buttonPanelMid.getChildren().addAll(space4, questBook, west, search, east, stats);
        buttonPanelHigh.getChildren().addAll(space5, inventory, attack, north, defend, map);
        bottomPanel.getChildren().addAll(buttonPanelHigh,buttonPanelMid,buttonPanelLow, space2);
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
