public class testSegitiga
{
	public static void main(String[] args) 
	{
	Segitiga sgt = new Segitiga(4,8);	
	sgt.panjang=4;
	sgt.tinggi=8;
	sgt.tampilkanProperty();
	System.out.println("Luas Segitiga" + sgt.luas());
	System.out.println("keliling Segitiga" + sgt.keliling());

	sgt.ubhproperty(10,10);
	System.out.println("Data baru = " );
	sgt.panjang=10;
	sgt.tinggi=10;
	sgt.tampilkanProperty();
	System.out.println("Luas Segitiga" + sgt.luas());
	System.out.println("keliling Segitiga" + sgt.keliling());

System.out.println( );
System.out.println( );
System.out.println( );
System.out.println( );
System.out.println( );



	//-----------LINGKARAN----------------

Lingkaran circle= new Lingkaran(14);
circle.radius=10;
circle.radius=10;
circle.tampilkanPropertys();
	System.out.println("keliling= "+ circle.keliling());
	System.out.println("Luas="+ circle.luas());



	}
	
}