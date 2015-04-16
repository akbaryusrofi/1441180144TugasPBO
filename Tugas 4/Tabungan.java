class Tabungan{
	private String simpanan;
	private String pemilikRek;
	private int noRekening;
	private int bunga;
	

public Tabungan(){
simpanan	="BCA";
pemilikRek	="Akbar yusrofi";
noRekening	=1441180732;
bunga		=10;

}
 
public Tabungan(String simpananinput, String pemilikRekinput){
	simpanan=simpananinput;
	pemilikRek=pemilikRekinput;
}

public Tabungan(String simpananinput, String pemilikRekinput, int noRekeninginput){
	simpanan=simpananinput;
	pemilikRek=pemilikRekinput;
	noRekening=noRekeninginput;
}

public Tabungan(String simpananinput, String pemilikRekinput, int noRekeninginput, int bungainput){
	simpanan=simpananinput;
	pemilikRek=pemilikRekinput;
	noRekening=noRekeninginput;
	bunga=bungainput;
}

public void menabung(){
	System.out.println("menabung uang");
}
public void mengambil(){
	System.out.println("mengambil uang");
} 
public void transfer(){
	System.out.println("transfer uang");
}
public void menerimaTransfer(){
	System.out.println("menerima transfer");
}

public void cekSaldo(){
	System.out.println("Cek Saldo ATM");
}




public String setsimpanan(){
	return simpanan;
}
public String getpemilikRek(){
	return pemilikRek;
}
public int getnoRekening(){
	return noRekening;
}
public int getbunga(){
	return bunga;
}
}













