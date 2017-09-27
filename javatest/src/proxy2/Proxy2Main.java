package proxy2;

public class Proxy2Main {
public static void main(String[] args) {
	//
	DataService s = new ProxyDataService();
	int result = s.insertData("게시물데이터");
	System.out.println("저장레코드갯수=" + result);
}
}


