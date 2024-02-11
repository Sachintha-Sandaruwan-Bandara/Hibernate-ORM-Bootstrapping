package embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.soap.Name;

/*
    @author Sachi_S_Bandara
    @created 2/11/2024 - 4:24 PM 
*/
@Embeddable
public class MobileNumber {
    @Column(name="mobile_no_type")
    private String type;

    @Column(name="mobile_no")
    private String mobileNumber;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
