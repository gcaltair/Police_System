package edu.bupt.gc.homework;

import java.util.ArrayList;

public class Person implements IllegalEventSource {
    private Name name;
    private Address address;
    private String idCard;

    ArrayList<IllegalEventListener> listenerSet= new ArrayList<>();

    public Person() {
    }

    public Person(Name name, Address address, String idCard) {
        this.name = name;
        this.address = address;
        this.idCard = idCard;
    }

    public String getFullName(){
        return name.getFullName();
    }
    public String getFullAddress(){
        return address.getFullAddress();
    }
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public void addIllegalEventListener(IllegalEventListener eventListener) {
        listenerSet.add(eventListener);
    }

    @Override
    public void fireIllegalEvent(IllegalEvent illegalEvent) {
        if(listenerSet.size()==0) {
            System.out.println(this.getFullName()+"没有委托任何违法事件处理者...无法处理此违法事件");
            return;
        }
        for(IllegalEventListener listener:listenerSet){
            listener.dealwithIllegalEvent(illegalEvent);
        }

    }
}
