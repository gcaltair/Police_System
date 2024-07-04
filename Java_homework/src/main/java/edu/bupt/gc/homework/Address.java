package edu.bupt.gc.homework;

public class Address {
    private String strState;
    private String strCity;

    public Address() {
    }

    public Address(String strState, String strCity) {
        this.strState = strState;
        this.strCity = strCity;
    }

    public String getStrState() {
        return strState;
    }

    public void setStrState(String strState) {
        this.strState = strState;
    }

    public String getStrCity() {
        return strCity;
    }

    public void setStrCity(String strCity) {
        this.strCity = strCity;
    }
    public String getFullAddress(){
        return this.strState + "." + this.strCity;
    }
}
