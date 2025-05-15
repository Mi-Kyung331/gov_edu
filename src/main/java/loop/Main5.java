package loop;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {

        // 단어의 시작이 대문자 A 또는 소문자 a로 시작하는 단어를 newWord 리스트에 담아 출력하시오
        List<String> words = List.of("Apple", "banana", "avocado", "carrot");

        List<String> newWord1 = new ArrayList<>();
        List<String> newWord2 = new ArrayList<>();
        List<String> newWord3 = new ArrayList<>();

        // 방법 1 - 단순한 조건검사
        for (String word : words) {
            if (word.startsWith("A") || word.startsWith("a")) {
                newWord1.add(word);
            }
        }

        // 방법 2 - 확인한 뒤 문자로 처리해야할 때
        for (String word : words) {
            char c = word.charAt(0);
            if (c == 'A' || c == 'a') {
                newWord2.add(word);
            }
        }

        // 방법 3 - 문자열로 첫번 째 글자만 잘라서 처리해야할 때
        for (String word : words) {
            String firstStr = word.substring(0, 1);
            if (firstStr.equalsIgnoreCase("a")) {
                newWord3.add(word);
            }
        }

        System.out.println(newWord1);
        System.out.println(newWord2);
        System.out.println(newWord3);



//        List<String> newWord = words.stream()
//                .filter(word -> word.startsWith("A") || word.startsWith("a"))
//                .sorted()
//                .toList();
//
//        System.out.println(newWord);

    }
}
