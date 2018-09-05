package opg1;

import java.util.HashSet;
import java.util.Set;

public class Skole {
    private String navn;
    private Set<Studerende> studerende = new HashSet<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addStuderende(Studerende studerende) {
        this.studerende.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        this.studerende.remove(studerende);
    }

    public double gennemsnit() {
        double tmp = 0;
        double karakterTotal = 0;
        for (Studerende studerende : studerende) {
            for (Integer karakterer : studerende.getKarakterer()) {
                tmp += karakterer;
                karakterTotal++;
            }
        }
        return tmp / karakterTotal;
    }

    @Override
    public String toString() {
        return "Skole [navn=" + navn + ", studerende=" + studerende + "]";
    }

}
