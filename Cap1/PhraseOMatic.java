public class PhraseOMatic {
	public static void main (String[] args){
		
		String[] wordListone = {"27/7", "varias camadas","30.000 pes", "B-to-B",
				"todos ganham", "front end", "baseado na Web", "difundido", "inteligente",
				"seis sigma", "caminho critico", "dinamico"}; 
		String[] wordListTwo = {"habilitado","adesivo","valor agregado","orientado","central","distribuido",
				"agrupado","solidificado", "independente da maquina", 
				"posicionado","em rede","dedicado","alavancado","posicionado","emrede","dedicado","alavancado",
				"alinhado","destinado","compartilhado","cooperativo","acelerado"};
		String[] wordListThree = {"processo","ponto maximo","solucao","arquitetura","habilitacao",
				"estrategia","Mindshare","portal","espacço","visao","paradigma","missao"};
		
		//quantas palavras existem em cada lista
		int oneLength = wordListone.length; 
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length; 
		
		
		//gere tres numeros aleatorios
		int rand1 = (int) (Math.random()*oneLength);
		int rand2 = (int) (Math.random()*twoLength); 
		int rand3 = (int) (Math.random()*threeLength);
		
		//agora construa uma frase 
		String phrase = " " + wordListone[rand1] + " do(a)" + wordListTwo[rand2] +" em "+wordListThree[rand3];
		
		//exiba a frase
		System.out.println("Precisamos de " + phrase); 
		
		
		}
		
		
	}

	
