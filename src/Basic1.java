/**
 * Basic1
 */
public class Basic1 {

    public static void main(String[] args) {
        
        // printHello(10);

        System.out.println("sumOfNaturalNumber-> "+sumOfNaturalNumbers(5));

        System.out.println("aPowerB-> "+aPowerB(3,4));
    }

    static void printHello(int n){

        if(n == 0) return;
        System.out.println(n + "-> HELLO WORLD");
        printHello(n-1);
    }

    static int sumOfNaturalNumbers(int n){

        if(n == 0) return 0;

        return n + sumOfNaturalNumbers(n-1);
    }

    static int aPowerB(int a, int b){

        if(b==0) return 1;

        return a*aPowerB(a, b-1);
    }
}