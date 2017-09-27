package pp;

public class Main {
	 
    public static void main(String[] args) {
        //직접 호출하지 않고 프록시를 호출한다.
        IService proxy = new ProxyService();
        System.out.println(proxy.runSomething());
    }
}

