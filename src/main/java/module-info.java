module game.runnergame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens game.runnergame to javafx.fxml;
    exports game.runnergame;
}