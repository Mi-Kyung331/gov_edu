package ch01_20250514.service;
/*

이 때 username이 중복이면 추가할 수 없다.
printAll 메소드를 정의하고 모든 사용자 정보를 출력한다.
printByUsername 메소드를 정의하고 해당 username의 사용자 정보를 출력한다.
 */

import ch01_20250514.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList;

    private static UserService instance;

    private UserService() {
        userList = new ArrayList<>();
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

}
