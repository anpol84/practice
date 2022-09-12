package practice7;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueGame {
    public static void game(int[] a, int[] b){
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ArrayDeque<Integer> bd = new ArrayDeque<Integer>();
        for (int i = 0; i < 5; i++){
            ad.add(a[i]);
            bd.add(b[i]);
        }
        int k = 0;
        while (k != 106){
            if (ad.isEmpty()){
                System.out.println("second " + k);
                return;
            }
            if (bd.isEmpty()){
                System.out.println("first " + k);
                return;
            }
            int temp1 = ad.pop(), temp2 = bd.pop();
            if (temp1 == 0 && temp2 == 9){
                ad.add(temp1);
                ad.add(temp2);
            }else if (temp1 == 9 && temp2 == 0){
                bd.add(temp2);
                bd.add(temp1);
            }else{
                if (temp1 > temp2){
                    ad.add(temp1);
                    ad.add(temp2);
                }else{
                    bd.add(temp2);
                    bd.add(temp1);
                }
            }
            k++;
        }
        System.out.println("botva");
    }

    public static void main(String[] args) {
        int [] a = new int[]{2, 3, 5, 8, 0};
        int [] b = new int[]{1, 9, 4, 7, 5};
        game(a, b);
    }
}
