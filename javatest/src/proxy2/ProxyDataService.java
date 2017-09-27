package proxy2;

public class ProxyDataService implements DataService{
	DataService s;
	
	public int insertData(String data){
		initDB();
		s = new TargetDataService2();
		int result = s.insertData(data);
		if(result == 1){
			commit();
		}
		else{
			rollback();
		}
		return result;
	}
	
	//여러 객체 공통 수행 내용 정의 메소드들
	void initDB(){
		System.out.println("db 연결");
	}
	void commit(){
		System.out.println("commit합니다");
	}
	void rollback(){
		System.out.println("rollback합니다");
	}
}
