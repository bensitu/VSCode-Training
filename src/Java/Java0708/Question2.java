package Java.Java0708;

public class Question2 {
    public static void main(String[] args) {
        // int Onndori = 500;
        // int Mendori = 300;
        // int Wakadori = 100 / 3;

        // int Okane = 10000;
        int n, m, count = 0;

        for (n = 0; n <= 20; n++) {
            //System.out.println(n);
            for (m = 0; m <= 33; m++) {
                //System.out.println(m);
                if (((100 - m - n) % 3 == 0) && (500 * n + 300 * m + (100 / 3) * (100 - m - n) == 10000)) {
                    System.out.println("雄鶏は" + n + "羽が買えます。");
                    System.out.println("雌鶏は" + m + "羽が買えます。");
                    System.out.println("若鶏は" + (100 - m - n) + "羽が買えます。");
                    count++;
                }
            }
        }
        System.out.println(count + "種方法があります。");
    }
}
