package Java.Java0705;

class Sum {
    public static void main (String[] args){
        Num n1 = new Num();
        Num n2 = new Num();
        n1.x=13;
        n2.y=17;
        //System.out.println("Sum = " + (n1.x + n2.y));
        //System.out.println("Sum = " + (n1.x * n2.y));

        Num n3 = new Num();
        n3.z = 7;

        
        int x = 5;

        //System.out.println(n3.z*3);
        //System.out.println(n3.z);
        //System.out.println(n3.z*0.5);
        System.out.println(x++);
        System.out.println(++x);
    }
} 
class Num {
    int x;
    int y;
    double z;
}

