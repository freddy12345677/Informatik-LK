
public class gl�cksspiel_schule {
	static byte alter = 16;
	static String Name = "Freddy";
	static byte geschlecht = 1;

		public static void main(String[]args) {

if(alter < 18 || geschlecht == 2) {
	System.out.println(" Hallo " + Name + "!");}
	else if (geschlecht == 1) {System.out.println("Guten Tag Herr " + Name + "!");
	}
	else if (geschlecht == 0) {System.out.println("Herzlich Willkommen Frau " + Name + "!");}



double randomValue = Math.random();
if(alter >= 18) {System.out.println(randomValue * 100);
System.out.print("du hast ");
if (randomValue <= 0.43){System.out.println("gewonnen");}
else {System.out.println("verloren ");
}
}else if(alter < 18) {System.out.println("Sie haben nicht das ausreichende Alter");}
}
	


}


