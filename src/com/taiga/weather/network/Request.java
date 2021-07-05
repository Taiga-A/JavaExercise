package com.taiga.weather.network;

import com.github.kevinsawicki.http.HttpRequest;

import java.net.UnknownHostException;

public class Request {

    public static String putReq(String area) throws UnknownHostException {
        HttpRequest req = HttpRequest.get("http://ali-weather.showapi.com/ip-to-weather",true,"ip",Ip.getIp().toString(),"area",area);


        return "";
    }

}
