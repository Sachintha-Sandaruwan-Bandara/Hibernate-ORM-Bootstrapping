package embedded;
/* 
    @author Sachi_S_Bandara
    @created 2/11/2024 - 3:48 PM 
*/

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import javax.persistence.Embeddable;

@Embeddable
public class NameIdentifier {

    private String firstName;
    private String middleName;
    private String lastName;

    public NameIdentifier() {
    }

    public NameIdentifier(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "NameIdentifier{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
