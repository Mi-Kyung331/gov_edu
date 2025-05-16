package loop;

import java.util.ArrayList;
import java.util.List;

public class Main8 {

    public static void main(String[] args) {
        // newWord에 1. bread, 2. milk, 3. egg 처럼 앞에 숫자를 붙여서 옮기시오
        List<String> words = List.of("bread", "milk", "egg");
        List<String> newWord = new ArrayList<>();

        for(int i =0; i < words.size(); i++) {
            newWord.add((i + 1) + "." + words.get(i));
        }
        System.out.println(newWord);


        //  ints 리스트에 Integer 지료형으로 옮기시오
        List<Double> doubles = List.of(1.12, 2.23, 3.34, 4.45);
        // 인덱스가 필요가 없음
        List<Integer> ints = new ArrayList<>();

        for (Double d : doubles) {
            // 다운캐스팅을 해주어야함 double 은 int보다 상위인덱스이기 때문
            // 그런데 여기는 double이 integer보다 상위의 존재가 아닌 형제관계이다.
            // double을 integer로 형변환이 불가능하다.
            // box / unbosing
            double dd = d;
            int i = (int) dd;
            ints.add(i);
            ints.add(d.intValue());
        }
        System.out.println(ints);

        // boxing / unboxing
        // boxing 타입 (일반자료형을 래퍼클래스로 변환)
        int a = 10; // 일반자료형
//        Integer b = 10; // 래퍼 클래스 (일반 자료형을 응용해서 만든 클래스)
//        Integer b = new Integer(10);
        Integer b = (Integer) a;
        // unboxing 타입 (반대로 래퍼클래스를 일반자료형으로 변환)
        int c = (int) b;
        System.out.println(a + b);

    }
}
