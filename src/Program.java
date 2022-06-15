public class Program {
	
	int p = 12;
	long digit= 0;
	long product = 0;
	long X = 0;
	
	public long getX(long n) {
		while(p>=1) {
			digit = n%10;
			n = n/10;
			product = digit*p;
			X = X + product;
			p = p-1;			
		}
		return X;
		
	}
	
	public long getNumber(long n) {
		if(X%11==10) {
			String s1 = String.valueOf(n);
	    	String s2 = String.valueOf(1);
	    	String s = s1 + s2;
			long i = Integer.parseInt(s);
			return i;
		}
		else {
			String s1 = String.valueOf(n);
	    	String s2 = String.valueOf(X%11);
	    	String s = s1 + s2;
			long i = Long.parseLong(s);
			return i;
		}
	}

	public static void main(String[] args) {

		Program p =new Program();
		

//		System.out.println(p.getNumber(292111449845L));
//		
		

//		System.out.println(p.getNumber(382101548856L));
		
		

//		System.out.println(p.getNumber(585091547965L));
		
		

		System.out.println(p.getNumber(677072801451L));
		
		

//		System.out.println(p.getNumber(191121350937L));
		
	}

}
