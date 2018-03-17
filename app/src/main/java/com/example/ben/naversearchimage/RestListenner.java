package com.example.ben.naversearchimage;

import com.google.gson.JsonObject;

public abstract class RestListenner {

    public abstract void onSuccess(NaverImage naverImage);

    protected void onError(int httpCode, String error){}

}
