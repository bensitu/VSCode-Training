
package Java.Java0713.Question7;

public class Deitei {
    int jyotei;
    int katei;
    int takasa;

    public int getMenseki(int jyotei, int katei, int takasa) {
        int menseki = (jyotei + katei) * takasa / 2;
        return menseki;
    }

}