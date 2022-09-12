package practice7;

import java.util.Stack;

public class StackGame {
    public static void game(int[] a, int[] b){
        Stack<Integer> as1 = new Stack();
        Stack<Integer> as2 = new Stack();
        Stack<Integer> bs1 = new Stack();
        Stack<Integer> bs2 = new Stack();
        for (int i = 4 ; i >= 0; i--){
            as1.add(a[i]);
            bs1.add(b[i]);
        }
        int k = 0;
        while (k != 106){
            if (as1.empty()){
                if (as2.empty()){
                    System.out.println("second " + k);
                    return;
                }else{
                    while(!as2.empty()){
                        as1.add(as2.pop());
                    }
                }
            }else if (bs1.empty()){
                if (bs2.empty()){
                    System.out.println("first " + k);
                    return;
                }else{
                    while(!bs2.empty()){
                        bs1.add(bs2.pop());
                    }
                }
            }else {
                int temp1 = as1.pop(), temp2 = bs1.pop();
                if (temp1 == 0 && temp2 == 9) {
                    as2.add(temp1);
                    as2.add(temp2);
                    k++;
                } else if (temp1 == 9 && temp2 == 0) {
                    bs2.add(temp2);
                    bs2.add(temp1);
                    k++;
                } else {
                    if (temp1 > temp2) {
                        as2.add(temp1);
                        as2.add(temp2);
                        k++;
                    } else {
                        bs2.add(temp2);
                        bs2.add(temp1);
                        k++;
                    }
                }
            }
        }
        System.out.println("botva");
    }

    public static void main(String[] args) {
        int [] a = new int[]{2, 3, 5, 8, 0};
        int [] b = new int[]{1, 9, 4, 7, 5};
        game(a, b);
    }
}
