package practice12_15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private String phone;
    public Phone(String number){
        if (number.charAt(0) != '+'){
            number = "+7" + number.substring(1);
        }
        Pattern pattern = Pattern.compile("(\\+\\d+)(\\d{3})(\\d{3})(\\d{4})$");
        Matcher matcher = pattern.matcher(number);
        matcher.find();
        phone = new StringBuilder().append(matcher.group(1)).append(matcher.group(2)).
                append('-').append(matcher.group(3)).append('-').append(matcher.group(4)).toString();
    }

    @Override
    public String toString() {
        return phone;
    }
}
