package ukol3;

public class BPC1 implements P�edm�t{
	private int CviceniBody,ZkouskaBody;
	
	public String getJmeno() {
		return "BPC1";
	}
	
	public int getBody() {
		return CviceniBody + ZkouskaBody;
	}
	
	public void setCviceniBody(int Body){
		if (CviceniBody + Body < 21){
			CviceniBody += Body;
		} 
		else {
			System.out.println("Maxim�ln� hodnocen� aktivity  ve cvi�en�ch je 20 bod�.");
		}	
	}
	
	public void setZkouskaBody(int Body){
		if (ZkouskaBody + Body <81) {
			ZkouskaBody += Body;
		}
		else {
		System.out.println("Maxim�ln� po�et bod� za zkou�ku je 80!");	
		}
	}
	
	public void getInfo() {
		if (CviceniBody >= BodyZapocet) {
			System.out.println("Z p�edm�tu " +getJmeno()+ " m�te z�po�et.");
		}
		else {
			System.out.println("Z p�edm�tu " +getJmeno()+ " nem�te z�po�et.");
		}
		
	}
	
	
}


