package OOP;
/**
 * Created by dmitri.kiriljuk on 28.01.2017.
 */
public class Pastakas {
    private int tindiKogus;

    public Pastakas(int tindiKogus) {
        this.tindiKogus = tindiKogus;
    }

    public void kirjuta(String s) {

        String replace = s.replaceAll(" ", "");
        int count = replace.length();

        this.tindiKogus = this.tindiKogus - count;
    }

    public void prindiPaljuTintiAlles() {
        System.out.println(tindiKogus);
    }
}
