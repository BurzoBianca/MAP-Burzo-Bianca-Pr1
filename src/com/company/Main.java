package com.company;

public class Main {

    public static void main(String[] args) {
        Repository Repo = new Repository();
        Controller ctrl = new Controller(Repo);
        Repo.readFromFile();
       // System.out.println(Repo.getAusfluge());
        //System.out.println(ctrl.sortListeAusflugeBYAnzahlTeilnehmer());
        //System.out.println(ctrl.filterTOPbyMittelwert());
        //ctrl.sortAndSaveToFile();
        //ctrl.topandSaveToFile();
    }
}
