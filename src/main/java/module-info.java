module me.jacobisho.habittracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.jacobisho.habittracker to javafx.fxml;
    exports me.jacobisho.habittracker;
}