/*-----------------------------------------------
 * File Name: Pokemon
 * Author: Julia Garrett   jrgarrett3222@gmail.com
 * Assignment: EECs-168 Homework 4
 * Description: This program simulates a battle between two pokemon
 * Date: 11/17/15
 */
public class Pokemon {
	private int hp;
	private int attackLevel;
	private int defenseLevel;
	private String name;
	private Dice d20;
	private Dice d6;
	public Pokemon(){
		hp=0;
		attackLevel=0;
		defenseLevel=0;
		name="";
		d20=new Dice(20);
		d6=new Dice(6);
	}
	public void setHp(int h){
		hp=h;
	}
	public void setAttackLevel(int a){
		attackLevel=a;
	}
	public void setDefenseLevel(int d){
		defenseLevel=d;
	}
	public void setName(String n){
		name=n;
	}
	public int getHp(){
		return hp;
	}
	public int getAttackLevel(){
		return attackLevel;
	}
	public int getDefenseLevel(){
		return defenseLevel;
	}
	public String getName(){
		return name;
	}
	public boolean attack(Pokemon opponent){
		int atkBonus=0;
		int defBonus=0;
		int opatkBonus=0;
		int opdefBonus=0;
		defBonus=d20.roll();
		atkBonus=d20.roll();
		opdefBonus=d20.roll();
		opatkBonus=d20.roll();
		System.out.println(this.name+" rolls an attack bonus of "+atkBonus);//first player rolls a d20 to determine attack bonus
		System.out.println(opponent.name+" rolls a defense bonus of "+opdefBonus);//second player rolls a d20 to determine defense bonus
		if (this.attackLevel+atkBonus>defenseLevel+defBonus){//if player 1's attack w the bonus is bigger than player 2's defense then the attack hits
			System.out.println("The attack hits dealing 3-D6 damage!");
			int r1=d6.roll();
			int r2=d6.roll();
			int r3=d6.roll();
			int damage=(r1+r2+r3);//lets player 1 roll 3 d6s to determined the damage done to player 2
			System.out.println("The rolls are "+r1+", "+r2+", and "+r3+" totalling: "+damage+" damage!" );
			opponent.hp=opponent.hp-damage;
			if(opponent.hp<=0){
				return true;
			}
			System.out.println(opponent.name+" has "+(opponent.hp)+" hit points left");
			System.out.println(opponent.name+" is attacking "+name);//the process above is repeated where player 2 is now attacking player 1
			}
		else{
			System.out.println("The attack missed!");
		}
		System.out.println(opponent.name+" rolls an attack bonus of "+opatkBonus);
		System.out.println(name+" rolls a defense bonus of "+defBonus);
		if((opatkBonus+opponent.attackLevel)>(defBonus+defenseLevel)){
			System.out.println("The attack hits dealing 3-D6 damage!");
			int r4=d6.roll();
			int r5=d6.roll();
			int r6=d6.roll();
			int damage=r4+r5+r6;
			System.out.println("The rolls are "+r4+", "+r5+", and "+r6+" totalling: "+damage+" damage!");
			hp=hp-damage;
			if(hp<=0){
				return true;
			}
			System.out.println(name+" has "+hp+" hit points left");
		}
		else{
				System.out.println("The attack missed!");
		}
			return false;
		
	}
	
	

}