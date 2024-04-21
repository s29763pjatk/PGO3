import java.util.ArrayList;
import java.util.List;

public class Tester extends Developer{

    public List<String> testType;
    int bonus = 0;

    public Tester(String name, String surname, String address, String email, int pesel, int hireYear) {

        super(name, surname, address, email, pesel, hireYear);
        this.testType = testType;
        this.bonus = bonus;
    }

    public void addTestType(String test){

        bonus += 300;

        try {
            testType.add(test);
        }
        catch (Exception e){
            testType = new ArrayList<>();
            System.out.println("creating testType list");
            addTestType(test);
        }
    }
}
