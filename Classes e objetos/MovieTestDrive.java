class Movie{
	
	String title;
	String genre; //instancias
	int rating; 
	
	void playIt(){
		System.out.println("Playing the movie"); // metodo
	}
}

public class MovieTestDrive {
	public static void main(String [] args){ // finalidade de main testar sua classe real, iniciar o aplicativo
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre  = "Tragic "; 
		one.rating = -2; 
		Movie two = new Movie();
		two.title = "Lost in Cubicle spaces";
		two.genre = "Comedy"; 
		two.rating = 5; 
		two.playIt();
		Movie three = new Movie(); 
		three.title = "Byte Club";
		three.genre = "Tragic but ulmately uplifting";
		three.rating = 127; 
		System.out.println(three.title,three.genre,three.rating);
	}
}
