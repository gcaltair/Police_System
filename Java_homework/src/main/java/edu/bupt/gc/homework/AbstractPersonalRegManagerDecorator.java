package edu.bupt.gc.homework;

import java.util.ArrayList;

public abstract class AbstractPersonalRegManagerDecorator implements IPersonalRegManager{

    protected IPersonalRegManager personalRegManager;
    public AbstractPersonalRegManagerDecorator(IPersonalRegManager personalRegManager)
    {
        this.personalRegManager=personalRegManager;
    }

    @Override
    public ArrayList<PersonalRegInfo> getEntries() {
        return personalRegManager.getEntries();
    }

}
