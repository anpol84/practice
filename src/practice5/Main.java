package practice5;

import java.util.Scanner;

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

    public static int sum1(int l, int tempS, int k, int s){
        if (l == k){
            if (tempS == s) return 1;
            else return 0;
        }
        int ans = 0;
        if (l == 0){
            for (int i = 1; i < 10; i++){
                ans += sum1(l+1, tempS+i, k, s);
            }
        }else{
            for (int i = 0; i < 10; i++){
                ans += sum1(l+1, tempS+i, k, s);
            }
        }
        return ans;
    }

    public static int sum2(int n){
        if ((n / 10) == 0){
            return n % 10;
        }else{
            return n % 10 + sum2(n / 10);
        }
    }

    public static boolean isSimple(int n, int i){
        if (n == 2) return true;
        else if (n % i == 0) return false;
        else if (i < n/2) return isSimple(n, i+1);
        else return true;
    }

    public static void factor(int n, int i){
        if (i > n/2){
            System.out.print(n);
            return;
        }
        if (n % i == 0){
            System.out.print(i + " ");
            factor(n / i, i);
        }else{
            factor(n, i+1);
        }
    }

    public static String palindrom(String s, int i){
        if (i > s.length()/2){
            return "YES";
        }else if (s.charAt(i) == s.charAt(s.length()-i-1)){
            return palindrom(s, i+1);
        }else{
            return "NO";
        }
    }

    public static int withoutNull(int a, int b){
        if (a == 0 || b == 0) return 1;
        if (a > b + 1) return 0;
        return withoutNull(a, b - 1) + withoutNull(a- 1, b - 1);
    }

    public static int reverse(int n, int i){
        if (n == 0) return i;
        else return reverse(n / 10, i*10 + n%10);
    }

    public static int count1(int n, int m, int f){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (m < 2 && x == 1) n++;
        if (x == 0 ) {
            f++;
            m++;
        }
        else f = 0;
        if (f == 2) return n;
        return count1(n, m, f);
    }

    public static void func1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        if (n % 2 != 0) System.out.println(n);
        func1();
    }

    public static void func2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        System.out.println(n);
        int k = sc.nextInt();
        if (k == 0) return;
        func2();
    }

    public static void numbers1(int n){
        if (n == 0) return;
        numbers1(n / 10);
        System.out.print(n % 10 + " ");
    }

    public static void numbers2(int n){
        if (n == 0) return;
        System.out.print(n % 10 + " ");
        numbers2(n / 10);
    }

    public static int countMax(int n, int count){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m == 0) return count;
        if (m > n) return countMax(m, 1);
        else if (m == n) return countMax(m, ++count);
        else return countMax(n, count);
    }

    public static int max(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m == 0) return 0;
        return Math.max(m, max());
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        triangle(5);
        System.out.println();
        triangle(1);



        System.out.println('\n' + "////////////////////");
        System.out.println("Test 2");
        num(5);
        num(1);


        System.out.println("////////////////////");
        System.out.println("Test 3");
        ab(5, 10);
        System.out.println();
        ab(10, 5);
        System.out.println();
        ab(5, 5);


        System.out.println('\n' + "////////////////////");
        System.out.println("Test 4");
        System.out.println(sum1(0, 0,3, 15));
        System.out.println(sum1(0, 0, 2, 15));
        System.out.println(sum1(0, 0, 1, 6));


        System.out.println("////////////////////");
        System.out.println("Test 5");
        System.out.println(sum2(12345));
        System.out.println(sum2(5));


        System.out.println("////////////////////");
        System.out.println("Test 6");
        System.out.println(isSimple(17, 2));
        System.out.println(isSimple(2, 2));
        System.out.println(isSimple(245, 2));


        System.out.println("////////////////////");
        System.out.println("Test 7");
        factor(50, 2);
        System.out.println();
        factor(12, 2);
        System.out.println();
        factor(6, 2);
        System.out.println();
        factor(17, 2);
        System.out.println();


        System.out.println("////////////////////");
        System.out.println("Test 8");
        System.out.println(palindrom("abba", 0));
        System.out.println(palindrom("abcba", 0));
        System.out.println(palindrom("cba", 0));
        System.out.println(palindrom("a", 0));

        System.out.println("////////////////////");
        System.out.println("Test 9");
        System.out.println(withoutNull(10, 9));
        System.out.println(withoutNull(9, 10));
        System.out.println(withoutNull(10, 10));
        System.out.println(withoutNull(10, 5));
        System.out.println(withoutNull(5, 10));


        System.out.println("////////////////////");
        System.out.println("Test 10");
        System.out.println(reverse(345, 0));
        System.out.println(reverse(1, 0));
        System.out.println(reverse(1234, 0));

        System.out.println("////////////////////");
        System.out.println("Test 11");
        //System.out.println(count1(0, 0, 0));

        System.out.println("////////////////////");
        System.out.println("Test 12");
        //func1();

        System.out.println("////////////////////");
        System.out.println("Test 13");
        //func2();

        System.out.println("////////////////////");
        System.out.println("Test 14");
        numbers1(12345);
        System.out.println();
        numbers1(120);
        System.out.println();
        numbers1(6);
        System.out.println();

        System.out.println("////////////////////");
        System.out.println("Test 15");
        numbers2(12345);
        System.out.println();
        numbers2(120);
        System.out.println();
        numbers2(6);
        System.out.println();

        System.out.println("////////////////////");
        System.out.println("Test 16");
        //System.out.println(countMax(0, 0));

        System.out.println("////////////////////");
        System.out.println("Test 17");
        //System.out.println(max());
    }

}
