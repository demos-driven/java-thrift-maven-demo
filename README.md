# thrift-demo

## install thrift

    brew install boost
    brew install bison
    brew install libevent
    brew install thrift

## generate code

    thrift -r -gen java -out src/main/java/ hello.thrift

## 编译

    mvn clean compile

## 启动server:

    mvn exec:java -Dexec.mainClass="com.example.myproject.thrift.HelloServer"

## 启动client:

    mvn exec:java -Dexec.mainClass="com.example.myproject.thrift.HelloClient"

    mvn exec:java -Dexec.mainClass="com.example.myproject.thrift.HelloClient" -Dexec.args="litong.deng"