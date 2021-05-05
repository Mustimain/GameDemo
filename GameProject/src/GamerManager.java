public class GamerManager implements GamerService {
	

	AuthService authService;
	
	public GamerManager(AuthService authService) {
		this.authService = authService;
	}
	
	public void add(Gamer gamer) {
		
		if (authService.auth(gamer) == true) {
			System.out.println("Kullanýcý Girisi Basarýlý...");
			
			System.out.println(gamer.getFirstName() +  " adlý kullanýcý eklendi...");
		}
		else {
			
			System.out.println("Hatalý Kullanýcý");
		}
		



	}
	
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() +  " adlý kullanýcý bilgileri güncellendi...");
	}

	public void delete(Gamer gamer) {
	
		System.out.println(gamer.getFirstName() +  " adlý kullanýcý silindi...");
	}
}
