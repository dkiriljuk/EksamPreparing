package OOP;

/**
 * Created by dmitri.kiriljuk on 28.01.2017.
 */
public class Zelda {
    private int elusid;
    private int kollilElusid;

    public Zelda(int elusid) {
        this.elusid = elusid;
    }

    public void kaklusKolliga(int kollilElusid) {
        
        this.elusid = this.elusid - this.kollilElusid;

    }

    public void prindiMituEluAlles() {

        System.out.println(elusid);

    }

    public void prindiKasOnElus() {
        if(this.elusid < 0)
            System.out.println("Ei ole elusid");
        else
            System.out.print("Elusid on: " + this.elusid);
    }
}
