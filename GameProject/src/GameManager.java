public class GameManager implements GameService{
	

	
	public void add(Game game) {
		
		System.out.println(game.getGameName() +  " adlý oyun eklendi...");

	}
	public void update(Game game) {
		
		System.out.println(game.getGameName() +  " adlý oyun güncellendi...");

	}
	public void delete(Game game) {
	
	System.out.println(game.getGameName() +  " adlý oyun silindi...");

	}
	
}
