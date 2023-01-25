module game.runnergame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.accessibility;


    opens game.runnergame to javafx.fxml;
    exports game.runnergame;
}