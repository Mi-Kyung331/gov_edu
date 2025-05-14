package generic;

public class Main {

    /*
        와일드카드 (?) 의 제약 조건
            1. <? extends> 클래스자료형
                ↳ 해당 클래스 자료형의 자식 클래스자료형만 허용 (아래로 쭉 허용)
            2. <? super> 클래스자료형
                ↳ 해당 클래스 자료형의 부모 클래스자료형만 허용 (위로 쭉 허용)

            ⁕ Object는 상관 x
     */

    public static void showAll(Repository<? extends Student> repository) {
        repository.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Repository<HighStudent> hsRepo = new Repository<>();
        Repository<AcademyStudent> asRepo = new Repository<>();

        hsRepo.save(new HighStudent());
        asRepo.save(new AcademyStudent());

        showAll(hsRepo);

    }

}
