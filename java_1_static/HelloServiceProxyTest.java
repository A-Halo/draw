package java_1_static;

public class HelloServiceProxyTest {
    
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloServiceProxy proxy = new HelloServiceProxy(helloService);
        proxy.sayHello();
    }
}
