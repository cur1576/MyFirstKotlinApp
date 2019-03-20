package com.example.myfirstkotlinapp;

import java.util.Objects;

public class Person {
    private String vName;
    private String nName;
    private String strasse;
    private String ort;
    private String plz;
    private int hnr;
    private int alter;

    public Person(String vName, String nName, String strasse, String ort, String plz, int hnr, int alter) {
        this.vName = vName;
        this.nName = nName;
        this.strasse = strasse;
        this.ort = ort;
        this.plz = plz;
        this.hnr = hnr;
        this.alter = alter;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

    public String getNName() {
        return nName;
    }

    public void setNName(String nName) {
        this.nName = nName;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public int getHnr() {
        return hnr;
    }

    public void setHnr(int hnr) {
        this.hnr = hnr;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vName='" + vName + '\'' +
                ", nName='" + nName + '\'' +
                ", strasse='" + strasse + '\'' +
                ", ort='" + ort + '\'' +
                ", plz='" + plz + '\'' +
                ", hnr=" + hnr +
                ", alter=" + alter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return hnr == person.hnr &&
                alter == person.alter &&
                Objects.equals(vName, person.vName) &&
                Objects.equals(nName, person.nName) &&
                Objects.equals(strasse, person.strasse) &&
                Objects.equals(ort, person.ort) &&
                Objects.equals(plz, person.plz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vName, nName, strasse, ort, plz, hnr, alter);
    }
}
