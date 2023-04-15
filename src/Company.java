import java.util.ArrayList;
public class Company {
    //public static void main(String[] args) {

    ArrayList<Employee> Emplist = new ArrayList<Employee>();
    void m1() {
        Employee obj1 = new Employee();
        obj1.Employee("neha", 23, 876904532, "telgna", "hyd", "comp");
        Employee obj2 = new Employee();
        obj2.Employee("Ashtha", 24, 678543679, "mh", "Aurg", "comp");
        Emplist.add(obj1);
        Emplist.add(obj2);
        System.out.println(Emplist.add(obj1));
        System.out.println(Emplist.add(obj2));
    }

}



