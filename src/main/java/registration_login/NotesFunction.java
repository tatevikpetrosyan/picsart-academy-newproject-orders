package registration_login;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class NotesFunction {

    public static void readNotes(User user, ArrayList<String> notesList) {
        String filename = "C:\\Users\\apple\\Desktop\\picsart-qa\\picsart-academy-newproject-orders\\src\\main\\java\\registration_login\\" + "notes_" + user.getUsername() + ".txt";
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader buffReader = new BufferedReader(reader);
            String line;
            while ((line = buffReader.readLine()) != null) {
                notesList.add(line);
                System.out.println("Read: " + line);
            }
            buffReader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    };
    public static void writeNotes(User user, ArrayList<String> notesList) {
        String filename = "C:\\Users\\apple\\Desktop\\picsart-qa\\picsart-academy-newproject-orders\\src\\main\\java\\registration_login\\" + "notes_" + user.getUsername() + ".txt";
        try (FileWriter writer = new FileWriter(filename)) {
            for (String note : notesList) {
                writer.write(note);
            }
                System.out.println("Data saved to the file");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

    };
}
