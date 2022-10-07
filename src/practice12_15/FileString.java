package practice12_15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileString {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        try(FileReader fileReader = new FileReader(filePath)){
            Scanner scanner = new Scanner(fileReader);
            String ans = scanner.nextLine();
            ans = getLine(ans);
            System.out.println(ans);
        }catch (IOException e){
            e.getMessage();
        }

    }
    public static String getLine(String s){
        ArrayList<String> words = new ArrayList<>(List.of(s.split(" ")));
        StringBuilder s1 = new StringBuilder();
        AnswerString ans = new AnswerString(s1, false);
        if (words.size() != 0){
            for (int i = 0; i < words.size(); i++){
                ans = check_w(s1, words, i);
                if (ans.res) return s1.toString();
                if (i == words.size()-1) return s1.toString();
                s1 = new StringBuilder();
            }

        }
        return s1.toString();
    }
    public static AnswerString check_w(StringBuilder s, ArrayList<String> words, int i){
        ArrayList<String> copyWords = (ArrayList<String>)words.clone();
        s.append(copyWords.get(i));
        copyWords.remove(i);
        int count = 0;
        while (copyWords.size() != 0){
            for (int j = 0; j < copyWords.size(); j++){
                if (s.charAt(s.length()-1) == copyWords.get(j).charAt(0)){
                    s.append(" ").append(copyWords.get(j));
                    copyWords.remove(j);
                }
                count++;
            }
            if (count == copyWords.size() && copyWords.size() != 0){
                s.append(" didnt use this words: ");
                for (String word : copyWords){
                    s.append(" ").append(word);
                }
                return new AnswerString(s, false);
            }
            count = 0;
        }
        return new AnswerString(s, true);
    }

}
class AnswerString{
    protected StringBuilder s;
    protected boolean res;

    public AnswerString(StringBuilder s, boolean res) {
        this.s = s;
        this.res = res;
    }
}
