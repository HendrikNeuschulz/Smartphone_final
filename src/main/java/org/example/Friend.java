package org.example;

public class Friend extends Contact{

    public int telNum;



    public Friend() {

    }

    public Friend (String contactName, int telNum) {
        this.contactName=contactName;
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telNum=" + telNum +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}
