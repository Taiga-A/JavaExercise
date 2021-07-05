package com.taiga.weather.network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ip {
    public static InetAddress getIp() throws UnknownHostException {
        return Inet4Address.getLocalHost();
    }
}
