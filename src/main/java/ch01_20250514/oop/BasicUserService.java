package ch01_20250514.oop;

public class BasicUserService {

    // 업캐스팅
    private UserRepository userRepository = new BasicUserRepository();
    // 다운캐스팅
//    private CustomUserRepository userRepository2 = (CustomUserRepository) userRepository;
//    private BasicUserRepository userRepository2 = (BasicUserRepository) userRepository;

    // 생성자
    public BasicUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser() {
        System.out.println("기본 사용자 추가");
        userRepository.insert();
    }

}