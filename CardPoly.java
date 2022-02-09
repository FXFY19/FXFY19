
class Card{
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
		return ("Card Name: " + this.getName() + "\n" +
				"Card Rarity: " + this.getRarity() + "\n" +
				"Card Set: " + this.getSet());
		
	}
}


public class CardPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card();
		c.setName("Narset");
		c.setRarity("Mythic Rare");
		c.setSet("Secret Lair");
		System.out.println(c);

	}

}
