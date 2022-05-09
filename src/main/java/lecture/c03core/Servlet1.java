package lecture.c03core;

public class Servlet1 {
	private Dao1 dao = new Dao1();
	//inversion of control = ioc 제어의 역전,반전
	public void doGet() {
		//request 파라미터 수집/ 가공
		//business 로직 처리
//		Dao1 dao = new Dao1(); //dao가 dependency라 없으면 오류
		//spring으로 의존성 주입 할 수 있다.
		dao.select(); //dao가 없으면 일 못해 dao한테 의존
		//결과 세팅
		//forward / redirect
     	
	}

}
