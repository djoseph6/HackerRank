package OCAJP8_Practice;

public class Datatypes {
	
	static boolean bool;
	byte by = 1_2;
	char ch;
	short shrt;
	int i;
	long lg = 12_3L;
	float flt = 12_3_4.57F;
	double db;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean bool;
		//byte by;
		//char ch;
		//short shrt;
		//int i;
		//long lg;
		//float flt;
		//double db;
		
		//System.out.println(bool + " " + by + ch + shrt + i + lg + flt + db);
		
		System.out.println(bool + " " + new Datatypes().by);
		System.out.println(new Datatypes().lg + " " + new Datatypes().flt);
		
		//short a = new Datatypes().shrt +1;   //Interger + short becomes interger
		long l = new Datatypes().lg +1;
		//int i = new Datatypes().lg +1;       //Long + Integer becomes long

		Integer cap = 1;
		Integer dap =2;
		Double fap = 2.0;
		
		System.out.println(cap==dap);
		//System.out.println(dap==fap);  can no == two different wrappers
	}

}
