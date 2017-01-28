package OOP;

import java.util.ArrayList;

/**
 * Created by dmitri.kiriljuk on 22.01.2017.
 */

public class Sonaraamat {
    ArrayList <String> soned = new ArrayList <String>();
    private String keel;

    public Sonaraamat(String raamatuKeel) {
        keel = raamatuKeel;
    }

    public void sisestaSona(String puaas) {
        soned.add(puaas);
    }

    public String[] otsiEsimeseTaheJargi(String u) {
        char esimeneTaht = u.charAt(0);
        ArrayList <String> sobivaAlgusega = new ArrayList <String>();//seda ei tohi üles panna, sest siis ta lisab vast2 eelmistele väärutustele juurde, mitte ei tee uut
        for (int i = 0; i < soned.size(); i++) {
            if (soned.get(i).charAt(0) == esimeneTaht) {
                String tahegaSone = soned.get(i);
                sobivaAlgusega.add(tahegaSone);
            }
        }
        String [] sobivaAlgusegaString = new String[sobivaAlgusega.size()];
        for (int i = 0; i < sobivaAlgusega.size(); i++) {
            sobivaAlgusegaString[i] = sobivaAlgusega.get(i);
        }
        return sobivaAlgusegaString;
    }

    public void eemaldaSona(String s) {
        soned.remove(s);
    }

    public void misKeelesRaamatOn() {
        System.out.println(keel);
    }

    public String misOnRaamatus() {
        return soned.toString();
    }
}