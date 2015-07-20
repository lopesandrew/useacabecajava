class DrumKit{
	
	boolean topHat = true ; // declara instancias da classe Drumkit
	boolean snare = true ; 
	
	void playSnare(){
		System.out.println("Bang band ba-bang"); //metodos da classe
	}
	void playTopHat(){
		System.out.println("ding ding da-ding");
	}
}
class DrumKitTestDrive{
	public static void main (String[] args){
		
		DrumKit d = new DrumKit(); 
		
		d.playSnare(); 
		d.playTopHat(); 
		
		d.snare = false;
		if (d.snare == true){
			d.playSnare();
		}
		
		
		
		
		
		
		
	}
}
	
	
