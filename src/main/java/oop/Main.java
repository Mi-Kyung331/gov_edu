package oop;

public class Main {

    public static void main(String[] args) {
//        UserRepository userRepository = new BasicUserRepository();
//        BasicUserService userService = new BasicUserService(userRepository);

        BasicUserService userService = new BasicUserService(new BasicUserRepository());
//        BasicUserService userService = new BasicUserService(new CustomUserRepository());


        userService.addUser();
    }


}
