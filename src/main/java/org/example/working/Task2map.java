package org.example.working;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2map {

    public static Map<String, String> contactMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        // Phone Book Task
        //	•	Create a HashMap<String, String> to store names and phone numbers.
        //	•	Implement functions to:
        //  •	Add a contact
        //	•	Delete a contact
        //	•	Search by name

        String filename = "data.txt";
        try {
            FileWriter writer = new FileWriter(filename);

            boolean isAlive = true;

            Scanner scanner = new Scanner(System.in);

            while (isAlive) {

                System.out.println("Type 1 for adding contact");
                System.out.println("Type 2 for delete contact");
                System.out.println("Type 3 for searching contact");
                System.out.println("Type any other for exit");

                switch (scanner.next()) {
                    case "1":
                        System.out.println("Type name");
                        String name = scanner.next();
                        System.out.println("Type number");
                        String number = scanner.next();
                        addContact(name, number);
                        writer.write(name + "\n" + number);
                        break;
                    case "2":
                        System.out.println("Type name for delete");
                        String name1 = scanner.next();
                        deleteContact(name1);
                        writer.write(name1);
                        break;
                    case "3":
                        System.out.println("Type name for searching");
                        String name2 = scanner.next();
                        searchContact(name2);
                        writer.write(name2);

                        break;
                    default:
                        isAlive = false;
                        System.out.println("goodbye");
                        break;
                }
            }

            writer.close();
            System.out.println("Data saved to the file");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader(filename);
            BufferedReader buffReader = new BufferedReader(reader);
            String line;
            while ((line = buffReader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
            buffReader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }

    }

    public static void addContact(String name, String phoneNumber) {
        contactMap.put(name, phoneNumber);
    }
    public static void deleteContact(String name) {
        contactMap.remove(name);

    }
    public static void searchContact(String name) {
        System.out.println(contactMap.get(name));

    }

}
