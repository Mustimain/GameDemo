

public class Champaign implements Entity {
	
	private int id;
	private String champaignName;
	private int gameId;
	private int discount;
	
	public Champaign() {
		
		
	}
	
	public Champaign(int id, String champaignName, int gameId, int discount) {
		super();
		this.id = id;
		this.champaignName = champaignName;
		this.gameId = gameId;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChampaignName() {
		return champaignName;
	}

	public void setChampaignName(String champaignName) {
		this.champaignName = champaignName;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	

}
