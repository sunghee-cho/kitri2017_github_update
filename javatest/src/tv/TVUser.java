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
// SamsungTV, LgTV �꽑�깮沅� 議댁옱 寃쎌슦 :
// TV蹂�寃쎌떆留덈떎 �옄諛붿냼�뒪 �닔�젙 遺덇��뵾
// 1媛� �뙆�씪 蹂�寃� �닔�젙 - �떎瑜� �뙆�씪 蹂�寃� �닔�젙 
//MAIN - FACTORY �떆耳쒖꽌 寃곌낵 由ы꽩 
public class TVUser {
public static void main(String[] args) {
	System.out.println("github 유즤니횽  test");
	SamsungTV s1 = new SamsungTV();
	s1.powerOn();
	s1.volumeUp();
	s1.volumeDown();
	s1.powerOff();
}
}





