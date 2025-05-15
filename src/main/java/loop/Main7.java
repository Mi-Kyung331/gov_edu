package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main7 {

    static class StudentName {

        private String name;

        public StudentName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "StudentName{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {

        // Student 객체들을 전부 StudentName 객체들로 변환하여 리스트를 출력하시오.
        List<StudentName> studentNames = new ArrayList<>();
        List<StudentName> studentNames2 = null;


        List<Student> students = List.of(
                new Student("김준일", 88),
                new Student("김준이", 94),
                new Student("김준삼", 75),
                new Student("김준사", 99),
                new Student("김준오", 85)
        );

        // 방법 1
        for (Student student : students) {
            if (student.getScore() > 84) {
                studentNames.add(new StudentName(student.getName()));
            }
        }
        System.out.println(studentNames);

        // 방법 2
//        for (Student student : students) {
//            if (student.getScore() < 85) {
//                continue;
//            }
//            studentNames.add(new StudentName(student.getName()));
//        }
//        System.out.println(studentNames);


        studentNames2 = students.stream()
                .peek(student -> System.out.println(student))
                .filter(student -> student.getScore() > 84)
                .map(student -> new StudentName(student.getName()))
                .collect(Collectors.toList());
        System.out.println(studentNames2);

    }
}
