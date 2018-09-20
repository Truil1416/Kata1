
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * @author Carlos Jubera Piñero
 */
public class Person {

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    private String name;
    private Calendar birthdate;
    private long MILLISECONDS_PER_YEAR;
    
    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        MILLISECONDS_PER_YEAR = (long)(1000*60*60*24*365.25);
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }
    
    public long milliSecondsToYear(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
    
}
