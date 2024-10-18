module com.alesandro.ejercicio15l {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.security.auth;
    requires org.checkerframework.checker.qual;


    opens com.alesandro.ejercicio15l to javafx.fxml;
    exports com.alesandro.ejercicio15l;
    exports com.alesandro.ejercicio15l.controller;
    opens com.alesandro.ejercicio15l.controller to javafx.fxml;
    exports com.alesandro.ejercicio15l.model;
    exports com.alesandro.ejercicio15l.dao;
}