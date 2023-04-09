/**
 * 
 */
/**
 * @author aness
 *
 */


import java.util.Scanner;


public class Notas {
  
	double uni1, uni2, uni3;
	double acu1, acu2, acu3, def;
	
	Scanner entrada = new Scanner(System.in);
	
	
	
	public void IngresaNotas() {
		
		System.out.println("ingrese las notas del estudiante de cada unidad formativa");
		
		System.out.print("ingrese nota 1: ");
		
		uni1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uni2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uni3= entrada.nextDouble();
		
	
	}
	

        
        
    
	
	public void comprobarcion(){
		
		if (uni1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uni2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uni3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	
	
	public void Calculonotas() {
		acu1= uni1*0.35;
		acu2 = uni2 * 0.35;
		acu3 = uni3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		

	}
       
	public void Mostrar() {
	
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uni1);
		System.out.println(" nota2 = " + uni2);
		System.out.println(" nota3 = " + uni3);
		
		System.out.println(" acumulado 1 = "+ acu1);
		System.out.println(" acumulado 2 = "+ acu2);
		System.out.println(" acumulado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
     
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	public static void main(String[] args) {
	
		Notas fc= new Notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}