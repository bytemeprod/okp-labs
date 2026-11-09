void main() {
    String sentence = "Найти самое длинное слово в предложении";

    String[] words = sentence.split(" ");

    String longestWord = "";
    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }

    System.out.println("Предложение: " + sentence);
    System.out.println("Самое длинное слово: " + longestWord);
}