package edu.bupt.gc.homework;

import java.util.Date;

public class PersonalRegInfo {
    Date registDate;
    String residentName;
    String residentAddress;
    String policeStationName;

    public PersonalRegInfo(String residentName, String residentAddress, String policeStationName) {
        this.residentName = residentName;
        this.residentAddress = residentAddress;
        this.policeStationName = policeStationName;
    }

    public PersonalRegInfo() {

    }

    public Date getRegistDate() {
        return registDate;
    }

    public String getResidentName() {
        return residentName;
    }

    public String getResidentAddress() {
        return residentAddress;
    }

    public String getPoliceStationName() {
        return policeStationName;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public void setResidentAddress(String residentAddress) {
        this.residentAddress = residentAddress;
    }

    public void setPoliceStationName(String policeStationName) {
        this.policeStationName = policeStationName;
    }
}
