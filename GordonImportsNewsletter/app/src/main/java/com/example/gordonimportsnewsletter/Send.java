package com.example.gordonimportsnewsletter;

import android.app.Activity;

public class Send implements java.lang.Runnable{
//Test to see if GitHub updates this file. 

    @SerializedName("range")
    var range: String,
    @SerializedName("majorDimension")
    var majorDimension: String,
    @SerializedName("values")
    var values: ArrayList<Item>

    private Activity activity;
    public Send(Activity activity) {this.activity = activity;}

    @Override
    public void run() {

    }
}
