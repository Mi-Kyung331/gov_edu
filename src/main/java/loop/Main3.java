package loop;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        // 중복된 단어를 제외하고 출력하시오
        List<String> words = List.of("apple", "banana", "apple", "grape", "banana");

        // Set은 단어가 섞임
//        Set<String> remove = new HashSet<>();
//        remove.addAll(words);
//        System.out.println(remove);

        List<String> remove = new ArrayList<>();

        for (String word : words) {
            if (remove.contains(word)) {
                continue;
            }
            remove.add(word);
        }
        System.out.println(remove);

    }
}
