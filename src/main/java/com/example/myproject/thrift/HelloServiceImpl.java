package com.example.myproject.thrift;

import com.example.myproject.gencode.hello.HelloService;
import org.apache.thrift.TException;

public class HelloServiceImpl implements HelloService.Iface {

    @Override
    public String greeting(String name) throws TException {
        return "Hi, " + name + " , Welcome to the thrift's world!";
    }
}
