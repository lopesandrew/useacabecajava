public class Player {
	int number = 0; //onde entra o palpite
	
	public void guess(){
		number = (int) (Math.random()*10);
		System.out.println("Estou pensando em "+number);
	
	}
}

