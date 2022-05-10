package lecture.c08core;

import org.springframework.stereotype.Component;
@Component
public class Engine {

	//Component는 Spring Bean이 된다.
	
	public void action() {
		System.out.println("엔진이 일합니다.");
	}

}
