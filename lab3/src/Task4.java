import java.util.regex.Matcher;
import java.util.regex.Pattern;


void main() {
    String text = "Versions: Java 5, Java  6, Java   7, Java 8,Java 12.";

    // Шаблон для поиска "Java " и одной или более цифр
    Pattern pattern = Pattern.compile("Java\\s+\\d+");
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
        System.out.println(matcher.group());
    }
}
