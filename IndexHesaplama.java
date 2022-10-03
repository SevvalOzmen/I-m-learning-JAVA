import java.util.*;
public class IndexHesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Metre türünden boyunuzu giriniz: ");
		double boy = input.nextDouble();
		System.out.println("Kilonuzu giriniz: ");
		int kilo = input.nextInt();
		double index = kilo / (boy*boy);
		
		if(index < 18.5) {
			System.out.println("index = "+index);
			System.out.println("Normal kilonun altýndasýnýz.");
		}
		else if(index >=18.5 && index <= 29.5) {
			System.out.println("index = "+index);
			System.out.println("Ýdeal kilodasýnýz.");
		}
		else if(index >= 25 && index <= 29.5) {
			System.out.println("index = "+index);
			System.out.println("Normal kilonun üstündesiniz.");
		}
		else if(index >= 29.5) {
			System.out.println("index = "+index);
			System.out.println("Obezsiniz,Hastaneye gidiniz.");
		}

	}

}
