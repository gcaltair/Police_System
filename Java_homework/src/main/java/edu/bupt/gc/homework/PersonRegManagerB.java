package edu.bupt.gc.homework;

public class PersonRegManagerB extends AbstractPersonalRegManagerDecorator{
    public PersonRegManagerB(IPersonalRegManager personalRegManager) {
        super(personalRegManager);
    }

    @Override
    public void add(PersonalRegInfo pi) {
        personalRegManager.add(pi);
    }

    @Override
    public void println() {
        for(PersonalRegInfo pi: personalRegManager.getEntries())
        {
            System.out.println("注册日期:"+pi.getRegistDate());
            System.out.println("居民姓名:"+pi.getResidentName());
            System.out.println("地   址:"+pi.getResidentAddress());
            System.out.println("注册警局:"+pi.getPoliceStationName());
            System.out.println();
        }
    }
}
