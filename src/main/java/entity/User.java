package entity;
/*
    entity 패키지 생성 후 User 클래스를 정의 > 사용자 정보를 저장하기 위해
    User 클래스의 속성은 아래와 같다
    username, password, name, email, phone, address, rolses
    각각의 변수명을 보고 자료형을 생각하여 정의해본다.

    User 클래스는 AllArgsConsturctor와 NoArgsConstructor를 가진다.
    Getter, Setter, toString도 가진다. (롬복 또는 자동완성 사용 금지)
 */

public class User {
    String username;
    int password;
    String name;
    String email;
    int phone;
    String address;
    char rolses;


    // 생성자
    public User() {

    }

    public User(String username, int password, String name, String email, int phone, String address, char roles) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.rolses = roles;
    }

    // setter / getter
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public int getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setRolses(char rolses) {
        this.rolses = rolses;
    }
    public char getRolses() {
        return rolses;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", rolses=" + rolses +
                '}';
    }
}
