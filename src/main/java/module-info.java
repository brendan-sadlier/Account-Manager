module com.pantelle.accountmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.pantelle.accountmanager to javafx.fxml;
    exports com.pantelle.accountmanager;
}