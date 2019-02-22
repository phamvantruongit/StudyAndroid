package vn.com.it.truongpham.study_android;

public class Object {
    private final String firstName;
    private final String lastName;
    public Object(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
