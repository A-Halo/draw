package java_1_dynamic;

class HelloServiceDynamicProxy {

    private HelloService helloService;
    public HelloServiceDynamicProxy(HelloService helloService) {
        this.helloService = helloService;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(helloService.getClass().getClassLoader(), helloService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Before say hello...");
                Object ret = method.invoke(helloService, args);
                System.out.println("After say hello...");
                return ret;
            }
        });
    }
}
