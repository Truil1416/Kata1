
package kata1;

import java.util.Date;

/**
 * @author Carlos Jubera Piñero
 */
public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Epi", new Date(98,8,1));
        System.out.println(person.getName()+" tiene "+person.getAge()+" años");
    }
}
