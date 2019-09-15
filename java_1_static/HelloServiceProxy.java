package java_1_static;

class HelloServiceProxy implements HelloService {
    private HelloService helloService;
    
    public HelloServiceProxy(HelloService helloService) {
        this.helloService = helloService;
    }
    
    @Override
    public void sayHello() {
        System.out.println("Before say hello...");
        helloService.sayHello();
        System.out.println("After say hello...");
    }
}
