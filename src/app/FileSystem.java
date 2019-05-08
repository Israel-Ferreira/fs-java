package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileSystem {
    private String pathArquivo;
    private String[] conteudo;

    public FileSystem(String pathArquivo) {
        this.pathArquivo = pathArquivo;
    }

    /**
     * @return the conteudo
     */
    public String[] getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(String[] conteudo) {
        this.conteudo = conteudo;
    }

    public FileSystem() {
    }

    public void lerArquivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.pathArquivo));
        String[] linhas = new String[10];

        int j = 0;

        while (br.ready()) {
            String linha = br.readLine();
            linhas[j] = linha;
            j++;
        }

        this.setConteudo(linhas);
    }

    /**
     * @return the pathArquivo
     */
    public String getPathArquivo() {
        return pathArquivo;
    }

    /**
     * @param pathArquivo the pathArquivo to set
     */
    public void setPathArquivo(String pathArquivo) {
        this.pathArquivo = pathArquivo;
    }

}