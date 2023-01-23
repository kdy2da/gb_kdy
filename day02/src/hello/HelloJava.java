package hello;

/*
 * 프로그램 소스의 최소 단위(=class)를 명시하는 블록.
 * -> public class [클래스명] { ... }
 * 클래스 이름은 소스파일의 이름과 동일해야 하며,
 * 영어/숫자/언더바(_)만 사용 가능하다.
 * 첫 글자는 반드시 영어로만 구성되어야한다.
 */
public class HelloJava {
	/*
	 * 프로그램의 시작점을 의미하는 블록
	 *  -> main 메서드라고 한다.
	 */
	public static void main(String[] args) {
		//콘솔에 문장을 출력하기 위한 명령어
		// 문장을 표현하는 방법 -> 쌍따옴표로 묶는다. -> 문자열
		System.out.println("Hello Java~");
		//자동완성 기능 ctrl + space bar
		System.out.println("자바시간");
		System.out.println("프린트 작성");
		//가독성 있게 작성한 코드를 
		int num = 20;
		String s = "자바학생";
		String result = s + num;
		System.out.println(result);
		
		
	}
}