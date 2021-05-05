
public class OrderManager implements OrderService {

	

	public void orderDetail(Game game,Gamer gamer,Champaign champaign) {
		
		double sonFiyat = game.getPrice() - (game.getPrice() * champaign.getDiscount()/100) ;
		
		
		System.out.println("Sipariþ No: 1");
		System.out.println("Satýn Alan: " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Oyun: " + game.getGameName());
		System.out.println("Ýndirimsiz Fiyat: " + game.getPrice());
		System.out.println("Ýndirim Adý: " + champaign.getChampaignName());
		System.out.println("Ýndirim Oraný: " +"%"+ champaign.getDiscount());
		System.out.println("Ýndirimli Fiyat: " + sonFiyat);
		
	}

}
