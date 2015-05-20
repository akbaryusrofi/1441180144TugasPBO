//------SEGITIGA-------
class Segitiga{
	
	 double tinggiSegitiga;
	 double panjangSegitiga;
	 double luas;
	 double keliling;
	 double panjang;
	 double tinggi;

//konstruktor
	public Segitiga(double tinggi, double panjang){
		tinggiSegitiga	= tinggi;
		panjangSegitiga	= panjang;
	}
	//property
public void ubhproperty(double tinggi, double panjang){
	tinggiSegitiga = tinggi;
	panjangSegitiga = panjang;
	}

public double luas(){
	luas = 0.5*panjang*tinggi;
	return luas;
	}
public double keliling(){
	double sisiMiring = Math.sqrt((panjang * panjang) + (tinggi * tinggi));
	keliling = panjang+tinggi+sisiMiring;
	return keliling;
}
public void tampilkanProperty(){

	System.out.println("Tinggi Segitiga = " + tinggiSegitiga);
	System.out.println("Panjang Segitiga =" + panjangSegitiga);
	
	}

}

//------LINGKARAN-------

class Lingkaran{
	int radius;
	double luas;
	double keliling;
//setter
	public Lingkaran(int radiusLingkaran){
		radius = radiusLingkaran;

	}
	public double luas(){	
		luas = radius*radius*Math.PI;
		return luas;
	}
	public double keliling(){
		keliling = 2*radius*Math.PI;
		return keliling;
	}
public void tampilkanPropertys(){
	System.out.println("Radius = " + radius);

}	





}


