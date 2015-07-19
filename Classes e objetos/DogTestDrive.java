class Dog {
	
	
	int size;
	String breed; // variaveis de instancia
	String name; 
	
	void bark(){ //um metodo 
		System.out.println("AUAUAU!"); 
	
	}
}

class DogTestDrive{
	
	public static void main (String[] args){
		
		Dog d = new Dog();
		d.size = 40; // o operador '.' para configurar o tamanho do objeto DOG 
		d.bark () ;
	
	}
	
	
	}
