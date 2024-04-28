import Problemas.Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {

    public static void main(String[] args) {

        // EXCEÇÕES VERIFICADAS (CHECKED EXCEPTIONS) X EXCEÇÕES NÃO VERIFICADAS (UNCHECKED EXCEPTIONS)

        /**
         * DIFERENÇAS:
         * - CHECKED EXCEPTIONS: São exceções no qual você é obrigado a tratar, utilizando o bloco "Try/Catch" (+)
         * ou usando a palavra reservada "Throws". Exemplo abaixo:
         * DESCRIÇÃO DO EXEMPLO: Vamos tentar ler um arquivo do computador. Note que ao instanciar a classe "FileReader"
         * O compilador informa um erro com a seguinte mensagem: "Unhandled exception: java.io.FileNotFoundException)
         * Isso acontece pois se trata de uma checked exception, e nesse caso somos obrigados a trata-la.
         * No exemplo 2, estamos tratando corretamente essa exception.
         */
    }

    // Excemplo 1
    public static void ReadFile(String fileName) {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }

    // Excemplo 2

    /**
     * Importante informar, que checked exceptions são usadas principalmente para erros que podem ser recuperados
     * Nesse exemplo abaixo, poderiamos utilzar o bloco "catch" para pedir ao usuario novamente o nome do arquivo (+)
     * para assim, tentar novamente abri-lo.
     */
    public static void ReadFileExceptionHandled(String fileName) {
        try {

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * DIFERENÇAS:
     * - UNCHECKED EXCEPTIONS: São exceções onde não somos obrigados a trata-las. Principalmente ligadas a erros de programação
     *  Um exemplo é no caso das tão temidas "NullPointerException" onde tentamos acessar um valor nulo. Nós não samos obrigados (+)
     *  a trata-las. Porém é sempre um boa pratica trata-las. Segue o exemplo abaixo:
     */

    /**
     * Note que não temos nenhum erro informado pelo compilador. Mesmo que temos conhecimento que o código vai ocasionar um erro.
     * Nesse caso, é de nossa responsabilidade, tratar esse erro. No exemplo 2, podemos ver uma abordagem para este código.
     */
    public void getStringLength(String string) {
        int length = string.length();
        System.out.println(length);
    }

    // Exemplo 2
    public void getStringLengthExceptionHandled() {
        String string = null;
        if (string == null) {
            throw new NullPointerException("string is null");
        }
        int length = string.length();
        System.out.println(length);
    }

}
