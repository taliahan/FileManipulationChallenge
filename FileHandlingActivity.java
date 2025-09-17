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

            FileWriter writer = new FileWriter(note);
            writer.write("Here is my special note.");
            writer.close();
            
            FileWriter writer2 = new FileWriter(data);
            writer2.write("Here is my second special note");
            writer2.close(); 

            FileWriter writer3 = new FileWriter(log);
            writer3.write("Here is my third special note");
            writer3.close(); 

        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}
