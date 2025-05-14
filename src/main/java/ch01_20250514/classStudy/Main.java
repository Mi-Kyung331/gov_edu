package ch01_20250514.classStudy;

import java.util.ArrayList;
import java.util.List;

// 싱글톤 - 메모리를 아끼면서 같은 객체 주소에 위치한 것들을 실행시키기 위해 사용.
class UserAndAdminRepository {
    List<User> userList = new ArrayList<>();
    // 캡슐화 - 외부에서 데이터를 보호하기 위해 private를 실행
    private static UserAndAdminRepository instance;
    // 캡슐화
    private UserAndAdminRepository() {}

    static UserAndAdminRepository getInstance() {
        if (instance == null) {
            instance = new UserAndAdminRepository();
        }
        return instance;
    }

    void insert() {
        userList.add(new User());
        System.out.println("사용자 또는 관리자 정보 추가");
    }

    void delete() {
        userList.add(new User());
        System.out.println("사용자 또는 관리자 정보 삭제");
    }
}

class AdminService {
    void addAdmin() {
        UserAndAdminRepository.getInstance().insert();
    }
    void removeAdmin() {
        UserAndAdminRepository.getInstance().delete();
    }
}

class UserService {
    void addUser() {
        UserAndAdminRepository.getInstance().insert();
    }
    void removeUser() {
        UserAndAdminRepository.getInstance().delete();
    }
}

class User {
    static String userType = "사용자";
    String username = "user1";
    String password = "pw1";
}


public class Main {

    public static void main(String[] args) {


        // 파이썬
//        username = "testuser1";
//        password = "1234";
//        username2 = "testuser2";
//        password = "1111";

        // 자바
        String username1 = "testuser1";
        String password1 = "1234";
        String username2 = "testuser2";
        String password2 = "1111";

        // 자바스크립트
//        user1 = {
//                username: "teatuser1",
//                password: "1234"
//        };
//        user2 = {
//                username: "teatuser2",
//                password: "1111"
//        };

        new User().username = "testuser1";
        new User().password = "1111";
        User u = new User();
        u.username = "testuser2";
        u.password = "1234";

        User.userType = "관리자";
//        u.userType    ← "관리자"


        AdminService adminService = new AdminService();
        UserService userService = new UserService();

    }


}
