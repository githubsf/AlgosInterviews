
public class testSingleton {

	/**    MUST READ THIS LINK: AND COMMENTS SECTION TOO: http://stackoverflow.com/questions/1050991/singleton-with-arguments-in-java
	 * @param args
	 */
	public static void main(String[] args) {
		//writing my own singleton() class despite having a Set declared with private, static to make it immutable does not work
		//so in init I had to clear() the content of the set before adding new ones. Otherwise it would accumulate. see singleton() in Collections below.
		System.out.println(SingletonFactory.getSingleton().initPlayers("Player1","Computer").toString());
		System.out.println(SingletonFactory.getSingleton().initPlayers("A","F").toString());
		
		//Another way is to use the java.util.Collections.Singleton(T o) which returns an immutable Set. Works fine, if you want your state to be immutable.
		java.util.Set players = new java.util.HashSet();
		players.add("player1");
		players.add("Computer");
		java.util.Collections.singleton(players);//returns an immutable Set
		java.util.Set x = new java.util.HashSet();
		x.add("Blow Up");
		System.out.println(java.util.Collections.singleton(players).add(x)); //Runtime error : UnsupportedOperationException
	}

}
