import java.util.ArrayList;

public class Mahasiswa extends Elemen {
	private int angkatan;
	private int nilai;
	private boolean statusMahasiswa;
	
	public Mahasiswa(String nama, int umur, String gender, int angkatan) {
		super(nama, umur, gender);
		this.angkatan = angkatan;
		this.nilai = 0;
		this.statusMahasiswa = false;
	}
	
	public static void tambahMahasiswa (ArrayList<Elemen> obj, ArrayList<String> daftarNama, String nama, int umur, String gender, int angkatan) {
		Mahasiswa mahasiswa = new Mahasiswa (nama, umur, gender, angkatan);
		daftarNama.add(nama);
		obj.add(mahasiswa);
		System.out.println(nama + " diterima menjadi mahasiswa angkatan " + angkatan);
	}
	
	public static boolean cekMahasiswa (ArrayList<Elemen> obj, String subjek) {
		boolean cekMahasiswa = false;
		for (Elemen caller : obj) {
			if(caller.getNama().equalsIgnoreCase(subjek)) {
				if(caller instanceof Mahasiswa) {
					cekMahasiswa = true;
				}
			}
		}
		return cekMahasiswa;
	}

	public boolean isStatusMahasiswa() {
		return statusMahasiswa;
	}

	public void setStatusMahasiswa(boolean statusMahasiswa) {
		this.statusMahasiswa = statusMahasiswa;
	}

	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public int getAngkatan() {
		return angkatan;
	}

	public void setAngkatan(int angkatan) {
		this.angkatan = angkatan;
	}
}
