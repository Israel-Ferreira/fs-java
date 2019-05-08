package app;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        FileSystem fs = new FileSystem("C:/Users/aluno/documents/FileSystem/src/app/lambda.txt"); // path absoluto
        fs.lerArquivo();

        List<String> linhas  = Arrays.asList(fs.getConteudo());

        linhas.forEach(lin -> System.out.println(lin));

    }
}