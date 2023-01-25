package game.runnergame.Model;

import game.runnergame.DataBase.PlayerImageDB;
import javafx.scene.canvas.GraphicsContext;

public class Player extends Entity{

    public Player(String name, String image, int posX, int posY, int HP, int velocity) {
        super(name, image, posX, posY, HP, velocity);
    }

    public void updateImage(GraphicsContext graphics) {
        graphics.drawImage(PlayerImageDB.playerImages.get(image), posX, posY);
    }

    public void move() {
        if (Key.left) {
            posX -= velocity;
        } if (Key.right) {
            posX += velocity;
        } if (Key.jump) {
            posY -= velocity;
        } if (Key.down) {
            posY += velocity;
        }
    }
}
