import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Singleton {
	 
	//instance 
	private static final Singleton instance = new Singleton( );
	private static final Set<String> players = new TreeSet<String>();//despite static final, this is not a constant, you can modify its content,so I used 
	
	// Constructor
	private Singleton() {};
	
	//getter
	public static Singleton getInstance(){return instance;}
	
	// To give it a state, use another public method, 
	public Set<String> initPlayers(String A, String B){
		
		synchronized(players){
			            players.clear(); //workaround as there is no ImmutableSet as in google collections in java collections
						players.add(A);
						players.add(B);}
		return players;
		
	}

}
