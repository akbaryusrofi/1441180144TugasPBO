class TesTabungan {
	public static void main(String[] args) {
		
	Tabungan akbar= new Tabungan();
	akbar.menabung();
		System.out.println("Simpanan 	=	"+ akbar.setsimpanan());
		System.out.println("Nama Pemilik	=	"+ akbar.getpemilikRek());
		System.out.println("No Rekening	=	"+ akbar.getnoRekening());
		System.out.println("Bunga		=	"+ akbar.getbunga());
		System.out.println(" ");

	Tabungan dan= new Tabungan("BNI","Dan Bagaswara");
	dan.mengambil();
		System.out.println("Simpanan 	=	"+ dan.setsimpanan());
		System.out.println("Nama Pemilik	=	"+ dan.getpemilikRek());
		System.out.println(" ");

	Tabungan sutimah= new Tabungan("BRI","Sutimah",155118065);
	sutimah.transfer();
		System.out.println("Simpanan 	=	"+ sutimah.setsimpanan());
		System.out.println("Nama Pemilik	=	"+ sutimah.getpemilikRek());
		System.out.println("No Rekening	=	"+ sutimah.getnoRekening());
		System.out.println(" ");

	Tabungan paijo= new Tabungan("BRI","paijo",155118647,10);
	paijo.menerimaTransfer();
		System.out.println("Simpanan 	=	"+ paijo.setsimpanan());
		System.out.println("Nama Pemilik	=	"+ paijo.getpemilikRek());
		System.out.println("No Rekening	=	"+ paijo.getnoRekening());
		System.out.println("Bunga		=	"+ paijo.getbunga());
		System.out.println(" ");

Tabungan paitun= new Tabungan("BRI","paitun",155898646,10);
paitun.cekSaldo();
		System.out.println("Simpanan 	=	"+ paitun.setsimpanan());
		System.out.println("Nama Pemilik	=	"+ paitun.getpemilikRek());
		System.out.println("No Rekening	=	"+ paitun.getnoRekening());
		System.out.println("Bunga		=	"+ paitun.getbunga());
		System.out.println(" ");







	}
	
}