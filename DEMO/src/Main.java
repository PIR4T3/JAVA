public class Main{
	static void test() throws Exception { 
		try { 
			System.out.print("test "); 
			throw new Exception(); 
		} 
		catch (Exception ex) { System.out.print("exception "); } 
	} 
	public static void main(String[] args) throws Exception { 
		try { test(); } 
		catch (RuntimeException ex) { System.out.print("runtime "); } 
		System.out.print("end "); 
	} 
	
}
