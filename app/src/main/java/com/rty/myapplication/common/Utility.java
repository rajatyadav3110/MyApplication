package com.rty.myapplication.common;

/**
 * Created by infotech on 09-07-2017.
 */
public class Utility {

    public static boolean validateMadatoryString(String value){

        try{

            if(value != null && !value.trim().equals(""))
                return true;
            else
                return false;
        } catch (Exception e) {
            return false;
        }

    }
}
