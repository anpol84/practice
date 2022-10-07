package practice12_15;

public class TestShirt {
    public static void main(String[] args) {
        String[] s = new String[11];
        s[0] = "S001,Black Polo Shirt,Black,XL";
        s[1] = "S002,Black Polo Shirt,Black,L";
        s[2] = "S003,Blue Polo Shirt,Blue,XL";
        s[3] = "S004,Blue Polo Shirt,Blue,M";
        s[4] = "S005,Tan Polo Shirt,Tan,XL";
        s[5] = "S006,Black T-Shirt,Black,XL";
        s[6] = "S007,White T-Shirt,White,XL";
        s[7] = "S008,White T-Shirt,White,L";
        s[8] = "S009,Green T-Shirt,Green,S";
        s[9] = "S010,Orange T-Shirt,Orange,S";
        s[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] sh = new Shirt[11];
        for (int i = 0; i < s.length; i++){
            String [] temp = s[i].split(",");
            sh[i] = new Shirt(temp);
            System.out.println(sh[i]);
        }
    }
}
