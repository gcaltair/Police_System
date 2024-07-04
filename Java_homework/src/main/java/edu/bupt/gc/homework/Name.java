package edu.bupt.gc.homework;

public class Name {
    private String strFirstName;
    private String strLastName;

    public Name() {
    }

    public Name(String strFirstName, String strLastName) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
    }

    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }
    public String getFullName(){
        return this.strFirstName + "" + this.strLastName;
    }
}
