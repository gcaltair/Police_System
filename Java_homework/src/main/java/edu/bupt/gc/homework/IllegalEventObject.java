package edu.bupt.gc.homework;

public class IllegalEventObject {
    public Object source;//事件源，受害者
    public Object offender;//强盗，thief

    public IllegalEventObject(Object source, Object offender) {
        this.source = source;
        this.offender = offender;
    }

    public Object getSource() {
        return source;
    }

    public Object getOffender() {
        return offender;
    }
}
