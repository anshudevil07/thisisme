
public class Wrap {
	public static void main(String args[]) {
		Wrap test1=new Wrap();
		double pricetest=test1.ConvertToDouble("997.67");
		System.out.println(pricetest);
		
		
		int item=test1.ConvertToInt("678");
		System.out.println(item);
		System.out.println(item);
		
	}
	public double ConvertToDouble(String price) {
		double priceVal= Double.parseDouble(price);
		return priceVal+100.50;
	}
	
	public int ConvertToInt(String item) {
		int items=Integer.parseInt(item);
		return items+345;
	}
}
