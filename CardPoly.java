import java.util.Scanner;


class Card {
	private String name;
	private String rarity;
	private String set;

	public void setName(String newName) {
		name = newName;
	}

	public void setRarity(String newRarity) {
		rarity = newRarity;
	}

	public void setSet(String newSet) {
		set = newSet;
	}

	public String getName() {
		return name;
	}

	public String getRarity() {
		return rarity;
	}

	public String getSet() {
		return set;
	}

	@Override
	public String toString() {
		return ("Card Name: " + this.getName() + "\n" + "Card Rarity: " + this.getRarity() + "\n" + "Card Set: "
				+ this.getSet());

	}
}

class MTG extends Card {
	private String type;
	private String legendary;
	private String cast;
	private int total;
	private String colorID;

	public void setType(String newType) {
		type = newType;
	}

	public void setLegend(String ans) {
		if (ans.equals("Yes")) {
			legendary = "Yes";
		} else {
			legendary = "No";
		}
	}

	public void setCast(String newCast) {
		cast = newCast;
	}

	public void setTotal(int newTotal) {
		total = newTotal;
	}

	public void setColorID(String newColor) {
		colorID = newColor;
	}

	public String getType() {
		return type;
	}

	public String getLegend() {
		return legendary;
	}

	public String getCast() {
		return cast;
	}

	public int getTotal() {
		return total;
	}

	public String getColorID() {
		return colorID;
	}

	@Override
	public String toString() {
		return ("Magic Card Name: " + this.getName() + "\n" + "Rarity: " + this.getRarity() + "\n" + "Set: "
				+ this.getSet() + "\n" + "Legendary: " + this.getLegend() + "\n" + "Type: " + this.getType() + "\n"
				+ "Casting Cost: " + this.getCast() + "\n" + "Total Cost: " + this.getTotal() + "\n" + "Color Idenity: "
				+ this.getColorID());

	}

}

class CFV extends Card {
	private String clanNation;
	private String unit;
	private int grade;
	private boolean hasTriggers;
	private String triggers;

	public void setClanNation(String newClanNation) {
		clanNation = newClanNation;
	}

	public void setUnit(String newUnit) {
		unit = newUnit;
	}

	public void setHasTriggers() {
		if (this.getUnit().equals("Trigger")) {
			hasTriggers = true;
		} else {
			hasTriggers = false;
		}

	}

	public void setTrigger(String newTrigger) {
		triggers = newTrigger;
	}

	public void setGrade(int newGrade) {
		grade = newGrade;
	}

	public String getClanNation() {
		return clanNation;
	}

	public String getUnit() {
		return unit;
	}

	public int getGrade() {
		return grade;
	}

	public String getTriggers() {
		return triggers;
	}

	@Override
	public String toString() {
		if (hasTriggers == true) {
			return ("Cardfight Card Name: " + this.getName() + "\n" + "Rarity: " + this.getRarity() + "\n" + "Set: "
					+ this.getSet() + "\n" + "Grade: " + this.getGrade() + "\n" + "Unit: " + this.getUnit() + "\n"
					+ "Triggers: " + this.getTriggers() + "\n" + "Clan/Nation: " + this.getClanNation());
		} else {
			return ("Cardfight Card Name: " + this.getName() + "\n" + "Rarity: " + this.getRarity() + "\n" + "Set: "
					+ this.getSet() + "\n" + "Grade: " + this.getGrade() + "\n" + "Unit: " + this.getUnit() + "\n"
					+ "Clan/Nation: " + this.getClanNation());
		}

	}

}

public class CardPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MTG c = new MTG();
//		c.setName("Narset");
//		c.setRarity("Mythic Rare");
//		c.setSet("Secret Lair");
//		c.setType("Creature");
//		c.setLegend("Yes");
//		c.setCast("3URW");
//		c.setTotal(6);
//		c.setColorID("Jeskai (WRU)");
//		System.out.println(c);
//		System.out.println();
//
//		CFV g = new CFV();
//		g.setName("Blaze Maiden, Zonne");
//		g.setRarity("Common");
//		g.setUnit("Trigger");
//		g.setHasTriggers();
//		g.setTrigger("Critical");
//		g.setSet("Starter Deck: Holy Dragon");
//		g.setGrade(0);
//		g.setClanNation("Dragon Empire");
//		System.out.println(g);
//
//		System.out.println();
//
//		CFV x = new CFV();
//		x.setName("Chakrabarthi Divinie Dragon, Nirvana");
//		x.setRarity("Triple Rare");
//		x.setSet("Starter Deck: Holy Dragon");
//		x.setUnit("Normal");
//		x.setHasTriggers();
//		x.setGrade(3);
//		x.setClanNation("Dragon Empire");
//		System.out.println(x);
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entering a MTG or CFV card?");
		String cardgame = in.nextLine();
		if(cardgame.equals("MTG")) {
			MTG tem = new MTG();
			System.out.println("Enter MTG Card name: ");
			String MTGName = in.nextLine();
			tem.setName(MTGName);
			System.out.println("Enter MTG Card Rarity: ");
			String MTGRarity = in.nextLine();
			tem.setRarity(MTGRarity);
			System.out.println("Enter MTG Set: ");
			String MTGSet = in.nextLine();
			tem.setSet(MTGSet);
			System.out.println("Enter MTG Card Types: ");
			String MTGType = in.nextLine();
			tem.setType(MTGType);
			System.out.println("Is the MTG Card Legendary? Yes or No?");
			String MTGLegend = in.nextLine();
			tem.setLegend(MTGLegend);
			System.out.println("Enter the MTG Card Playing Cost: ");
			String MTGCost = in.nextLine();
			tem.setCast(MTGCost);
			System.out.println("Enter the MTG Card's Total Cost to play: ");
			String tel = in.nextLine();
			int MTGTotal = Integer.parseInt(tel);
			tem.setTotal(MTGTotal);
			System.out.println("Enter the MTG Card's Color Idenity: ");
			String MTGColorID = in.nextLine();
			tem.setColorID(MTGColorID);
			System.out.println(tem);
		}
		if(cardgame.equals("CFV")) {
			CFV twm = new CFV();
			System.out.println("Enter CFV Card Name: ");
			String CFVName = in.nextLine();
			twm.setName(CFVName);
			System.out.println("Enter CFV Card Rarity: ");
			String CFVRarity = in.nextLine();
			twm.setRarity(CFVRarity);
			System.out.println("Enter CFV Card Set: ");
			String CFVSet = in.nextLine();
			twm.setSet(CFVSet);
			System.out.println("Enter CFV Card Unit: ");
			String CFVUnit = in.nextLine();
			twm.setUnit(CFVUnit);
			twm.setHasTriggers();
			System.out.println("Enter CFV Card Trigger: ");
			String CFVTrigger = in.nextLine();
			twm.setTrigger(CFVTrigger);
			System.out.println("Enter CFV Card Grade: ");
			String tem_CFVGrade = in.nextLine();
			int CFVGrade = Integer.parseInt(tem_CFVGrade);
			twm.setGrade(CFVGrade);
			System.out.println("Enter CFV Card Clan/Nation: ");
			String CFVClanNation = in.nextLine();
			twm.setClanNation(CFVClanNation);
			System.out.println(twm);
		}

	}

}
