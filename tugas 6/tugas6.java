import java.util.*;
class tugas6{
	public static void main(String args[]) {
		System.out.print("Masukan bilangan pertama =");
		String x = System.console().readLine();
		double var1 = Integer.parseInt(x);

		System.out.print("Masukan bilangan kedua = ");
		String y = System.console().readLine();
		double var2 = Integer.parseInt(y);

		
		for (int l=1;l<1000 ;l++) {
		 	
		  {
			System.out.println("Silahkan Pilih");
			System.out.println("1. penjumlahan");
			System.out.println("2. pengurangan");
			System.out.println("3. perkalian");
			System.out.println("4. pembagian");
			System.out.println("5. exit");
		
		String pilihan = System.console().readLine();
		int a = Integer.parseInt(pilihan);
double hasil;
		switch (a) {
			
		case 1:
		hasil=var1+var2;
			System.out.println("penjumlahan="+hasil);
			break;
		case 2:
		hasil=var1-var2;
			System.out.println("pengurangan="+hasil);
			break;
		case 3:
		hasil=var1*var2;
			System.out.println("perkalian="+hasil);
			break;
		case 4:
		hasil=var1/var2;
			System.out.println("pembagian="+hasil);
			break;
		case 5:
		System.out.println("exit");
			System.exit(0);
			break;
			
		}
		System.out.println("--------------------------");
}

	}
	
}
}