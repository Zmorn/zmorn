package other;

public class QingHuaTest {
	public void test(Object o) {
		System.out.println("Object");
	}
	
	public void test(String s) {
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		QingHuaTest q = new QingHuaTest();
		q.test(null);
	}
}
