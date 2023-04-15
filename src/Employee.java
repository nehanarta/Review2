public class Employee {
    private String name;
    private int age;
    private long phoneNo;
    private String state;
    private String city;
    private String department;

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

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void Employee(String name, int age, long phoneNo, String state, String city, String department){
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
        this.state=state;
        this.city=city;
        this.department=department;


    }
}
