class laptop  {
	private String merk;
	private String warna;
	private String wifi;
	private int batrai;

public laptop(){
	 merk 	="thosiba";
	 warna  ="hitam";
	 wifi 	="tersambung";
	 batrai = 30;
}


public laptop(String merkInput, String warnaInput)
{
merk = "Acer";
warna = "Merah";

}
public laptop(String merkInput, String warnaInput, String wifiInput)
{
merk = "Lenovo";
warna = "Hitam";
wifi = "Konek";


}

public laptop(String merkInput, String warnaInput, String wifiInput, int batraiInput)
{
merk = "Sont Vaio";
warna = "Emas";
wifi = "Not Konek";
batrai = 50;

}







public void menyala(){
System.out.println("welcome To laptop");
}


public void mati(){
	System.out.println("thankyou have a nice day");
}

public void indikatorbatrai(){
	System.out.println("batrai tinggal :" + batrai +"%");
}

public void indikatorwifi(){
	System.out.println("wifi :" + wifi);
}


public String getMerk()
{
return merk;
} 

public String getWarna()
{
return warna;
} 

public String getWifi()
{
return wifi;
} 

public int getBatrai()
{
return batrai;
} 





}
