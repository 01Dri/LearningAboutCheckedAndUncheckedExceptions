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
         *
         * ENG: Checked exceptions are exception that you are obliged to treat, using "Try/Catch" or the reserved word (+)
         * "Throws". Examples bellow:
         *  Example description: Let's try to read the file of computer. Note that when you to instance "FileReader" Class, the compiler
         *  reports an error with following  message: "Unhandled exception: java.io.FileNotFoundException".
         *  This happening because is a CheckedException and this case we need to treat it.
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
     *
     * ENG: It's important to report that Checked Exceptions are mainly used for errors that can be recovered.
     * In this example below, we can to use the "catch" block to ask user the filename again.
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
     *
     * ENG: Are exceptions where we are not required to handle them. They are mainly associated with programming errors.
     * An example is the dreaded "NullPointerException", where we attempt to access a null value. We are not obligated to handle it. But it is
     * always a good practice to do so. Example below:
     */

    /**
     * Note que não temos nenhum erro informado pelo compilador. Mesmo que temos conhecimento que o código vai ocasionar um erro.
     * Nesse caso, é de nossa responsabilidade, tratar esse erro. No exemplo 2, podemos ver uma abordagem para este código.
     *
     * ENG: Note that we don't have errors per compiler. Even that we know the code will cause an error.
     * In this case, is we responsibility to treat this error. In Example 2, we can to see an approach for this code.
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
