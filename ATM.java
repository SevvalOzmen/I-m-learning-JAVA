import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bakiye = 1000;
		System.out.print("Hangi i�lemi yapmak istiyorsunuz: \n"
				+ "bakiye ��renmek i�in 1'e, \n"
				+ "para �ekmek i�in 2'ye, \n"
				+ "para yat�rmak i�in 3'e, \n"
				+ "�iki� yapmak i�in 9 a bas�n�z.\n"
				+ ": ");
		int numara = input.nextInt();
		if(numara != 9) { 
			if(numara == 1) {
				System.out.println("Bakiyeniz: "+bakiye);
			}
			else if(numara == 2) {
				System.out.print("Ne kadar �ekmek istiyorsunuz: ");
				int miktar = input.nextInt();
				if(bakiye - miktar < 0) {
					System.out.println("Yetersiz bakiye.");
				}
				else {
					System.out.println("para �ekme i�lemi ba�ar�yla tamamlanm��t�r.\n"
							+ "Kalan bakiye = "+(bakiye-miktar));
				}
			}
			else if(numara == 3) {
			System.out.println("Ne kadar yat�rmak istiyorsunuz: ");
			int yatirim = input.nextInt();
			System.out.println("Toplam bakiye = "+(bakiye+yatirim));
		}
			else
				System.out.println("Ge�ersiz giri� i�lemi.");
	}
		else if(numara == 9) {
			System.out.println("��k�� i�leminiz ba�ar�yla tamamlanm��t�r.");
		}
	}
}
