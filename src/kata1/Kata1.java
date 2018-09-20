
package kata1;

import java.time.LocalDate;


/**
 * @author Carlos Jubera Piñero
 */
public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1998,9,1);
        Person person = new Person("Epi", date);
        System.out.println(person.getName()+" tiene "+person.getAge()+" años");
    }
}
