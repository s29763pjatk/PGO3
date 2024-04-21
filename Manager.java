import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    List<Goal> goals;

    public Manager(String name, String surname, String address, String email, int pesel, int hireYear) {
        super(name, surname, address, email, pesel, hireYear);
        this.goals = goals;
    }

    public void addGoals(Goal goal){
        try {
            goals.add(goal);
        }
        catch (Exception e){
            goals = new ArrayList<>();
            System.out.println("creating goal list");
            addGoals(goal);
        }
    }
}
