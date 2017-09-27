package singleton;

class NoSingleton{
	NoSingleton(){
		System.out.println("NoSingleton생성자호출");
	}
}
//singleton pattern:1개 객체 공유 
class Singleton {
	//3. 변수 선언
	private static Singleton s;
	//1. private 생성자 선언
	private Singleton(){
		System.out.println("Singleton생성자호출"); 
	}
	//2. 다른 클래스에서 객체 생성 방법 제공
	//Singleton객체 생성 없이 호출 가능 : static
	public static Singleton getInstance(){
		//생성자호출 1번만 구현
		if(s == null){
			s = new Singleton();
			return s;
		}
		else{
			return s;
		}
	}
}
public class SingletonTest {
public static void main(String[] args) {
	NoSingleton n1 = new NoSingleton();
	NoSingleton n2 = new NoSingleton();
	NoSingleton n3 = new NoSingleton();

	Singleton s1 = Singleton.getInstance();
	Singleton s2 = Singleton.getInstance();	
	Singleton s3 = Singleton.getInstance();
}
}




