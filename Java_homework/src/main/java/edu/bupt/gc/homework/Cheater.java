package edu.bupt.gc.homework;

public class Cheater extends Person implements ICheating{

    public Cheater(Name name, Address address, String idCard) {
        super(name, address, idCard);
    }
    @Override
    public void illegalAct(Person person) {
        System.out.println(this.getFullName()+ " 诈骗 "+person.getFullName());
        IllegalEvent illegalEvent = new IllegalEvent(person,this);
        person.fireIllegalEvent(illegalEvent);
    }

    @Override
    public int getCrimeCode() {
        return CRIME_CODE;
    }
}
