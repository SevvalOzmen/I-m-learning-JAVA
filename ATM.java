import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bakiye = 1000;
		System.out.print("Hangi işlemi yapmak istiyorsunuz: \n"
				+ "bakiye öğrenmek için 1'e, \n"
				+ "para çekmek için 2'ye, \n"
				+ "para yatırmak için 3'e, \n"
				+ "çikiş yapmak için 9 a basınız.\n"
				+ ": ");
		int numara = input.nextInt();
		if(numara != 9) { 
			if(numara == 1) {
				System.out.println("Bakiyeniz: "+bakiye);
			}
			else if(numara == 2) {
				System.out.print("Ne kadar çekmek istiyorsunuz: ");
				int miktar = input.nextInt();
				if(bakiye - miktar < 0) {
					System.out.println("Yetersiz bakiye.");
				}
				else {
					System.out.println("para çekme işlemi başarıyla tamamlanmıştır.\n"
							+ "Kalan bakiye = "+(bakiye-miktar));
				}
			}
			else if(numara == 3) {
			System.out.println("Ne kadar yatırmak istiyorsunuz: ");
			int yatirim = input.nextInt();
			System.out.println("Toplam bakiye = "+(bakiye+yatirim));
		}
			else
				System.out.println("Geçersiz giriş işlemi.");
	}
		else if(numara == 9) {
			System.out.println("çıkış işleminiz başarıyla tamamlanmıştır.");
		}
	}
}
