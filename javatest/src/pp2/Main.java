package pp2;

public class Main {
public static void main(String[] args) {
	DataService service = new ProxyDataService();
	int result = service.insertData("프록시패턴테스트데이터");
	System.out.println("처리 결과=" + result);
}
}
