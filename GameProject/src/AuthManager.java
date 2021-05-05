public class AuthManager implements AuthService{

	public boolean auth(Gamer gamer) {
		
		if (
				gamer.getFirstName() == "Mustafa" & 
				gamer.getId() == 1 &
				gamer.getLastName() == "Ceylan" &
				gamer.getTc() == "123456" &
				gamer.getDate() == "16/5/2021"
				) {
			
			return true;
			
		}
		
		
		return false;
	}
	
}
