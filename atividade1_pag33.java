public class atividade1{  

	public static void main (String []args){  
		  
		int x = 0, impar=0;
		int i, mp, si, totalPar;
		Long par = new Long(0);
		  
		for(i=0; i<30; i++){  
		  
		if(i%2==0){  
		  
		    if(i>2){  
		  
		    par = par*i;  
		  
		    }  
		      
		    else{  
		    par = new Long(i);  
		    }  
		  
		}  
		  
		else{  
		  
		impar = impar+i;
		}  
		  
		  
		}  
		  
        System.out.println("A soma dos numeros impares de 1 a 30 é: "+impar);  
        System.out.println("A multiplicação dos numeros pares de 1 a 30 é: "+par);  
	}
}