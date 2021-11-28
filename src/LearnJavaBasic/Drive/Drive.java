package LearnJavaBasic.Drive;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface Drive {
    void addFile(File file);
    void listFile();
    File findFile(String name);

    List<File>Files= new ArrayList<>();

}

