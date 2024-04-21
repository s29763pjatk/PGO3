import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee{

    public List<Technology> knownTechnologies;

    public Developer(String name, String surname, String address, String email, int pesel, int hireYear) {
        super(name, surname, address, email, pesel, hireYear);

    }


        public void addTechnology(Technology technology){

            try {
                knownTechnologies.add(technology);
            }
            catch (Exception e){
                knownTechnologies = new ArrayList<>();
                System.out.println("creating technology list");
                addTechnology(technology);
            }

        }


}
