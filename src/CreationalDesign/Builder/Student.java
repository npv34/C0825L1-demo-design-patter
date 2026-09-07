package src.CreationalDesign.Builder;

public class Student {
    // 10 thuoc tinh
    private  String name;
    private  int age;
    private  String major;
    private  String gpa;
    private  String address;
    private  String city;
    private  String state;
    private  String zip;
    private  String country;

    public Student() {}

    public Student(String name, int age, String major, String gpa, String address, String city, String state, String zip, String country) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
