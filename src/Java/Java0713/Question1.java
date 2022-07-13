package Java.Java0713;

public class Question1 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 11, 22, 33, 44, 55 };
        System.out.println("We need to change " + arr1[2]);
        changeWord(arr1);
        System.out.println("Now we have the list ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static void changeWord(int[] arr1) {
        arr1[2] = 90;
    }
}
