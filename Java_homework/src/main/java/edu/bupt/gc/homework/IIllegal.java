package edu.bupt.gc.homework;

public interface IIllegal {
    int CREAME_CODE_STEAL = 1;
    int CREAME_CODE_ROB   = 2;
    int CREAME_CODE_CHEAT = 3;

    void illegalAct(Person person);
    int  getCrimeCode();
}
