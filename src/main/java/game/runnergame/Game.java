package game.runnergame;

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
    private Canvas canvas;
    private GraphicsContext graphics;

    @Override
    public void start(Stage stage) throws IOException {
        canvas = new Canvas(1200, 750);
        graphics = canvas.getGraphicsContext2D();
        Group root = new Group();
        Scene scene = new Scene(root, 1200, 750);
        stage.setTitle("Runner Game");
        stage.setScene(scene);
        stage.setResizable(false);
        root.getChildren().add(canvas);
        stage.show();
        gameLoop();
    }

    private void update() {
        graphics.drawImage(new Image(""), 0,0);
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