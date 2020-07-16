package com.company;
import java.net.*;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        // write your code here

        InetAddress ip=InetAddress.getByName("activity.qou.edu");

        //getHostName() : it returns the host name of the IP address.
        //getHostName() : تقوم بإرجاع اسم المضيف لعنوان الايبي .
        System.out.println("Host Name: "+ip.getHostName());

        //getHostAddress() : it returns the IP address in string format.
        //getHostAddress() :تقو بارجاع الايبي الخاص بالعنوان التي تم وضعه في المتغير سترينغ
        System.out.println("IP Address: "+ip.getHostAddress());

    }
}
