package opg1;

import java.util.HashSet;
import java.util.Set;

public class Studerende {

    private int studieNr;
    private String navn;
    private Set<Integer> karakterer = new HashSet<>();
    private Skole skole;

    public Studerende(int studieNr, String navn, Set<Integer> karakterer, Skole skole) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.skole = skole;

    }

    public Skole getSkole() {
        return skole;
    }

    public void setSkole(Skole skole) {
        this.skole = skole;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter) {
        karakterer.add(karakter);
    }

    public Set<Integer> getKarakterer() {
        return karakterer;
    }

    @Override
    public String toString() {
        return "Studerende [studieNr=" + studieNr + ", navn=" + navn + ", karakterer=" + karakterer + "]";
    }

}
