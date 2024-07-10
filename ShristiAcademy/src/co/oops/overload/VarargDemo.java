package co.oops.overload;

public class VarargDemo {

	
	
	void calsum(String name,int... nums) {
		int sum=0;
		for(int num:nums) {
			sum+=num;
			
		}
		System.out.println(sum);
	

}

	void calsum(String... name) {
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		VarargDemo demo= new VarargDemo();
		demo.calsum("ashwini",5,6,8);
		demo.calsum("sonu","ash");
}
}