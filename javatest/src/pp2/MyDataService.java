package pp2;

public class MyDataService implements DataService {
public int insertData(String data) {
	System.out.println(data + " 저장 완료");
	return 1;
}
}
