import java.io.*;


public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {
        // Your code here

        // a. Create main directory
        File directory = new File("JavaFileSystem");
        directory.mkdir();

        // b. Create three text files
        File note = new File(directory, "notes.txt");
        note.createNewFile();

        File data = new File(directory, "data.txt");
        data.createNewFile();

        File log = new File(directory, "log.txt");
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
        readContent(note);
        readContent(data);
        readContent(log);

        // e. Create backup directory
        File backupDir = new File(directory, "Backup");
        backupDir.mkdir();


        // f. Copy contents to backup file

        // g. List all files in both directories
    }
    
    public static void readContent(File file) throws FileNotFoundException, IOException {
        try (FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
            System.out.println("Contents of " + file.getName());
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
    }
    


}
