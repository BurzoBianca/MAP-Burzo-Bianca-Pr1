package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Repository {
    private List<Unternehmen> ausfluge;

    public Repository() {
        this.ausfluge = new ArrayList<>();
        this.readFromFile();
    }

    public void readFromFile() {

        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Bianca\\IdeaProjects\\Restanta-Burzo-Bianca-Pr1\\src\\com\\company\\ausfluge.txt"))) {

            // file delimiter
            String DELIMITER = "&&";

            // read the file line by line
            String line;

            while ((line = br.readLine()) != null) {

                // convert line into columns
                String[] columns = line.split(DELIMITER);
                Unternehmen newAusflug = new Unternehmen(Long.valueOf(columns[0]), columns[1], Integer.valueOf(columns[2]), Long.valueOf(columns[3]), Integer.parseInt(columns[4]));
                this.ausfluge.add(newAusflug);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void writeToFile1(String fileName, List<Unternehmen> ausflugeList) {
        try {

            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Unternehmen ausflug : ausflugeList) {
                StringJoiner sj = new StringJoiner(",");
                sj.add(String.valueOf(ausflug.getId()));
                sj.add(ausflug.getReiseziehl());
                sj.add(String.valueOf(ausflug.getPreisProPerson()));
                sj.add(String.valueOf(ausflug.getMaxAnzahlTeilnehmer()));
                sj.add(String.valueOf(ausflug.getAnzahlTeilnehmer()));
                printWriter.println(sj);
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile2(String fileName, LinkedHashMap<String, Integer> sortedMap) {
        try {

            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Set<String> keys = sortedMap.keySet();
            for (String key : keys) {
                StringJoiner sj = new StringJoiner(": ");
                sj.add(key);
                sj.add(String.valueOf(sortedMap.get(key)));
                printWriter.println(sj);
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Unternehmen> getAusfluge() {
        return ausfluge;
    }
}
