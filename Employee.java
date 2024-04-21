public class Employee {

    public String name;
    public String surname;
    public String address;
    public String email;
    public int pesel;
    public int hireYear;


    public Employee(String name, String surname, String address, String email, int pesel, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.hireYear = hireYear;
    }

    public int calculateSalary(){

        int base = 3000;

        return base + (2024 - this.hireYear) * 1000;

    }
}
