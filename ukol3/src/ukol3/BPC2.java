package ukol3;

public class BPC2 implements P�edm�t{
	private int ProjektBody,SemestralkaBody,ZkouskaBody;
	
	public String getJmeno() {
		return "BPC2";
	}
		
	public int getBody() {
		return ProjektBody + ZkouskaBody + SemestralkaBody;
	}
	
	public void setProjektBody(int Body){
		if (ProjektBody + Body < 31){
			ProjektBody += Body;
		} 
		else {
			System.out.println("Maxim�ln� hodnocen� projektu je 20 bod� .");
		}	
	}
	
	public void setSemestralkaBody(int Body){
		if (SemestralkaBody + Body <21) {
			SemestralkaBody += Body;
		}
		else {
		System.out.println("Maxim�ln� po�et bod� za p�lsemestr�ln� test je 20!");	
		}
	}
	
	public void setZkouskaBody(int Body){
		if (ZkouskaBody + Body <51) {
			ZkouskaBody += Body;
		}
		else {
		System.out.println("Maxim�ln� po�et bod� za z�v�re�nou zkou�ku je 50!");	
		}
	}
	
	public void getInfo() {
		if ((ProjektBody + SemestralkaBody) >= BodyZapocet) {
			System.out.println("Z p�edm�tu " +getJmeno()+ " m�te z�po�et");
		}
		else {
			System.out.println("Z p�edm�tu " +getJmeno()+ " nem�te z�po�et");
		}
		
	}
}
