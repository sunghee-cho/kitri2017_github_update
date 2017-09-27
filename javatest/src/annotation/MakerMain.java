package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class MakerUser{
	@Maker(num=1, name="annotation.MyObject")
	public void setMakerAnnotation(){
		System.out.println("Maker annotation 적용");
	}
}

class MyObject{
	MyObject(){
		System.out.println("MyObject기본생성자호출");
	}
}

public class MakerMain {
public static void main(String[] args) 
throws Exception {
//MakerUser 클래스의 메소드 정보를 배열로  읽어옴
	MakerUser u = new MakerUser();
	Class c = u.getClass();
	Method[] meth =  c.getDeclaredMethods();
	
//메소드  정보 배열 반복
	for(int i = 0; i < meth.length; i++){
		// @Maker 발견되었다면
		if(meth[i].isAnnotationPresent(Maker.class)){
			//@Maker 정보 읽어옴
			Annotation[] anno = 
			meth[i].getDeclaredAnnotations();
			//@Maker의 name값 읽어옴
			for(Annotation a : anno){
				//annotation.MyObject
				String name = ((Maker)a).name();
				Object o = Class.forName(name).newInstance();
			}
		}
	}
// @Maker , name=annotation.MyObject이라면
// new 	annotation.MyObject() 객체 생성 문장 자동 호출
	
	
}
}






