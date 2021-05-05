public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,"Mustafa","Ceylan","123456","16/5/2021");
		Game game1 = new Game(1,"Mortal Combat","Dovus Oyunu",50);
		Champaign champaign1 = new Champaign(1,"Ramazan İndirimi",1,10);
		
		
		GameManager gameManager = new GameManager();
		GamerManager gamerManager = new GamerManager(new AuthManager());
		ChampaignManager champaignManager =  new ChampaignManager();
		
		gamerManager.add(gamer1);
		champaignManager.add(champaign1);
		gameManager.add(game1);
		System.out.println("");
		
		OrderManager orderManager = new OrderManager();
		orderManager.orderDetail(game1, gamer1, champaign1);
		
	}

}
