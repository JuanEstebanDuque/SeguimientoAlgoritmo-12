package model;

public class Lista {
	
	private Node head;
	private Node turn;
	private int lenght;

	public void addLast(Node node) {
		if(head == null) {
			head = node;
			head.setNext(head);
			head.setPrev(head);
			turn = head;
		}else {
			Node tail = head.getPrev();
			tail.setNext(node);
			node.setPrev(tail);
			node.setNext(head);
			head.setPrev(node);
		}
		lenght++;
	}
	
	public void nextTurn() {
		turn.setCount(turn.getCount() + 1);
		if(turn.getCount() == 3) {
			System.out.println("Se elimino por salto de turnos el turno: " + turn.getValue());
			deleteTurn();
		}
		turn = turn.getNext();
	}
	
	public void deleteTurn() {
		if(lenght !=1) {
			Node prev = turn.getPrev();
			Node next = turn.getNext();
			prev.setNext(next);
			next.setPrev(prev);
			if(turn.equals(head)) {
				head = next;
			}
			turn = next;
		}else {
			turn = null;
			head = null;
		}
		lenght--;
	}
	
	
	public void print() {
		print(turn);
	}
	
	private void print(Node node) {
		/*if(node.getNext() == head) {
			System.out.println("El turno es: " +node.getValue());
			return;
		}*/
		System.out.println("El turno es: " +node.getValue());
		//print(node.getNext());
	}

}
