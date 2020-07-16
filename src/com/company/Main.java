package com.company;
import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
	// write your code here

            InetAddress ip=InetAddress.getByName("www.javatpoint.com");

            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());


    }
}
