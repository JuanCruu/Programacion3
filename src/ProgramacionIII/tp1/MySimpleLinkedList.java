package ProgramacionIII.tp1;

public class MySimpleLinkedList {
	
	protected int size;
	protected Node first;

	public MySimpleLinkedList() {
		this.size = 0;
		this.first = null;
	}

	public void insertFront(Integer o) {
		Node tmp = new Node(o, null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}

	public Integer extractFront() {
		int info = this.first.getInfo();
		this.first = this.first.getNext();
		this.size--;
		return info;
	}

	public boolean isEmpty() {
		return first.getInfo() == null;
	}

	public int size() { // O(n) -->size
		return this.size;
	}
	
////////////////////rehacer usando un iterador/////////////////////////////////////
//	public Integer get(int index) {// si me pasan un numero tengo que devolver el nodo que se encuentra en esa
//										// posicion
//		Node tmp = this.first;
//		int info = 0;
//		int contador = 0;
//		for (int i = 0; i < index; i++) {
//			if (tmp.getNext() != null) {
//				tmp = tmp.getNext();
//				info = tmp.getInfo();
//				contador++;
//			}
//			if (contador == index) {
//				return info;
//		}
//	}
//		return null;
//		
//
//	}
	
	//2)

		// ////////////////////al insertar al principio///////////////////
		// 	en array es 0(n) n-->la cantidad de lugares que tiene el arreglo
		// 	(hay que hacer un corrimiento de todo el arreglo)

		// 	en una lista es o(1) ya que solamente cambia le primer nodo de la lista
		// 	el gasto de recurso es constante ya que la capacidad de la lista  no influye
		//
		// -- /////////////////////buscar un asdasd/////////////////////
		// en el array es o(1) ya  que una vez ubicado este mismo en la memoria solamente tiene que avanzar n cantidad de veces..
		// --en una lista
		// es 0(n) siendo en el peor de los casos recorrer todos los nodos hasta encontrar el valor solicitado

		// /////////////////////determinar la cantidad de elementos////////////////////
		
		// en el array es 0(1) ya que el tamaño esta definido cuando se crea el mismo
		// en la lista es 0(n) o 0(size) size-->contador de la lista|| ya que hasta que no se llegue hasta el ultimo nodo no se sabe el tamaño de este, si es que no se tiene una variable "size"
	
	


	//4)
	public int indexOf(Node value) {
		int i = 0;
		Node tmp = this.first;

		while (tmp.getInfo() != value.getInfo()) {
			tmp = tmp.getNext();
			i++;
		}
		if (tmp.getInfo() == value.getInfo()){
			return i;
		}else{
			return -1;
		}
			
	}

	//5)
	


}
