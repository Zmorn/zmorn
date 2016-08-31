
public class ArgDemo {
	
	public int addTen(int num) {
		return num += 10;
	}
	
	public static void main(String[] args) {
		int count = 20;
		ArgDemo d = new ArgDemo();
		int result = d.addTen(count);
		System.out.println(count);
		System.out.println(result);
	}

}
