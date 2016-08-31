//数据类型
public class DataTypeDemo {
	byte a;
	short b = 0b1_001;
	int c = 0xcafe;
	long d = 21000000000000000L;
	
	double e = 1.00000000000000000000002D;
	float f;
	
	char g;
	
	boolean h;
	
	public void f() {
		System.out.println("byte:"+a);
		System.out.println("short:"+b);
		System.out.println("int:"+c);
		System.out.println("long:"+d);
		System.out.println("---------------------------");
		System.out.println("double:"+e);
		System.out.println("float:"+f);
		System.out.println("char:"+g);
		System.out.println("boolean:"+h);
	}
	
	public static double dd;
	public static strictfp void main(String[] args) {
		DataTypeDemo demo = new DataTypeDemo();
//		demo.f();
		
//		try {
//			dd = Double.parseDouble("abc");
//			
//		} catch (NumberFormatException e) {
//
//		}
//		System.out.println(dd);
		
		
		//char c = '\u2122';
		char c = 'A';
		char c1 = '\\';
		for (int i = 0; i < 10; i++) {
			System.out.println(c++);
		}
		
//		System.out.println(c1);
		
		int a = 0;
//		System.out.println(2.0-1.1);
	}
	
}
