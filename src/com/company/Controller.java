package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    private Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    public List<Unternehmen> sortListeAusflugeBYAnzahlTeilnehmer() {
        return repository.getAusfluge()
                .stream()
                .sorted(Comparator.comparingInt(Unternehmen::getAnzahlTeilnehmer).reversed())
                .collect(Collectors.toList());
    }

    public void sortAndSaveToFile() {
        this.repository.writeToFile1("ausflugesortiert.txt", this.sortListeAusflugeBYAnzahlTeilnehmer());
    }
/*
    public LinkedHashMap<String, Integer> filterTOPbyMittelwert() {

        Map<String, Integer> ortenMap = new HashMap<>();

        //(anzahl_teilnehmer/max_anzahl_teilnehmer)*100

        for (Unternehmen ausflug :
                this.repository.getAusfluge()) {
            if (ortenMap.containsKey(ausflug.getReiseziehl())) {
                ortenMap.put((ausflug.getAnzahlTeilnehmer()/ ausflug.getMaxAnzahlTeilnehmer())*100);
            } else {
                ortenMap.put(ausflug.getReiseziehl(), ausflug.getAnzahlTeilnehmer());


            }

            return ortenMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (e1, e2) -> e1, LinkedHashMap::new));


        }
    }

    public void topandSaveToFile() {
        this.repository.writeToFile2("statistik.txt",this.filterTOPbyMittelwert());
    }*/
}