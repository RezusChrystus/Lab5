import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> persons= new ArrayList<>();


    public PersonService(Person ... p) {
        for (Person el : p){
            persons.add(el);
        }
    }
    public void displayAll(){
        for (Person p : persons){
            p.wyswietlInfo();
        }
    }
    public void addP(Person p){
        persons.add(p);
    }
}
