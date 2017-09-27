package proxy;

public class RealService implements Service {
	public String runSomething() {
		return "실제수행서비스입니다. 서비스 짱!!";
	}
}
