package edu.bupt.gc.homework;

public class Resident extends Person{

    public Resident() {
    }

    public Resident(Name name, Address address, String idCard) {
        super(name, address, idCard);
        System.out.println("居民"+name.getFullName()+"出场了");
    }
}
