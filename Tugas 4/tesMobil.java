class tesMobil{
	public static void main(String[] args) {
		Mobil maven = new Mobil();
		System.out.println("Merek		="+ maven.setmerk());
		System.out.println("Plat Nomor	="+ maven.setplatNomor());
		System.out.println("Warna		="+ maven.setwarna());
		System.out.println("posisi		="+	maven.setposisi());
		System.out.println("Mesin		="+ maven.setmesin());
		System.out.println("kecepatan	="+ maven.setkecepatan());


		Mobil avansa = new Mobil("avansa","AE 667 VA");

		System.out.println("merk		=" +avansa.setmerk());
		System.out.println("platNomor	=" +avansa.setplatNomor());
		avansa.mundur();
		System.out.println(" ");


	Mobil avege = new Mobil("avege","AE 9067 JK","Merah");

		System.out.println("merk		=" +avege.setmerk());
		System.out.println("platNomor 	=" +avege.setplatNomor());
		System.out.println("warna  		=" +avege.setwarna());
		avege.berhenti();
		System.out.println(" ");

Mobil galardo = new Mobil("galardo","AE 785 LK","Merah","Malang");

		System.out.println("merk		=" +galardo.setmerk());
		System.out.println("platNomor 	=" +galardo.setplatNomor());
		System.out.println("warna  		=" +galardo.setwarna());
		System.out.println("posisi  	=" +galardo.setposisi());
		galardo.berhenti();
		System.out.println(" ");

	Mobil lancer = new Mobil("lancer","AE 746 JJ","Hitam","Madiun",2400);

		System.out.println("merk		=" +lancer.setmerk());
		System.out.println("platNomor 	=" +lancer.setplatNomor());
		System.out.println("warna  		=" +lancer.setwarna());
		System.out.println("posisi  	=" +lancer.setposisi());
		System.out.println("mesin   	=" +lancer.setmesin() +"cc");
		lancer.belok();
		System.out.println(" ");

	Mobil timor = new Mobil("timor","AE 8964 FG","Biru","Jombang",2900,190);

		System.out.println("merk		=" +timor.setmerk());
		System.out.println("platNomor 	=" +timor.setplatNomor());
		System.out.println("warna  		=" +timor.setwarna());
		System.out.println("posisi  	=" +timor.setposisi());
		System.out.println("mesin   	=" +timor.setmesin() +"cc");
		System.out.println("kecepatan	=" +timor.setkecepatan() +"km"); 
		timor.ngebut();
		System.out.println(" ");
	
	}
}