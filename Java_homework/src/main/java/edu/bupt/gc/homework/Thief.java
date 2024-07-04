package edu.bupt.gc.homework;

public class Thief extends Person implements IStealing{
    public Thief(Name name, Address address, String idCard) {
        super(name, address, idCard);
    }

    @Override
    public void illegalAct(Person person) {
        System.out.println(this.getFullName()+ " 偷窃 "+person.getFullName());
        IllegalEvent illegalEvent = new IllegalEvent(person,this);
        person.fireIllegalEvent(illegalEvent);
    }

    @Override
    public int getCrimeCode() {
        return CRIME_CODE;
    }
}
