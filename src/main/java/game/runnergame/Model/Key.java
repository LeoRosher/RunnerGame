package game.runnergame.Model;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class Key implements EventHandler<KeyEvent> {
    public static boolean left;
    public static boolean right;
    public static boolean jump;
    public static boolean down;

    @Override
    public void handle(KeyEvent event) {
        if(event.getEventType() == KeyEvent.KEY_PRESSED) {
            switch (event.getCode().toString()) {
                case "D" -> right = true;
                case "A" -> left = true;
                case "W" -> jump = true;
                case "S" -> down = true;
            }
        } if(event.getEventType() == KeyEvent.KEY_RELEASED) {
            switch (event.getCode().toString()) {
                case "D" -> right = false;
                case "A" -> left = false;
                case "W" -> jump = false;
                case "S" -> down = false;
            }
        }

    }
}
