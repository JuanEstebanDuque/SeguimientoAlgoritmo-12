package main;

import java.util.Scanner;
import model.Lista;
import model.Node;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Lista list = new Lista();
		boolean continuing = true;
		int valueTurn = 1;
		while(continuing) {
			System.out.println("Eliga la opción a realizar: \n" +
				"1. Dar turno.\n" +
				"2. Mostrar turno.\n" +
				"3. Pasar turno.\n" +
				"4. Eliminar turno.\n" +
				"9. Salir."
			);
			int opt = Integer.parseInt(lector.nextLine());
			switch (opt) {
			case 1: list.addLast(new Node(valueTurn));
				System.out.println("Turno añadido correctamente.\n");
				valueTurn++;
				break;
			case 2: list.print();
				break;
			case 3: list.nextTurn();
					System.out.println("Se pasó el turno.\n");
				break;
			case 4: list.deleteTurn();
					System.out.println("Se borró el nodo.\n");
				break;
			case 9: continuing = false;
			default: System.out.println("Opción incorrecte. Seleccione nuevamente.");
				break;
			}
		}
	}

}
