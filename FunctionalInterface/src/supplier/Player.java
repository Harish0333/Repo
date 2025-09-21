package supplier;

public class Player {
	private int playerId;
	private String playerName;
	
	public Player(int playerId, String playerName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
	}
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + "]";
	}

}
