package Problemas;

import java.io.File;
import java.io.IOException;

public interface Reader {

    File getFile(String file) throws IOException;

    boolean writeFile(File file);
}
