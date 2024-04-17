module com.rojas.student {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rojas.student to javafx.fxml;
    exports com.rojas.student;
    exports com.rojas.student.controllers;
    opens com.rojas.student.controllers to javafx.fxml;
}