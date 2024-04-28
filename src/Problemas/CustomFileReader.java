package Problemas;

import java.io.*;

public class CustomFileReader implements Reader {

    @Override
    public File getFile(String file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
        return new File(file);
    }

    @Override
    public boolean writeFile(File file) {
        System.out.println("Escrevendo no arquivo");
        return true;
    }
}
