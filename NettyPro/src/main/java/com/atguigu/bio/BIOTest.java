package com.atguigu.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class BIOTest {

    public static void main(String[] args) throws IOException {
            Socket socket = new Socket("127.0.0.1", 6666);
            Object o=new Object();
        while (true){
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("sb<<<<<<".getBytes("UTF-8"));
        }
    }
}
