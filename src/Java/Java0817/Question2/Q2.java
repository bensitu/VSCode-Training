package Java.Java0817.Question2;

public class Q2 {
    private String name;
    private String[] score;

    public Q2(String name, String[] score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public String[] getScore() {
        return this.score;
    }

    public String getTotalScore() {
        int sum = 0;
        for (String s : this.score) {
            if (s.equals("x")) {
                break;
            }
            if (s.endsWith("x")) {
                s = s.substring(0, s.length() - 1);
            }
            sum += Integer.parseInt(s);
        }
        return String.valueOf(sum);
    }
}
