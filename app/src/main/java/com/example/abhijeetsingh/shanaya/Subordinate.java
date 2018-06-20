package com.example.abhijeetsingh.shanaya;

public class Subordinate {
    private String mSubName;
    private String mSubID;
    private int mSubImageResourceID = -1;

    public Subordinate(String subName, String subID, int subImageID) {
        mSubName = subName;
        mSubID = subID;
        mSubImageResourceID = subImageID;
    }

    public String getSubName() {
        return mSubName;
    }

    public String getSubID() {
        return mSubID;
    }

    public int getSubImageResourceID() {
        return mSubImageResourceID;
    }

    public boolean hasImage() {
        return (mSubImageResourceID != -1);
    }

}