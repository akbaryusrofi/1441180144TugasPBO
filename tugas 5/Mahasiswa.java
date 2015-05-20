//mahasiswa
class Mahasiswa {
	//atribut
	private String namaMahasiswa;
	private int umurMahasiswa;
//konstruktor
public Mahasiswa( String nama, int umur){
	namaMahasiswa = nama;
	umurMahasiswa = umur;
}
//seter dan geter
	//nama mahasiswa
public void setNama(String nama)
{

	namaMahasiswa = nama;

}
public String getNama(){
	return namaMahasiswa;
	
}
//umur mahasiswa

public void setUmur(int umur)
{
	umurMahasiswa = umur;

}

public int getUmur(){
	return umurMahasiswa;
}
//metod bos
public void tampilkanBiodata(){
	System.out.println("nama = " + namaMahasiswa);
	System.out.println("umur = " + umurMahasiswa);
}
}