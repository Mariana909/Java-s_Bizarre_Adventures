package maraton_programacion;
import java.util.*;

public class Restaurante {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n= sr.nextInt();
		int[] platos = new int[n];
		int precio_ana = 0;
		int k = sr.nextInt();
		
		
		for (int i = 0; i < platos.length; i++) {
			platos[i] = sr.nextInt();
		}
		
		int pepe = sr.nextInt();
		
		for (int i = 0; i < platos.length; i++) {
			if(i != k)
			{
				precio_ana += platos[i];
			}
		}
		
		precio_ana /= 2;
		
		if(precio_ana == pepe)
		{
			System.out.println("Bon Appetit");
		} else
		{
			System.out.println(Math.abs(precio_ana-pepe));
		}
	}

}
