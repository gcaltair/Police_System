package edu.bupt.gc.homework;

public class Police extends Person implements IArrest{
    public Police(Name name, Address address, String idCard) {
        super(name, address, idCard);
    }

    @Override
    public void arrest(IIllegal illegal) {

    }
}
