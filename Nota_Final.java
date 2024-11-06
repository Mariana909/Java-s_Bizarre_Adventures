package maraton_programacion;

import java.util.*;

public class Nota_Final {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int cant = 0;
		int nota = 0;
		int multiplo = 0;

		System.out.println("Escriba la cantidad de notas que va a ingresar");

		cant = src.nextInt();

		if (1 <= cant && cant <= 100) {

			int[] listanotas = new int[cant];

			for (int i = 0; i < listanotas.length; i++) {
				nota = src.nextInt();
				if (0 <= nota && nota <= 100) {
					if (nota >= 38) {
						multiplo = (nota / 5 + 1) * 5;
						if (multiplo - nota < 3) {
							listanotas[i] = multiplo;
						} else {
							listanotas[i] = nota;
						}
					} else {
						listanotas[i] = nota;
					}

				} else {
					System.out.println("INTENTE DE NUEVO");
					i--;
				}
			}

			System.out.println("NOTAS:");

			for (int i : listanotas) {
				System.out.println(i);
			}

		}

	}
}
