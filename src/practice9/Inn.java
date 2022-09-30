package practice9;

import java.util.HashMap;
import java.util.Map;

public class Inn {
    private static Map<String, String> inn = new HashMap<>();
    public static void setInn(String name, String inn_){
        inn.put(inn_, name);
    }
    public static boolean checkInn(String name, String inn_) throws IncorrectInn {
        if (!inn.containsKey(inn_)) throw new IncorrectInn("Не существует такого инн");
        if (!inn.get(inn_).equals(name)) throw new IncorrectInn("Инн не соответствует ФИО");
        return true;
    }

}
