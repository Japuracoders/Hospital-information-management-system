package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User extends Person {
    public String userName;
    public Gender gender;
    public Date dOB;
    public String address;
    public MaritalStatus maritalStatus;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


    public User(String name, String phone, String nIC, String userName, Gender gender, String dOB, String address, MaritalStatus maritalStatus){
        super (name, phone, nIC);
        this.setUserName(userName);
        this.setGender(gender);
        this.setDOB(dOB);
        this.setAddress(address);
        this.setMaritalStus(maritalStatus);
    }

    //Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void setDOB(String dOB){
        try {
            this.dOB = formatter.parse(dOB);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setMaritalStus(MaritalStatus maritalStatus){
        this.maritalStatus = maritalStatus;
    }

    //getters
    public String getUserName(){
        return this.userName;
    }
    public Gender getGender(){
        return this.gender;
    }
    public Date getDOB(){
        return this.dOB;
    }
    public String getAddress(){
        return this.address;
    }
    public MaritalStatus getMaritalStatus(){
        return this.maritalStatus;
    }

    @Override
    public String toString(){
        return super.toString() + "," + this.getUserName() + "," + this.getGender() + "," + this.getDOB() + "," + this.getAddress() + "," + this.getMaritalStatus();
    }
}