import java.util.ArrayList;

public class Dosen extends Staf {

	public Dosen(String nama, int umur, String gender, String pekerjaan, String matkul) {
		super(nama, umur, gender, pekerjaan, matkul);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean cekDosen (ArrayList<Elemen> obj, String subjek) {
		boolean checker = false;
		for (Elemen caller : obj) {
			if(caller.getNama().equalsIgnoreCase(subjek)) {
				if(caller instanceof Dosen) {
					checker = true;
				}
			}
		}
		return checker;
	}
}
