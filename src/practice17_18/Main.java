package practice17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean checking(String regex, String s){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String s1_1 = "abcdefghijklmnopqrstuv18340";
        String s1_2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String regex1 = "^abcdefghijklmnopqrstuv18340$";
        System.out.println(checking(regex1, s1_1));
        System.out.println(checking(regex1, s1_2));

        String s2_1 = "aE:dC:cA:56:76:54";
        String s2_2 = "01:23:45:67:89:Az";
        String regex2 = "^[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:[0-9]{2}:[0-9]{2}:[0-9]{2}$";
        System.out.println(checking(regex2, s2_1));
        System.out.println(checking(regex2, s2_2));


        String s3_1 = "dsada ca 23.78 USD dsdad 0.2 RUR dasda 14 EU";
        String s3_2 = "dsada ca 23.78 USR dsdad  0.002 UDD dasda 14 RUR";
        String regex3 = "[0-9]+\\.?[0-9]{0,2}\\s((USD)|(RUR)|(EU))";
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher1 = pattern.matcher(s3_1);
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }
        Matcher matcher2 = pattern.matcher(s3_2);
        System.out.println();
        while(matcher2.find()){
            System.out.println(matcher2.group());
        }


    }
}
