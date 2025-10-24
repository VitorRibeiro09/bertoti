module org.example.livros {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.example.livros to javafx.fxml;
    exports org.example.livros;

}

