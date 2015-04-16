class Mobil{
	private String merk;
	private String platNomor;
	private String warna;
	private String posisi;
	private int mesin;
	private int kecepatan;
	

public Mobil(){
merk		="Maven";
platNomor	="AE 6797 VA";
warna		="KUNING";
posisi		="Ponorogo";
mesin		=2500;
kecepatan	=80;

}

public Mobil(String merkinput, String platNomorinput){
merk		=merkinput;
platNomor	=platNomorinput;

}

public Mobil(String merkinput, String platNomorinput, String warnainput){
merk		=merkinput;
platNomor	=platNomorinput;
warna		=warnainput;

}

public Mobil(String merkinput, String platNomorinput, String warnainput, String posisiinput){
merk		=merkinput;
platNomor	=platNomorinput;
warna		=warnainput;
posisi		=posisiinput;

}

public Mobil(String merkinput, String platNomorinput, String warnainput, String posisiinput, int mesininput){
merk		=merkinput;
platNomor	=platNomorinput;
warna		=warnainput;
posisi		=posisiinput;
mesin		=mesininput;

}

public Mobil(String merkinput, String platNomorinput, String warnainput, String posisiinput, int mesininput, int kecepataninput){
merk		=merkinput;
platNomor	=platNomorinput;
warna		=warnainput;
posisi		=posisiinput;
mesin		=mesininput;
kecepatan	=kecepataninput;

}


public void maju(){

		System.out.println("mobil ini maju");
	}
	public void mundur(){

		System.out.println("mobil ini mundur");
	}
	public void berhenti(){

		System.out.println("mobil ini berhenti");
	}
	public void belok(){

		System.out.println("mobil ini berbelok");
	}
	public void ngebut(){

		System.out.println("mobil ini ngebut");
	}
	public void ngerem(){

		System.out.println("mobil ini mengerem");	
	}

public String setmerk(){
	return merk;
}
public String setplatNomor(){
	return platNomor;
}
public String setwarna(){
	return warna;
}
public String setposisi(){
	return posisi;
}
public int setmesin(){
	return mesin;
}
public int setkecepatan(){
	return kecepatan;
}

}