package edu.bupt.gc.homework;

import java.util.ArrayList;

public class PersonRegManager implements IPersonalRegManager{
    private ArrayList<PersonalRegInfo> entries=new ArrayList<>(10);

    @Override
    public void add(PersonalRegInfo pi) {
        entries.add(pi);
    }

    @Override
    public void println() {
        for(PersonalRegInfo pi:entries)
        {
            System.out.println("居民姓名:"+pi.getResidentName()+
                    " 注册日期:"+pi.getRegistDate()
            +" 地址:"+pi.getResidentAddress()
            +" 注册警局:"+pi.getPoliceStationName());
        }
    }

    @Override
    public ArrayList<PersonalRegInfo> getEntries() {
        return entries;
    }
}
