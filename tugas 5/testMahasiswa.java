public class testMahasiswa {
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("Akbar Yusrofi", 20);
		mhs.tampilkanBiodata();

		System.out.println();

		mhs.setUmur(25);
		mhs.tampilkanBiodata();

	}
	
}

