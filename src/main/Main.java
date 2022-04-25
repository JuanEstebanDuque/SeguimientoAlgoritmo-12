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
			System.out.println("Eliga la opci�n a realizar: \n" +
				"1. Dar turno.\n" +
				"2. Mostrar turno.\n" +
				"3. Pasar turno.\n" +
				"4. Eliminar turno.\n" +
				"9. Salir."
			);
			int opt = Integer.parseInt(lector.nextLine());
			switch (opt) {
			case 1: list.addLast(new Node(valueTurn));
				System.out.println("Turno a�adido correctamente.\n");
				valueTurn++;
				break;
			case 2: list.print();
				break;
			case 3: list.nextTurn();
					System.out.println("Se pas� el turno.\n");
				break;
			case 4: list.deleteTurn();
					System.out.println("Se borr� el nodo.\n");
				break;
			case 9: continuing = false;
			default: System.out.println("Opci�n incorrecte. Seleccione nuevamente.");
				break;
			}
		}
	}

}
