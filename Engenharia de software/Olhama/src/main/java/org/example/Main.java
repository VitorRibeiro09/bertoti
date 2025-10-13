package org.example;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.exceptions.OllamaBaseException;
import io.github.ollama4j.models.response.OllamaResult;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OllamaBaseException, IOException, InterruptedException {
        String host = "http://localhost:11434";
        String modelName = "qwen3:1.7b";
        Scanner scanner = new Scanner(System.in);


        OllamaAPI ollamaAPI = new OllamaAPI(host);
        ollamaAPI.setRequestTimeoutSeconds(120);

        System.out.println("Olá. Este é o seu modelo de IA, o Ollama, faça a sua pergunta! digite 'sair' para encerrar.\n");
        while (true) {
        System.out.println("Você: ");
        String pergunta = scanner.nextLine();
        if (pergunta.equalsIgnoreCase("sair")){
            System.out.println("encerrando CHAT. Até mais!");
            break;
        }
        OllamaResult result = ollamaAPI.generate(modelName, pergunta, null);
        System.out.println("IA: " + result.getResponse());
        }
scanner.close();
 }
}



