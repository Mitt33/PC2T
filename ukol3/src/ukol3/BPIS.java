package ukol3;

public class BPIS implements P�edm�t{
	private int PocetBodu;
	
	public String getJmeno() {
		return "BPIS";
	}
	
	public int getBody() {
		return PocetBodu;
	}
	
	public void getInfo() {
		if ( PocetBodu >= BodyZapocet) {
			System.out.println("Z p�edm�tu "+getJmeno()+ " m�te z�po�et ");
		}
		else {
			System.out.println("Z p�edm�tu " +getJmeno()+ " nem�te z�po�et");
		}
	}
	
	public void setPocetBodu(int Body){
		if (PocetBodu + Body < 101) {
			PocetBodu += Body;
		}
		else {
			System.out.println("p�ekro�il jste maxim�ln� mo�n� po�et bod� 100! ");
		}
	}
	
}


