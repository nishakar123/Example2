
public class A {
	private int a;
	private int b;
	public A(int a,int b){
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a2) {
		this.a = a2;
	}
	public int getB() {
		return b;
	}
	public void setB(int b2) {
		this.b = b2;
	}
	void show() throws Exception{
		while(true){
			System.out.println(b);
			Thread.sleep(100);
		}
	}
	public static void main(String[] args)throws Exception {
		A a=new A(10,20);
		a.show();
	}
}
