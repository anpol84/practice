package practice5;

public class Main {
    public static void triangle(int k){
        if (k == 1){
            System.out.print(1 + " ");
            return;
        }
        triangle(k-1);
        for (int i =0; i < k; i++){
            System.out.print(k + " ");
        }
    }
    public static void num(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        num(n-1);
        System.out.println(n);
    }

    public static void ab(int a, int b){
        if (a == b){
            System.out.println(a);
            return;
        }
        if (a < b){
            System.out.print(a + " ");
            a++;
            if (a == b) {
                System.out.print(a + " ");
                return;
            }
            ab(a, b);
        }else{
            System.out.print(a + " ");
            a--;
            if (a == b) {
                System.out.print(a + " ");
                return;
            }
            ab(a, b);
        }
    }

    public static void sum1(){

    }

    public static int sum2(int n){
        if ((n / 10) == 0){
            return n % 10;
        }else{
            return n % 10 + sum2(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum2(524));
    }
}
