package helloapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBooks {
// Begin Class
	
	ContactBooks () { // Constructor
		//this.contact();
	}
	
	 String contact (String num) {
	 // Begin contact()
		
		String res = null;
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> tel = new ArrayList<String>();
			
		name.add("Abdellaziz cns");tel.add("58468084");
		name.add("Adel dridi");tel.add("21873622");
		name.add("Adnane b zineb");tel.add("23314845");
		name.add("Adnane expert");tel.add("98314845");
		name.add("Adnane loc");tel.add("97792620");
		name.add("Adoula dridi");tel.add("28302485");
		name.add("Ahmed moaoui");tel.add("98473760");
		name.add("Al ch");tel.add("52666395");
		name.add("Ali abassi");tel.add("98350366");
		name.add("Alla garbouje");tel.add("97563690");
		name.add("Amar livre cot");tel.add("94545337");
		name.add("Amicale");tel.add("71786661");
		name.add("Amrousi");tel.add("96126882");
		name.add("Anes mlk");tel.add("58348070");
		name.add("Anis cnam");tel.add("94190361");
		name.add("Anwar leila");tel.add("21044318");
		name.add("Avocat nidhal");tel.add("22653837");
		name.add("Aziz med");tel.add("93372027");
		name.add("B ai rafrafi");tel.add("26868864");
		name.add("Badiaa huissie");tel.add("93230414");
		name.add("Badri");tel.add("97495822");
		name.add("Bchir ridha");tel.add("25466753");
		name.add("Ben tkhyat sal");tel.add("97038531");
		name.add("Boucher hassin");tel.add("98333506");
		name.add("Bouraoui med");tel.add("22320224");
		name.add("Brour");tel.add("98344030");
		name.add("Bureau wahid c");tel.add("71843637");
		name.add("Cab formati");tel.add("+21620422141");
		name.add("Cabinet brour");tel.add("71505436");
		name.add("Chantal b tkha");tel.add("97576646");
		name.add("Chef h hamadi");tel.add("54830142");
		name.add("Chevrolet cais");tel.add("52994667");
		name.add("Chokri chevrol");tel.add("22524865");
		name.add("Cnam");tel.add("71104200");
		name.add("Cnam amine");tel.add("98535220");
		name.add("Cnss radhia");tel.add("22897323");
		name.add("D oc jemail");tel.add("98342395");
		name.add("Damek hafedh");tel.add("25585599");
		name.add("Dentiste");tel.add("71822521");
		name.add("Derangement te");tel.add("72347175");
		name.add("Dhaouadi forma");tel.add("98820710");
		name.add("Dhouibi");tel.add("98674182");
		name.add("Doc erakam");tel.add("71885450");
		name.add("Doc mongi b re");tel.add("98320930");
		name.add("Domicile brour");tel.add("70615689");
		name.add("Dorsaf justice");tel.add("97319379");
		name.add("Doss jamel");tel.add("20438728");
		name.add("Dr b moussa");tel.add("98375694");
		name.add("Dridi Adel");tel.add("55551112");
		name.add("Driss");tel.add("50324354");
		name.add("Fakri");tel.add("20314515");
		name.add("Faoyzi voisin");tel.add("22541474");
		name.add("Fathi makni hu");tel.add("99196911");
		name.add("Fatnassi pensi");tel.add("20312136");
		name.add("Fawzi kadr");tel.add("54543260");
		name.add("Fayçal klibi");tel.add("98380116");
		name.add("Fekih mohamed");tel.add("98560252");
		name.add("Ferid tounsi");tel.add("99911462");
		name.add("Fethi cnss");tel.add("98529712");
		name.add("Fitouri najib");tel.add("98301222");
		name.add("Formation ghaz");tel.add("52744744");
		name.add("France retrait");tel.add("0033247887850");
		name.add("Ghadira meher");tel.add("92125224");
		name.add("Ghaleb");tel.add("21135572");
		name.add("Ghazouani form");tel.add("53744822");
		name.add("H Aziz");tel.add("52688810");
		name.add("H Heykel");tel.add("93125405");
		name.add("H laamouri");tel.add("98700644");
		name.add("H leila");tel.add("95606065");
		name.add("H Salim");tel.add("24878810");
		name.add("Habib dalimo");tel.add("52454903");
		name.add("Habib dalimo s");tel.add("97434903");
		name.add("Habitation mod");tel.add("71234089");
		name.add("Hachemi amical");tel.add("25115642");
		name.add("Hajem");tel.add("58347955");
		name.add("Hajjem");tel.add("22629118");
		name.add("Ham port nouve");tel.add("004915226993808");
		name.add("Hamadi maisan");tel.add("+49714264676");
		name.add("Hana bouzrara");tel.add("98935646");
		name.add("Hannachi");tel.add("97423060");
		name.add("Hatem errahal");tel.add("29280130");
		name.add("Haykel moala");tel.add("98303930");
		name.add("Haykel moalla");tel.add("52529552");
		name.add("Hedi bouker");tel.add("71280066");
		name.add("Hedi horri");tel.add("97430653");
		name.add("Hemdani");tel.add("98381412");
		name.add("Hichem cnam");tel.add("98219621");
		name.add("Hinda");tel.add("97143234");
		name.add("Hisar");tel.add("55274548");
		name.add("Hizar");tel.add("55208935");
		name.add("Hizar");tel.add("00491798027421");
		name.add("Hizar maison");tel.add("004977202371724");
		name.add("Horri abd");tel.add("72346227");
		name.add("Horri Selim");tel.add("24878810");
		name.add("Houcine chevro");tel.add("97673248");
		name.add("Houcine cnam");tel.add("94482355");
		name.add("Houcine knam");tel.add("22765763");
		name.add("Houte");tel.add("97574565");
		name.add("Ibt formation");tel.add("73449871");
		name.add("Ibtihal format");tel.add("29408870");
		name.add("Ibtihal format");tel.add("54183564");
		name.add("Imed avocat");tel.add("21201250");
		name.add("Imed b amor ab");tel.add("52925802");
		name.add("Imed Remadi");tel.add("96661221");
		name.add("Imed rmadi");tel.add("22103310");
		name.add("Issaoui hassin");tel.add("92696688");
		name.add("Jalal boudriga");tel.add("98612018");
		name.add("Jalal hama");tel.add("22668714");
		name.add("Jalila JRAD");tel.add("6379");
		name.add("Jaloul");tel.add("26744722");
		name.add("Jarbouy");tel.add("97717253");
		name.add("Jawaher Horri");tel.add("99614256");
		name.add("Jhorri");tel.add("27052829");
		name.add("Justice monir");tel.add("98975544");
		name.add("Kaddour plombi");tel.add("20139850");
		name.add("Kar forma");tel.add("53389803");
		name.add("Karim Rihab");tel.add("97478711");
		name.add("Karoui f");tel.add("52587420");
		name.add("Kassem");tel.add("21996343");
		name.add("Kh hichem");tel.add("21268687");
		name.add("Khelifa abdera");tel.add("98916591");
		name.add("Kilani ahmed");tel.add("53676606");
		name.add("Kilani steg");tel.add("23537054");
		name.add("Kraim noureddi");tel.add("95394674");
		name.add("Labaoui abdelk");tel.add("98546271");
		name.add("Lamine znaide");tel.add("94847214");
		name.add("Lamouri hafedh");tel.add("98538153");
		name.add("Lazher");tel.add("98355699");
		name.add("Leila");tel.add("95606065");
		name.add("Loc nouv");tel.add("24818918");
		name.add("Lotfi solaire");tel.add("98338086");
		name.add("Ma Tt");tel.add("94628442");
		name.add("Mahmoud tbolbi");tel.add("23215959");
		name.add("Malek zbeir");tel.add("97467763");
		name.add("Maoya brahma");tel.add("99537494");
		name.add("Mariam bank");tel.add("98661581");
		name.add("Med chevrolet");tel.add("53543843");
		name.add("Med El H Ben A");tel.add("92586636");
		name.add("Med el hedi b");tel.add("92054102");
		name.add("Med ladghem sa");tel.add("98332069");
		name.add("Med parabole");tel.add("22513454");
		name.add("Meher garmasi");tel.add("97334688");
		name.add("Menjour hedi");tel.add("98573791");
		name.add("Mm bjaoui form");tel.add("24511006");
		name.add("Mm ishraf apt");tel.add("92207145");
		name.add("Mm Samah Justice");tel.add("26324383");
		name.add("Mm sameh just");tel.add("25471808");
		name.add("Mnakbi");tel.add("26270574");
		name.add("Moez dalimo");tel.add("98635192");
		name.add("Mohsen c polic");tel.add("98335371");
		name.add("Moncef frigide");tel.add("98659970");
		name.add("Monira horri");tel.add("93551868");
		name.add("Mousbah macon");tel.add("96555715");
		name.add("Must sakhri av");tel.add("98315287");
		name.add("Naji rounia ma");tel.add("96221096");
		name.add("Nejib klai");tel.add("22524433");
		name.add("Nou horri");tel.add("70682462");
		name.add("Noureddine che");tel.add("22541513");
		name.add("Oualid b cheik");tel.add("98565532");
		name.add("Plombier ridha");tel.add("54901161");
		name.add("Pridha bchir");tel.add("26264263");
		name.add("R0uis Av");tel.add("71354375");
		name.add("Rabeh labidi p");tel.add("98662954");
		name.add("Rached darouic");tel.add("98256329");
		name.add("Radhia hori");tel.add("55103695");
		name.add("Rahbani");tel.add("99289622");
		name.add("Rahma mourour");tel.add("58345487");
		name.add("Raouf ayed");tel.add("52666510");
		name.add("Riadh ksair");tel.add("71896144");
		name.add("Ridha");tel.add("97419274");
		name.add("Ridha compt cn");tel.add("97419274");
		name.add("Rima");tel.add("93125270");
		name.add("Rimdha Cp");tel.add("93372027");
		name.add("Rouissi samwel");tel.add("58878178");
		name.add("S fa assist");tel.add("71800412");
		name.add("Saber");tel.add("21635047");
		name.add("Safi abdallah");tel.add("99210951");
		name.add("Samawl Rouissi");tel.add("92051178");
		name.add("Samia quincail");tel.add("53552802");
		name.add("Samir boucher");tel.add("97160022");
		name.add("Seltana");tel.add("22557620");
		name.add("T Radio");tel.add("54005597");
		name.add("Wartani");tel.add("54673010");
		name.add("Zohra");tel.add("97820053");
		
		for (int i = 0;i<tel.size();i++) {
			
			if (tel.contains(num)) {
				
				res = name.get(tel.indexOf(num));
				
				return res;
				
			}
			
			else
				res = "\n\n\tError, there is no name with that number";
			
		}
		
		return res;
		
	// End concat()
	}
	 
	static Scanner jin = new Scanner(System.in);
	 
	public static void main (String[] args) {
	// Begin main()
		 
		System.out.print("Enter tel number : \n\t ");
		String num = jin.nextLine();
			
		System.out.print(": "+ new ContactBooks().contact(num) +" \n");
			
		jin.close();
		
	// End main() 
	}
	
	
// End Class
}
