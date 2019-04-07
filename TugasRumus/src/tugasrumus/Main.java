package tugasrumus;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	void datar() {
		int choosedatar;
		int sisidatar;
		int panjangdatar;
		int lebardatar;
		int jarilingkaran;
		int alassegitiga;
		int tinggisegitiga;
		int sisimiringsegitiga;
		
		do {
			System.out.println("Bangun Datar");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi Panjang");
			System.out.println("3. Lingkaran");
			System.out.println("4. Segitiga");
			System.out.print("Choose = ");
			choosedatar = scan.nextInt(); scan.nextLine();
		} while (choosedatar < 1 || choosedatar > 4);
		if(choosedatar == 1) {
			System.out.print("Input Sisi = ");
			sisidatar = scan.nextInt(); scan.nextLine();
			int luaspersegi = sisidatar*sisidatar;
			int kelilingpersegi = sisidatar*4;
			System.out.println("Luas = " + luaspersegi);
			System.out.println("Keliling = " + kelilingpersegi);
			System.out.println();
		}
		else if(choosedatar == 2) {
			System.out.print("Input Panjang = ");
			panjangdatar = scan.nextInt(); scan.nextLine();
			System.out.print("Input Lebar = ");
			lebardatar = scan.nextInt(); scan.nextLine();
			int luaspersegipjg = panjangdatar * lebardatar;
			int kelilingpersegipjg = panjangdatar + lebardatar;
			System.out.println("Luas = " + luaspersegipjg);
			System.out.println("Keliling = "+kelilingpersegipjg);
			System.out.println();
		}else if(choosedatar == 3) {
			System.out.print("Input Jari-Jari = ");
			jarilingkaran = scan.nextInt(); scan.nextLine();
			int luaslingkaran = 22/7 * (jarilingkaran * jarilingkaran);
			int kelilinglingkaran = 22/7 * (jarilingkaran + jarilingkaran);
			System.out.println("Luas Lingkaran = " + luaslingkaran);
			System.out.println("Keliling Lingkaran = " + kelilinglingkaran);
			System.out.println();
		}else if(choosedatar == 4) {
			System.out.print("Input Alas = ");
			alassegitiga = scan.nextInt(); scan.nextLine();
			System.out.print("Input Tinggi = ");
			tinggisegitiga = scan.nextInt(); scan.nextLine();
			System.out.print("Input Sisi Miring = ");
			sisimiringsegitiga = scan.nextInt(); scan.nextLine();
			int luassegitiga = (alassegitiga * tinggisegitiga) / 2;
			int kelilingsegitiga = (sisimiringsegitiga * 2) + alassegitiga;
			System.out.println("Luas Segitiga = " + luassegitiga);
			System.out.println("Keliling Segitiga = " + kelilingsegitiga);
			System.out.println();
		}
	}
	void ruang() {
		int chooseruang;
		int sisikubus;
		int panjangbalok;
		int lebarbalok;
		int tinggibalok;
		int jaribola;
		
		do {
			System.out.println("Bangun Ruang");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Bola");
			System.out.print("Choose = ");
			chooseruang = scan.nextInt(); scan.nextLine();
		} while (chooseruang < 1 || chooseruang > 3);
		if(chooseruang == 1) {
			System.out.print("Input Sisi Kubus = ");
			sisikubus = scan.nextInt(); scan.nextLine();
			int luaskubus = 6 * (sisikubus * sisikubus);
			int kelilingkubus = 12 * sisikubus;
			int volumekubus = sisikubus * sisikubus * sisikubus;
			System.out.println("Luas Kubus = " + luaskubus);
			System.out.println("Keliling Kubus = " + kelilingkubus);
			System.out.println("Volume Kubus = " + volumekubus);
			System.out.println();
		}else if(chooseruang == 2) {
			System.out.print("Input Panjang Balok = ");
			panjangbalok = scan.nextInt(); scan.nextLine();
			System.out.print("Input Lebar Balok = ");
			lebarbalok = scan.nextInt(); scan.nextLine();
			System.out.print("Input Tinggi Balok = ");
			tinggibalok = scan.nextInt(); scan.nextLine();
			int luasbalok = 2 * (panjangbalok + lebarbalok + tinggibalok);
			int kelilingbalok = 4 * (panjangbalok + lebarbalok + tinggibalok);
			int volumebalok = panjangbalok * lebarbalok * tinggibalok;
			System.out.println("Luas Balok = " + luasbalok);
			System.out.println("Keliling Balok = " + kelilingbalok);
			System.out.println("Volume Balok = " + volumebalok);
			System.out.println();
		}else if(chooseruang == 3) {
			System.out.print("Input Jari-Jari Bola = ");
			jaribola = scan.nextInt(); scan.nextLine();
			int luasbola = 4 * 22/7 * jaribola*jaribola;
			int kelilingbola = 4/3 * 22/7 * jaribola * jaribola;
			int volumebola = 4/3 * 22/7 * jaribola * jaribola * jaribola;
			System.out.println("Luas Bola = " + luasbola);
			System.out.println("Keliling Bola = " + kelilingbola);
			System.out.println("Volume Bola = " + volumebola);
		}
	}
	
public Main() {
	// TODO Auto-generated constructor stub
	int choose;
		do {
			do {
			System.out.println("Rumus");
			System.out.println("=====");
			System.out.println("1. Rumus Bangun Datar");
			System.out.println("2. Rumus Bangun Ruang");
			System.out.println("3. Exit");
			System.out.print("Choose = ");
			choose = scan.nextInt(); scan.nextLine();
		} while (choose < 1 || choose > 3);
			switch (choose) {
			case 1:
				datar();
				break;

			case 2:
				ruang();
				break;
			}
	} while (choose != 3);

}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	new Main();
}

}
