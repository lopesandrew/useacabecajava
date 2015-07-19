public class MyFirstApp {
	
	public static void main(String[] args){
		System.out.println("I Rule!"); 
		System.out.println("The World!");
		int x =3; 
		String name = "Andrew";
		x = x *17; 
		System.out.print("x is"+x);
		double d = Math.random();
		//isto e um comentario 
		
		while(x>12){ 
		    x = x-1;
		
		}
		for (x=0;x<10;x++){
		    System.out.print("x is now:  "+x);
		    
		
		}
		
	    if (x==10){
	    
	    System.out.print("x must be 10");
	    
	    } else {
	    System.out.print("x inst 10");
	    }
	    if ((x<3)&(name.equals("Andrew"))){
	    System.out.print("Gentil");
	    }
		System.out.print("Linha sem sentido!"); 
	}
	
	
}

