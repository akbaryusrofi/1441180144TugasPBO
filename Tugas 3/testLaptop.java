class testLaptop  {
	public static void main(String[] args) {


	



		laptop thosiba = new laptop();
	System.out.println("Merk = "+ thosiba.getMerk());
	System.out.println("color = " + thosiba.getWarna());
	System.out.println("Wifi = "+ thosiba.getWifi());
	System.out.println("Batrai = " + thosiba.getBatrai());
	System.out.println("");
	
laptop acer = new laptop("Acer","Putih");
	System.out.println("Merk = "+ acer.getMerk());
	System.out.println("color = "+ acer.getWarna());
	System.out.println("");

laptop dell = new laptop("dell","Putih","Terkoneksi");
	System.out.println("Merk = "+ dell.getMerk());
	System.out.println("color = "+ dell.getWarna());
	System.out.println("Status wifi = "+ dell.getWarna());
	System.out.println("");


laptop lenovo = new laptop("lenovo","Putih","Terkoneksi",90);
	System.out.println("Merk = "+ lenovo.getMerk());
	System.out.println("color = "+ lenovo.getWarna());
	System.out.println("Status wifi = "+ lenovo.getWarna());
	System.out.println("Status Batrai = "+ lenovo.getWarna()+"%");
	System.out.println("");

	
	acer.menyala();



}	
}