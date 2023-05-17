package com.storeData.data;

public class Data {
    private int OfficeID;
    private String Name ;
    private int AadharNo;

    public Data(int officeID, String name, int aadharNo) {
        OfficeID = officeID;
        Name = name;
        AadharNo = aadharNo;
    }

    public int getOfficeID() {
        return OfficeID;
    }

    public void setOfficeID(int officeID) {
        OfficeID = officeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAadharNo() {
        return AadharNo;
    }

    public void setAadharNo(int aadharNo) {
        AadharNo = aadharNo;
    }
}
