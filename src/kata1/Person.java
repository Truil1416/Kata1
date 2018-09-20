
package kata1;

import java.time.LocalDate;
import java.time.Period;


/**
 * @author Carlos Jubera Piñero
 */
public class Person {

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    private String name;
    private LocalDate birthdate;
    
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        return (int) Period.between(birthdate,today).getYears();
    }
    
    
}
