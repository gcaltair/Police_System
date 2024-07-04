package edu.bupt.gc.homework;

import java.util.ArrayList;
import java.util.Date;

public abstract class AbstractPoliceStation implements IllegalEventListener {
    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    protected Address location;
    protected ArrayList<Police> polices = new ArrayList<Police>();
    //protected ArrayList<Person> residents = new ArrayList<Person>();
    protected IPersonalRegManager regManager;

    public void setRegManager(IPersonalRegManager regManager) {
        this.regManager = regManager;
    }

    protected void printPersonRegManager()
    {
        System.out.println("");
        System.out.println("............................................");
        System.out.println("   "+this.getStationName()+"在册居民登记信息:");
        System.out.println("............................................");
        regManager.println();
    }
    public AbstractPoliceStation() {
    }

    public AbstractPoliceStation(Address location) {
        this.location = location;
    }

    public void employ(Police police){
        System.out.println(police.getFullName()+"加入"+this.getStationName());
        polices.add(police);
    }
    public String getStationName(){
        return location.getFullAddress()+"警察局";
    }

    public final void registerResident(Person person) throws Exception {
        if(!checkIDCard(person)) {
            System.out.println("注册失败，因为检查身份证失败");
            throw new Exception("身份证检查失败");
            //return;
        }
        takePhoto(person);
        establishArchive(person);
        //residents.add(person);
        System.out.println(person.getFullName()+"在"+this.getStationName()+"登记成功");
    }
    public abstract boolean checkIDCard(Person person);
    public abstract void takePhoto(Person person);
    public  void establishArchive(Person person)
    {
        PersonalRegInfo pi=new PersonalRegInfo();
        pi.setPoliceStationName(this.getStationName());
        pi.setRegistDate(new Date(System.currentTimeMillis()));
        pi.setResidentAddress(person.getFullAddress());
        pi.setResidentName(person.getFullName());
        System.out.println(person.getFullName()+"在"+this.getStationName()+"建立档案");
        this.regManager.add(pi);
    }
    public abstract void dealwithIllegalEvent(IllegalEvent event);
}
