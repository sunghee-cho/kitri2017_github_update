package proxy;

public class ProxyService implements Service {

	Service s ;
	@Override
	public String runSomething() {
		///비서
		System.out.println("프록시가 호출을 대신합니다.");
		s = new RealService();
		String result = s.runSomething();
		System.out.println("프록시가 호출을 종료합니다.");
		return result;
	}

}

//class RealService2 implements Service{
//
//}
