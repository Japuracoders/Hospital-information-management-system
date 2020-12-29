package Model;

import java.util.Date;

public abstract class Receptionist extends Staff{
    protected Receptionist(String name, String phone, String nIC, String userName, Gender gender, String dOB, String address, MaritalStatus maritalStatus, String staffID, String staffEmailAddress, String dateJoining, Image staffPhotograph) {
        super(name, phone, nIC, userName, gender, dOB, address, maritalStatus, staffID, staffEmailAddress, dateJoining, staffPhotograph);
    }

    //Methods
    public abstract Image defaultStaffPhotograph();
}
