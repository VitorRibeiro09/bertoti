package org.example.livros;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.livros.Biblioteca.Livro;
import javafx.scene.control.Alert;

import java.util.List;


public class HelloController {

    @FXML private TextField titulo;
    @FXML private TextField autor;
    @FXML private TextField isbn;


    @FXML
    private void inserirLivro() {
        String autorLivro = autor.getText();
        String tituloLivro = titulo.getText();
        String isbnLivro = isbn.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);



        if (autorLivro.isEmpty() || tituloLivro.isEmpty() || isbnLivro.isEmpty()) {
            alert.setTitle("O campo precisa ser preenchido.");
            alert.setContentText("O campo precisa ser preenchido.");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
        else {
            Livro livro = new Livro(autorLivro, tituloLivro, isbnLivro);
            LivroDAO.inserirLivro(livro);
            alert.setTitle("O livro foi adicionado com sucesso.");
            alert.setContentText("O livro foi adicionado com sucesso.");
            alert.setHeaderText(null);
            alert.showAndWait();

        }
    }
    @FXML
    private void consultaLivro() {
        String tituloLivro = titulo.getText();
        String isbnLivro = isbn.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);



        if (isbnLivro.isEmpty()) {
            if (tituloLivro.isEmpty()) {
                alert.setTitle("Preencha o campo obrigatório");
                alert.setContentText("Você pode pesquisar por títulos ou por ISBN");
                alert.setHeaderText(null);
                alert.showAndWait();

            } else {
                LivroDAO.buscarPorTitulo(tituloLivro);
                List<Livro> resultado = LivroDAO.buscarPorTitulo(tituloLivro);
                for (Livro livro : resultado) {
                alert.setTitle("O livro foi buscado com sucesso.");
                alert.setContentText("O resultado da pesquisa:" + "\n" + "Titulo: " + livro.getTitulo() + "\n" +"ISBN: " + livro.getIsbn() + "\n" + "Autor: " + livro.getAutor());
                alert.setHeaderText(null);
                alert.showAndWait();
            }}
            } else  {
            Livro resultado = LivroDAO.buscarPorIsbn(isbnLivro);
            alert.setTitle("O livro foi buscado com sucesso.");
            alert.setContentText("O resultado da pesquisa:" + "\n" + "Titulo: " + resultado.getTitulo() + "\n" +"ISBN: " + resultado.getIsbn() + "\n" + "Autor: " + resultado.getAutor());
            alert.setHeaderText(null);
            alert.showAndWait();



        }
    }
}


