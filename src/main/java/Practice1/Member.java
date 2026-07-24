package Practice1;

public class Member extends Human {
    private Integer age;
    private String email;

    public Member(String name, Integer age, String email) {
        super(name);
        this.age = age;
        this.email = email;
    }
    public String toString() {
        return String.format("Member=(id=%d, name=%s, age=%d, email=%s)",
                getId(), getName(), age, email);
    }
}
