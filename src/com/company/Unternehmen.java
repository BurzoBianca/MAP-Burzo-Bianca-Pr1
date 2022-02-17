package com.company;

import java.util.Objects;

public class Unternehmen {

    private Long id;
    private String reiseziehl;
    private int preisProPerson;
    private Long maxAnzahlTeilnehmer;
    private int anzahlTeilnehmer;

    public Unternehmen(Long id, String reiseziehl, int preisProPerson,long maxAnzahlTeilnehmer, int anzahlTeilnehmer) {
        this.id = id;
        this.reiseziehl = reiseziehl;
        this.preisProPerson = preisProPerson;
        this.maxAnzahlTeilnehmer = maxAnzahlTeilnehmer;
        this.anzahlTeilnehmer = anzahlTeilnehmer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReiseziehl() {
        return reiseziehl;
    }

    public void setReiseziehl(String reiseziehl) {
        this.reiseziehl = reiseziehl;
    }

    public int getPreisProPerson() {
        return preisProPerson;
    }

    public void setPreisProPerson(int preisProPerson) {
        this.preisProPerson = preisProPerson;
    }

    public Long getMaxAnzahlTeilnehmer() {
        return maxAnzahlTeilnehmer;
    }

    public void setMaxAnzahlTeilnehmer(Long maxAnzahlTeilnehmer) {
        this.maxAnzahlTeilnehmer = maxAnzahlTeilnehmer;
    }

    public int getAnzahlTeilnehmer() {
        return anzahlTeilnehmer;
    }

    public void setAnzahlTeilnehmer(int anzahlTeilnehmer) {
        this.anzahlTeilnehmer = anzahlTeilnehmer;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, reiseziehl, preisProPerson, maxAnzahlTeilnehmer, anzahlTeilnehmer);
    }

    @Override
    public String toString() {
        return "Ausflug{" + "id=" + id + ", reiseziehl='" + reiseziehl + '\'' + ", preisProPerson=" + preisProPerson +
                ", maxAnzahlTeilnehmer=" + maxAnzahlTeilnehmer + ", anzahlTeilnehmer=" + anzahlTeilnehmer + '\'' + '}';
    }
}