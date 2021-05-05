public class ChampaignManager implements ChampaignService{



	public void add(Champaign champaign) {
		
		System.out.println(champaign.getChampaignName() +  " adlý kampanya eklendi...");
	}
	
	public void update(Champaign champaign) {
		
		System.out.println(champaign.getChampaignName() +  " adlý kampanya güncellendi...");
	}

	public void delete(Champaign champaign) {
	
	System.out.println(champaign.getChampaignName() +  " adlý kampanya silindi...");
	}
	
}
