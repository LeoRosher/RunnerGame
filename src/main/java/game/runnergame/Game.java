package game.runnergame;

import game.runnergame.Model.Key;
import game.runnergame.Model.Player;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application {
    private Group root;
    private Scene scene;
    private Canvas canvas;
    private GraphicsContext graphics;
    private Key key;
    private Player player1;

    @Override
    public void start(Stage stage) throws IOException {
        initialize();
        scene.setOnKeyPressed(key);
        scene.setOnKeyReleased(key);
        stage.setTitle("Runner Game");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        gameLoop();
    }

    private void initialize() {
        root = new Group();
        canvas = new Canvas(1200, 750);
        scene = new Scene(root, 1200, 750);
        graphics = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        key = new Key();
        player1 = new Player("Biker", "Biker", 50, 550, 5, 4);
    }

    private void update() {
        graphics.drawImage(new Image("Images/Background.png"), 0,0);
        player1.updateImage(graphics);
        player1.move();
    }

    private void gameLoop() {
        long initialTime = System.nanoTime();
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
                double time = (now - initialTime) / 1000000000.0;
            }
        };

        animationTimer.start();
    }

    public static void main(String[] args) {
        launch();
    }
}