package com.example.android.dictanhvietbasic;

/**
 * Created by ThinkPad on 3/9/2017.
 */

public class Word {

    // Default translation for the word, dat private boi vi chi can su dung trong class nay thoi
    private String mDefaultTransation;

    //Miwor translation for the word
    private String mVietNamTranslation;

    private int mImageResouceId = NO_IMAGE_PROVIDED;

    private static final  int NO_IMAGE_PROVIDED = -1; // -1 La trang thai mac dinh khong co hinh anh

    // Sau do ta khoi tao ham tao voi 2 tham so defaultTranslation va miwokTranslation

    /**
     * nen khai bao la public de cac lop ngoai lop Word nay co the truy cap
     * @param defaultTranslation
     * @param vietNamTranslation
     */
    public Word(String defaultTranslation, String vietNamTranslation){
        mDefaultTransation = defaultTranslation;
        mVietNamTranslation = vietNamTranslation;
    }
    //Ham tao thu 2
    /**
     * nen khai bao la public de cac lop ngoai lop Word nay co the truy cap
     * @param defaultTranslation
     * @param vietNamTranslation
     * @param imageResourceId là hinh anh cho cac doi tuong Word được gắn với chữ
     */
    public Word(String defaultTransation, String vietNamTranslation, int imageResourceId){
        mDefaultTransation = defaultTransation;
        mVietNamTranslation = vietNamTranslation;
        mImageResouceId =  imageResourceId;
    }

    /**
     * get default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTransation;
    }
    /**
     * get miwok translation of the word
     */
    public String getVietNamTranslation(){
        return mVietNamTranslation;
    }
    public int getmImageResouceId(){
        return mImageResouceId;
    }

    /**
     * Return whether or not there is an image for this word
     */
    public boolean hasImage(){
        return mImageResouceId != NO_IMAGE_PROVIDED;   // Ket qua cua bieu thuc nay la se dung hoac sai
    }
}