public class Classroom {
	
	public static void main( String ... args ) {
		Wilder amaury = new Wilder( "Amaury" , true );
		Wilder jeremie = new Wilder( "Jérémie" , true );
		Wilder sandrine = new Wilder( "Sandrine" , false );
		System.out.println( amaury.whoAmI() );  
		System.out.println( jeremie.whoAmI() );
		System.out.println( sandrine.whoAmI() );
	}
}
