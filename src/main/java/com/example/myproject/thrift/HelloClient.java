package com.example.myproject.thrift;

import com.example.myproject.gencode.hello.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class HelloClient {

    public static final int TIMEOUT = 3000;

    public static void main(String[] args) throws TException {
        String userName = (args != null && args.length >= 1)
                ? args[0]
                : "china.compass";

        new HelloClient().start(userName);
    }

    public void start(String userName) throws TException {
        TTransport transport = new TSocket(null, HelloServer.HOST, HelloServer.PORT, TIMEOUT);
        // need to be same as server
        TProtocol protocol = new TCompactProtocol(transport);

        HelloService.Client client = new HelloService.Client(protocol);

        transport.open();

        String result = client.greeting(userName);
        System.out.println("Thrief client result: " + result);
    }
}
