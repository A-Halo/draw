package java_1_dynamic;

public class HelloServieDynamicProxyTest {
    public static void main(String[] args){
        HelloService helloService = new HelloServiceImpl();
        HelloService dynamicProxy = (HelloService) new HelloServiceDynamicProxy(helloService).getProxyInstance();
        dynamicProxy.sayHello();
    }
}
