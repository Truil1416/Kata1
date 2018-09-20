
package kata1;

import java.util.Date;

/**
 * @author Carlos Jubera Piñero
 */
public class Person {

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    private String name;
    private Date birthdate;
    
    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
}
