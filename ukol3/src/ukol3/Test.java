package ukol3;
import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        BPC1 p1 = new BPC1();
        BPC2 p2 = new BPC2();
        BPIS p3 = new BPIS();
        
        //BPC1
        System.out.println(p1.getJmeno() + " - Zadejte bodov� hodnocen� cvi�en� (max.20) : ");
        p1.setCviceniBody(sc.nextInt());    
        System.out.println(p1.getJmeno() + " - Zadejte bodov� hodnocen� z�v�re�n� zkou�ky (max.80): ");
        p1.setZkouskaBody(sc.nextInt());
        
        
        //BPC2
        System.out.println(p2.getJmeno() + " - Zadejte bodov� hodnocen� projektu (max.30): ");
		p2.setProjektBody(sc.nextInt());
		System.out.println(p2.getJmeno() + " - Zadejte bodov� hodnocen� p�lsemestr�ln�ho testu (max.20): ");
		p2.setSemestralkaBody(sc.nextInt());
		System.out.println(p2.getJmeno() + " - Zadejte bodov� hodnocen� z�v�re�n� zkou�ky (max.50): ");
		p2.setZkouskaBody(sc.nextInt());
		
        //BPIS
		System.out.println(p3.getJmeno() + " - Zadejte bodov� hodnocen� p�edm�tu (max.100): ");
		p3.setPocetBodu(sc.nextInt());

		
		p1.getInfo();
		p2.getInfo();
		p3.getInfo();
		
		System.out.println("Konec programu.");

	}

}
