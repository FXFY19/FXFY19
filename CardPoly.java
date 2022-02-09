
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

	public void setLegend(boolean ans) {
		if (ans == true) {
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
		MTG c = new MTG();
		c.setName("Narset");
		c.setRarity("Mythic Rare");
		c.setSet("Secret Lair");
		c.setType("Creature");
		c.setLegend(true);
		c.setCast("3URW");
		c.setTotal(6);
		c.setColorID("Jeskai (WRU)");
		System.out.println(c);
		System.out.println();

		CFV g = new CFV();
		g.setName("Blaze Maiden, Zonne");
		g.setRarity("Common");
		g.setUnit("Trigger");
		g.setHasTriggers();
		g.setTrigger("Critical");
		g.setSet("Starter Deck: Holy Dragon");
		g.setGrade(0);
		g.setClanNation("Dragon Empire");
		System.out.println(g);

		System.out.println();

		CFV x = new CFV();
		x.setName("Chakrabarthi Divinie Dragon, Nirvana");
		x.setRarity("Triple Rare");
		x.setSet("Starter Deck: Holy Dragon");
		x.setUnit("Normal");
		x.setHasTriggers();
		x.setGrade(3);
		x.setClanNation("Dragon Empire");
		System.out.println(x);

	}

}
