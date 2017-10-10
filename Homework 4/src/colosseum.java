/*-----------------------------------------------
 * File Name: colosseum
 * Author: Jules Garrett   jrgarrett3222@gmail.com
 * Assignment: EECs-168 Homework 4
 * Description: This program lets two players create thier own pokemon and let them battle.
 * Date: 11/17/15
 */
import java.util.Scanner;
public class colosseum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Player 1, build your Pokemon!");
		System.out.println("=============================");
		System.out.println("Please name your pokemon:");
		Pokemon Pk1=new Pokemon();
		Pokemon Pk2=new Pokemon();
		String name1=new String();
		name1=s.nextLine();
		Pk1.setName(name1);
		while(name1.equals("")){//makes sure that the pokemon has a name
			System.out.println("You must give your Pokemon a name.");
			name1=s.nextLine();
			Pk1.setName(name1);//sets the pokemon's name 
		}
		System.out.println("How many hit points will it have? (1-50):");//player determines the hit points of their pokemon
		int hp=0;
		hp=s.nextInt();
		Pk1.setHp(hp);
		System.out.println("Split fifty points between attack level and defense level");
		System.out.println("Enter your attack level (1-49): ");//player sets attack level and the program forces the player to make it be between 1 and 49
		int attack=0;
			attack=s.nextInt();
			Pk1.setAttackLevel(attack);
			while(attack<1||attack>49){
				System.out.println("Sorry. The attack level must be between 1 and 49:");
				attack=s.nextInt();
				Pk1.setAttackLevel(attack);
			}
		System.out.println("Enter your defense level (1-"+(50-attack)+"): ");//player sets the defense level and the program forces them to make it plus the attack level not exceed 50
		int defense=0;
		defense=s.nextInt();
		Pk1.setDefenseLevel(defense);
		while(defense<1||defense>(50-attack)){
			System.out.println("Sorry. The defense level must be between 1 and 30:");
			defense=s.nextInt();
		}
		System.out.println("Player 2, build your Pokemon!");//player 2 now goes through the same process as player 1 making a pokemon
		System.out.println("=============================");
		System.out.println("Please name your pokemon:");
		String name2=new String();
		s.nextLine();
		name2=s.nextLine();
		Pk2.setName(name2);
		while(name2.equals("")){
			System.out.println("You must give your Pokemon a name.");
			name2=s.nextLine();
			Pk2.setName(name2);
		}
		System.out.println("How many hit points will it have? (1-50):");
		int hp2=0;
		hp2=s.nextInt();
		Pk2.setHp(hp2);
		System.out.println("Split fifty points between attack level and defense level");
		System.out.println("Enter your attack level (1-49): ");
		int attack2=0;
			attack2=s.nextInt();
			Pk2.setAttackLevel(attack2);
			while(attack2<1||attack2>49){
				System.out.println("Sorry. The attack level must be between 1 and 49:");
				attack2=s.nextInt();
				Pk2.setAttackLevel(attack2);
			}
		System.out.println("Enter your defense level (1-"+(50-attack2)+"): ");
		int defense2=0;
		defense2=s.nextInt();
		Pk2.setDefenseLevel(defense2);
		while(defense2<1||defense2>(50-attack2)){
			System.out.println("Sorry. The defense level must be between 1 and 30:");
			defense2=s.nextInt();
			Pk2.setDefenseLevel(defense2);
		}
		System.out.println("Player 1 will roll a D2 to decide who goes first.");//a d2 is used to decide who goes first
		Dice d2=new Dice(2);
		int player;
		if(d2.roll()==1){
			System.out.println("Player 1 rolls a 1 and will go first");
			player=1;
		}
		else{
			System.out.println("Player 1 rolls a 2 and will go second");
			player=2;
		}
		int i=1;
		boolean myBool=false;
		while(myBool==false && i<=10){//makes sure program will end after 10 rounds or when a pokemon dies
			System.out.println("\nRound "+i+"!");
			if (player==1){
				System.out.println("\n"+name1+" is attacking "+name2);//first player attacks
				myBool=Pk1.attack(Pk2);
				i++;
			}
			else{
				System.out.println("\n"+name2+" is attacking "+name1);
				myBool=Pk2.attack(Pk1);
				i++;
			}
		}
		if(Pk1.getHp()<=0){
			System.out.println(name1+" has been defeated!");
		}
		else if(Pk2.getHp()<=0){
			System.out.println(name2+" has been defeated!");
		}
		else{
			System.out.println("Both fighters are still standing! It's a draw!");
		}
		s.close();
		
		
		
		
		
		

	}

}
