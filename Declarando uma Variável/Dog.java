class Dog {
	
		String name; 
		String raça; 
	
	

public static void main (String[] args){
	//cria um objeto Dog e o acessa
	Dog dog1 = new Dog(); 
	dog1.bark(); 
	dog1.name = "bart"; 
	//agora cria uma matriz Dog 
	Dog[] myDogs = new Dog[3]; 
	//e coloque dogs dentro da matriz
	myDogs[0] = new Dog();
	myDogs[1] = new Dog(); 
	myDogs[2] =  dog1; 
	
	//agora acessa os objetos Dog 
	//usando as referencias da matriz
	
	myDogs[0].name = "Fred"; 
	myDogs[1].name = "Marge";
	myDogs[0].raça = "Labrador" ;
	//Hmm qual o nome de myDogs[2]? 
	System.out.println("o nome do ultimo cao é : ");
	System.out.println(myDogs[2].name);
	//agora executa um loop pela matriz
	//e pede a todos os caes para latirem
	
	int x = 0 ; 
	while (x < myDogs.length){ // length fornece o tamanho da matriz
		myDogs[x].bark();
		x = x + 1;
	}
}

	public void bark (){
		System.out.println(name + "diz RUFF!");
	}
	public void eat(){}
	public void chasecat(){}
	
}
