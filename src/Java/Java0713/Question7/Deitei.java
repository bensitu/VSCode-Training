
package Java.Java0713.Question7;

public class Deitei {
    int jyotei;
    int katei;
    int takasa;

    public Deitei(int jyotei, int katei, int takasa) {
        this.jyotei = jyotei;
        this.katei = katei;
        this.takasa = takasa;
    }

    public int getMenseki() {
        int menseki = (this.jyotei + this.katei) * this.takasa / 2;
        return menseki;
    }

}