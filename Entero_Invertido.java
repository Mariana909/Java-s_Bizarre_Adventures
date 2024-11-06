package maraton_programacion;

import java.util.*;


public class Entero_Invertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		long x= sr.nextLong();
		long num = Math.abs(x);
		ArrayList<Long>invertido=new ArrayList<>();
		if(Math.pow(-2,31)<x && (Math.pow(2,31))-1>x)
		{
			while(num != 0)
			{
				invertido.add(num%10);
				num /= 10;
			}
			
			if(x>0)
			{
				for (Long integer : invertido) {
					System.out.print(integer);
				}
			} else
			{
				System.out.print("-");
				for (Long integer : invertido) {
					System.out.print(integer);
				}
			}
		} else {
			x = 0;
			System.out.println(x);
		}
	}

}
