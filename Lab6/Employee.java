package Lab6;

public class Employee {
    public Employee(){
        System.out.println("Normal\nName: Souvikarjun\n");
    }
    public Employee(int a){
        System.out.println("Overloaded\nName: Souvikarjun\nReg:2301020745");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(1);

    }
}
