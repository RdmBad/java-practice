package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 45;
		if(temperature >= 65) {
			System.out.println("Its a nice day! Lets code java");
		}else {
			System.out.println("Stay home and code java");
		}
		
	// 2 int variables, teamAScore, teamBScore
	// put a condition. check if teamA won. "Team A won" , "Go to Team A"
	//else "Team B won or it was a draw"  "Go Teams"
		
		int teamAArgentina = 5;
		int teamBJamaica = 0;
		
		if(teamAArgentina > teamBJamaica) {
			System.out.println("Argentina - Jamaica 5-0");
			System.out.println("Go to Team Argentina");
		}else {
			
			System.out.println("Eto pesnya ne nasha");
			System.out.println("Rashod-Kantora!");
		}
	}
}
