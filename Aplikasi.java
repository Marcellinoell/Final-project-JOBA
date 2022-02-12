package forum;
import java.util.*;
public class Aplikasi {
	static ArrayList<String> nama = new ArrayList<String>();
	static ArrayList<Integer> jumlah = new ArrayList<Integer>();
	public static void menuUtama () {
		System.out.println("\n1. Tambah Produk");
		System.out.println("2. Hapus Produk");
		System.out.println("3. Update Produk");
		System.out.println("4. Lihat produk");
		System.out.println("5. Keluar\n");
		System.out.print("pilih menu: ");
		
	Scanner pilih = new Scanner(System.in);
	
	int menu = pilih.nextInt();
	
	switch(menu) {
	case 1 : menu1();
	break;
	
	case 2 : menu2();
	break;
	
	case 3 : menu3();
	break;
	
	case 4 : menu4();
	break;
	
	case 5 : menu5();
	break;
	
	default : System.out.println("Kesalahan!");	
	}
	
	}
	
	public static void menu1() {
		Scanner np = new Scanner(System.in);
		Scanner jp = new Scanner(System.in);
		
		System.out.println("\n=========== Menu 1 ===========");
		System.out.println("=========== Input Produk ===========\n");
		
		System.out.print("Masukkan nama produk: ");
		String namaProduk = np.nextLine();
		nama.add(namaProduk);
		
		System.out.print("Masukkan jumlah produk (kg): ");
		int kuantitasProduk = jp.nextInt();
		jumlah.add(kuantitasProduk);
		
		System.out.println(nama);
		System.out.println(jumlah);
		
		menuUtama();
	}
	
	public static void menu2() {
		Scanner delete = new Scanner(System.in);
		
		System.out.println("\n=========== Menu 2 ===========");
		System.out.println("=========== Hapus Produk ===========\n");
		
		System.out.print("Masukkan nama produk yang akan dihapus: ");
		String deleteProduk = delete.nextLine();
		
		if(nama.contains(deleteProduk)) {
			System.out.print("Apakah anda ingin menghapus produk tersebut? [Ya|Tidak] ");
			String check = delete.nextLine();
			
			if(check.equalsIgnoreCase("Ya")) {
				int index = nama.indexOf(deleteProduk);
				nama.remove(deleteProduk);
				jumlah.remove(index);
				
				System.out.println(nama);
				System.out.println(jumlah);
				
				menuUtama();				
			}else {
				menuUtama();
			}
			
		}else {
			System.out.println("Produk yang dicari tidak ada");
			menu2();
		}
	}
	
	public static void menu3() {
		Scanner np = new Scanner(System.in);
		Scanner update = new Scanner(System.in);
		
		System.out.println("=========== Menu 3 ===========");
		System.out.println("=========== Update Produk ===========");
		
		System.out.print("Masukkan nama produk: ");
		String namaProduk = np.nextLine();
		
		if(nama.contains(namaProduk)) {
			int index = nama.indexOf(namaProduk);
			System.out.printf("Masukkan Jumlah dari produk %s yang akan di update: ", namaProduk);
			int updateJumlah = update.nextInt();
			
			System.out.print("Apakah anda yakin dengan jumlah produk? [Ya|Tidak] ");
			String check = np.nextLine();

			if(check.equalsIgnoreCase("Ya")) {
				jumlah.set(index, updateJumlah);
				
				System.out.println(nama);
				System.out.println(jumlah);
				
				menuUtama();				
			}else {
				menuUtama();
			}
			
		}else {
			System.out.println("Produk yang dicari tidak ada");
			menu3();
		}
	}
	
	public static void menu4() {
		System.out.println("\n=========== Menu 4 ===========");
		System.out.println("=========== Data Produk ===========\n");
		
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(i) + " = " + jumlah.get(i));
		}
		
		menuUtama();
	}
	
	public static void menu5() {
		System.out.println("=========== Terima Kasih ===========");
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		menuUtama();
	}

}

