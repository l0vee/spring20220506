package lecture.c06core;

import lombok.Setter;

public class Computer {
	@Setter
	private Memory memory;

	public void calc() {
		memory.read();
		
		//컴퓨터는 메모리에 의존한다
	}

}
