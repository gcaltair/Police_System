package edu.bupt.gc.homework;

public class Robber extends Person implements IRobbing{
    public Robber(Name name, Address address, String idCard) {
        super(name, address, idCard);
    }

    @Override
    public void illegalAct(Person person) {
        System.out.println(this.getFullName()+ " 抢劫 "+person.getFullName());
        IllegalEvent illegalEvent = new IllegalEvent(person,this);
        person.fireIllegalEvent(illegalEvent);
    }

    @Override
    public int getCrimeCode() {
        return CRIME_CODE;
    }
}
