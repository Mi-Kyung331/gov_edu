package lambda;

// https://bangu4.tistory.com/215
// 기본 함수형 인터페이스

// Collection 쓰는 이유
// 관련 데이터를 한 되로 묶기 위해
// 그 뒤 데이터 관리를 할 때 더욱 용이한 것을 선택하기 위해서 사용한다.

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaInterface {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("메인문처럼 쓸 수 있음");
        };
        runnable.run();


        Supplier<Double> supplier = () -> 10.101;
//        Supplier<String> supplier = () -> "10.10";
        // 그러면 get은 String을 가져온다.
        double d = supplier.get();
        System.out.println(d);


        Consumer<Integer> consumer = n -> {
            System.out.println("consumer 사용");
            System.out.println("전달받은 데이터: " + n);
        };
        consumer.accept(10000);

        List<Integer> numList = List.of(10, 20, 30, 40);
        numList.forEach(n -> System.out.println("number -> " + n));
        // return을 넣어봤자 forEach 메서드가 return되는 것이 아님
        // accept가 retur이 된다.


        Function<String, String> fx = name -> "이름: " + name;
        String nameText = fx.apply("강미경");
        System.out.println(nameText);

        UnaryOperator<String> fx2 = name -> "이름: " + name;
        nameText = fx2.apply("강미경");
        System.out.println(nameText);


        String searchName = "김준일";
        List<String> 일학년이름 = List.of("김준일", "김준이", "김준삼");
        List<String> 이학년이름 = List.of("김준사", "김준오", "김준육");
        Predicate<List<String>> isContains = list -> list.contains(searchName);
        System.out.println(isContains.test(일학년이름));
        System.out.println(isContains.test(이학년이름));

        // 위의 식과 반대로 움직이게 쓴 것
        Predicate<String> isContains2 = name -> 일학년이름.contains(name) || 이학년이름.contains(name);
        isContains2.test(searchName);

        List<String> dataList = List.of("aaaa", "bbbb", "cccc", "abaa", "bbaa", "ccbb");
        List<String> newDataList = new ArrayList<>();
        for (String data : dataList) {
            if (data.contains("a")) newDataList.add(data);
        }
        System.out.println(newDataList);

        List<String> newDataList2 = dataList.stream()
                .filter(data -> data.contains("a")) // filter대신 map도 자주 쓰인다.
                .collect(Collectors.toList());
        // 아니너무어려워서 죽겠다... 이게 무슨일이고 진짜 뭔말이지 하...




//        Stream<Integer> numStream = List.of(1, 2, 3, 4).stream();
        /*
            스트림 구성 단계
                첫번 째 단계 → 스트림 생성
                두번 째 단계 → 증간 생성 (조건에 맞는 데이터 구분, 데이터 값 수정, 정렬, 중복 제거, 제한, 건너뛰기)
                세번 째 단계 → 최종 연산 (반복, 결과, 수집, 개수 조회, 매칭 여부, 검색, 함산)

            스트림 특징
                반복 중 뒤로 돌아갈 수는 없다.
         */
        Stream<Integer> numStream = Stream.of(1, 2, 3, 4);
        numStream.filter(num -> num % 2 == 0).forEach(n -> System.out.println(n));

        // for문 위의 스트림문과 동일한 결과값이 나온다.
        List<Integer> numList2 = List.of(1, 2, 3, 4);
        for (Integer num : numList2) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

//        numStream.forEach(n -> System.out.println(n));
        // 결과값 : Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //	at java.base/java.util.stream.AbstractPipeline.<init>(AbstractPipeline.java:203)
        //	at java.base/java.util.stream.ReferencePipeline.<init>(ReferencePipeline.java:96)
        //	at java.base/java.util.stream.ReferencePipeline$StatelessOp.<init>(ReferencePipeline.java:800)
        //	at java.base/java.util.stream.ReferencePipeline$2.<init>(ReferencePipeline.java:167)
        //	at java.base/java.util.stream.ReferencePipeline.filter(ReferencePipeline.java:166)
        //	at lambda.LambdaInterface.main(LambdaInterface.java:80)
        // 연산을 사용했기 때문. Stream에서 연산은 한번밖에 사용지 못한다.
//        numStream.filter(num -> num % 2 == 0);
//        System.out.println(numStream);
        // 결과값 : java.util.stream.ReferencePipeline$Head@506e1b77
        // 보기 위해서는 반복을 돌려서 확인해야한다.



    }

}
