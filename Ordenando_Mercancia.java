package maraton_programacion;

import java.util.*;

public class Ordenando_Mercancia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		int T= sr.nextInt();
		for(int i=0;i<T;T++) {
			int N= sr.nextInt();
			ArrayList<Integer>cajas = new ArrayList<>();
			for (int j = 0; j < cajas.size(); j++) {
				cajas.add(sr.nextInt());
			}
			if(N>1) {
				for(int k=0;k<N;k++) {
					int a=cajas.get(k);
					int b=cajas.get(k+1);
					
				}
			}
		}
		
		int precio_ana = 0;
		int k = sr.nextInt();
	}
}
