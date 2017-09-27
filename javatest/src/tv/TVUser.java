package tv;
class SamsungTV{
	public void powerOn(){
		System.out.println("�궪�꽦tv:�쟾�썝耳쒕떎");
	}
	public void powerOff(){
		System.out.println("�궪�꽦tv:�쟾�썝�걚�떎");
	}
	public void volumeUp(){
		System.out.println("�궪�꽦tv:蹂쇰ⅷ�삱由щ떎");
	}
	public void volumeDown(){
		System.out.println("�궪�꽦tv:蹂쇰ⅷ�궡由щ떎");
	}
}
class LgTV{
	public void turnOn(){
		System.out.println("�뿕吏�tv:�쟾�썝耳쒕떎");
	}
	public void turnOff(){
		System.out.println("�뿕吏�tv:�쟾�썝�걚�떎");
	}	
	public void soundUp(){
		System.out.println("�뿕吏�tv:蹂쇰ⅷ�삱由щ떎");
	}
	public void soundDown(){
		System.out.println("�뿕吏�tv:蹂쇰ⅷ�궡由щ떎");
	}	
}

public class TVUser {
public static void main(String[] args) {
	System.out.println("github fork test");
	System.out.println("hi ms.cho");
	SamsungTV s1 = new SamsungTV();
	s1.powerOn();
	s1.volumeUp();
	s1.volumeDown();
	s1.powerOff();
}
}





