package conversiones;


public class MetodosDeConversiones {
    
        private double numero;
	short residuo;
	
	public MetodosDeConversiones(){
            
        }
	
	public double conversion_subir(double numero){
		if(numero >= 0){
			double n = numero/1024;
			this.numero = n;
			return n;
		}
		return 0;
	}
	public double convercion_bajar(double numero){
		if(numero > 0){
			double n = numero*1024;
			this.numero = n;
			return n;	
		}
		return 0;
	}
	public double conversion_Subir_Byte(double numero){
		if(numero >= 0){
			double n = numero/8;
			this.numero = n;
			return n;
		}
		return 0;
	}
	public double conversion_Bajar_Bit(double numero){
		if(numero > 0){
			double n = numero*8;
			this.numero = n;
			return n;
		}
		return 0;
	}
	
	public double ultimo_Numero(){
		return numero;
	}
	
    //Metodo para convertir a binario 
	public String convertir_A_Binario(long numero){
		StringBuilder concatenar = new StringBuilder();
		if(numero <= 0){
			return "0";
		}
		while(numero > 0 ){
			residuo = (short) ((short)numero % 2);
			numero = numero / 2; 
			//EL residuo se concatena al principio de la cadena
			concatenar.insert(0,String.valueOf(residuo));
		}
		return concatenar.toString();	
	}
	
	//Metodo para convertir a Binario
	public String convertir_A_Quinario(long numero){
		StringBuilder concatenar = new StringBuilder();
	    long n = numero;
		if(numero <= 0){
			 return "0";
		 }
		while(numero > 0 ){
		     numero = numero / 5;
		     residuo =(short)(n-numero*5);
		     //EL residuo se concatena al principio de la cadena
		     n = numero;
		     concatenar.insert(0,String.valueOf(residuo));
		 }
		 return concatenar.toString();			
	}
	
	//Metodo paraconvertir a octal 
	public String convertir_A_Octal(long numero){
		StringBuilder concatenar = new StringBuilder();
	    long n = numero;
		if(numero <= 0){
			return "0";
		 }
		while(numero > 0 ){
		     numero = numero / 8;
		     residuo =(short)(n-numero*8);
		     //EL residuo se concatena al principio de la cadena
		     n = numero;
		     concatenar.insert(0,String.valueOf(residuo));
		 }
		 return concatenar.toString();			
	}
	
	// Metodo para convertir a octal 
	public String convertir_A_Hexadecimal(long numero){
		StringBuilder concatenar = new StringBuilder();
	    long n = numero;
	    char residuo_Caracter = ' ';
	    
		if(numero <= 0){
			return "0";
		 }
		while(numero > 0 ){
		     numero = numero / 16;
		     residuo =(short)(n-numero*16);

		     if(residuo == 10){
		       residuo_Caracter= 'A';
		     }else if (residuo ==11){
		    	 residuo_Caracter = 'B';
		     }else if (residuo ==12){
		    	 residuo_Caracter = 'C';
		     }else if (residuo ==13){
		    	 residuo_Caracter = 'D';
		     }else if (residuo ==14){
		    	 residuo_Caracter = 'E';
		     }else if (residuo ==15){
		    	 residuo_Caracter = 'F';
		     }
		    
		     //EL residuo se concatena al principio de la cadena
		     n = numero;
		     if(residuo < 10){
		    	 concatenar.insert(0,String.valueOf(residuo));
		     }else{
		    	 concatenar.insert(0,String.valueOf(residuo_Caracter));
		     }
		 }
		 return concatenar.toString();			
	}
    
}
