package aula;

public class usuario {
    public static void main(String[] args) {
        
    	smarttv smartTV = new smarttv();
    	
    	smartTV.diminuirVolume();
    	smartTV.aumentarVolume();
    	smartTV.aumentarVolume();
    	smartTV.aumentarVolume();
    	smartTV.aumentarVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();
    	smartTV.diminuirVolume();




    	
        System.out.println("Canal atual: " + smartTV.canal);

    	smartTV.mudarCanal(13);
        System.out.println("Canal atual: " + smartTV.canal);
	
    	
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Volume atual: " + smartTV.volume);
        
        smartTV.ligar ();
        System.out.println("Novo status - TV ligada? " + smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("Novo status - TV ligada? " + smartTV.ligada);
        
        
    }
}
