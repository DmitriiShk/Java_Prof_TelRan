package SummarySessions.December.SumSes_061224.Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    /*
    Имеется текст с логинами и паролями. Найти в тексте выражения вида
    "login: admin, password: sKb122", составить из них Map<login, password>
    */

    public static void main(String[] args) {

        String inputText = "login: admin, password: sKb122\nlogin: user, password: pass123";

         Map<String, String> result = extractLoginsAndPasswords(inputText);

        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println("Login: " + entry.getKey() + ", Password: " + entry.getValue());
        }

    }

    public static Map<String, String> extractLoginsAndPasswords(String text) {

        String regex = "login:\\s*(\\w+),\\s*password:\\s*(\\w+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        Map<String, String> loginPasswordMap = new HashMap<>();

        while (matcher.find()) {
            String login = matcher.group(1); // Логин
            String password = matcher.group(2); // Пароль
            loginPasswordMap.put(login, password);
        }

        return loginPasswordMap;
    }

}
