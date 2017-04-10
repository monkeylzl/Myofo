package com.example.lzl.myofo;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lzl on 2017/4/8.
 */

public class Utils {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callbadk){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callbadk);

    }
}
