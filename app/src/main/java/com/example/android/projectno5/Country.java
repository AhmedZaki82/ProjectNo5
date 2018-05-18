package com.example.android.projectno5;

/**
 * Created by Tsultrim on 5/18/18.
 */

public class Country {

    private int mTitle;
    private int mImage = NO_IMAGE_PROVIDED;
    private int mName;
    private int mSubject;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Country(int mTitle, int mImage, int mName, int mSubject) {
        this.mTitle = mTitle;
        this.mImage = mImage;
        this.mName = mName;
        this.mSubject = mSubject;
    }

    public Country(int mTitle, int mName, int mSubject) {
        this.mTitle = mTitle;
        this.mName = mName;
        this.mSubject = mSubject;
    }

    public int getmTitle() {
        return mTitle;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmName() {
        return mName;
    }

    public int getmSubject() {
        return mSubject;
    }

    public static int getNoImageProvided() {
        return NO_IMAGE_PROVIDED;
    }

    public boolean hasImage() {

        return mImage != NO_IMAGE_PROVIDED;
    }
}
