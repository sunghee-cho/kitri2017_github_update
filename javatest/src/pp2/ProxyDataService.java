package pp2;

public class ProxyDataService implements DataService{
	DataService mydataservice;
	
	public int insertData(String data) {
		System.out.println("db 연결");
		mydataservice = new MyDataService();
		int result = mydataservice.insertData(data);
		if(result == 1){
			System.out.println("commit");
		}
		else{
			System.out.println("rollback");		
		}
		return result;
	}
}
