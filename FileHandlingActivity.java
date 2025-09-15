import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {
        // Your code here
        
        // a. Create main directory
        File directory = new File("JavaFileSystem");
        directory.mkdir();


        // b. Create three text files
        File note = new File("notes.txt");
        note.createNewFile();

        File data = new File("data.txt");
        data.createNewFile();

        File log = new File("log.txt");
        log.createNewFile();


        // c. Write messages to files
        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}
