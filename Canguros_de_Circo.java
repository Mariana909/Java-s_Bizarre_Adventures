package maraton_programacion;
import java.util.*;
public class Canguros_de_Circo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int x1= sr.nextInt();
			int v1= sr.nextInt();
			int x2= sr.nextInt();
			int v2= sr.nextInt();
			if(v1==v2 && x1!=x2)
			{
				System.out.println("NO");
			}else {
				float saltos=((x1-x2)/(v2-v1));
				if(saltos%1 !=0)
				{
					System.out.println("NO");
				}else if(saltos>=0)
				{
					System.out.println("SI");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
}
