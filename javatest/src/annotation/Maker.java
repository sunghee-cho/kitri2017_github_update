package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//annotation 정의(spring 이미 정의 사용)
@Retention(RetentionPolicy.RUNTIME)
public @interface Maker {
	int num(); 
	String name();
	String date() default "2017-09-06";
}
