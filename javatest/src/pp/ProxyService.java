package pp;

import java.util.Date;

public class ProxyService implements IService{

    IService myservice;
     
    @Override
    public String runSomething() {
        System.out.println
        (new Date() + " 에 호출, 반환 결과를 그대로 전달");
        myservice = new MyService();
        return myservice.runSomething();
    }

}
