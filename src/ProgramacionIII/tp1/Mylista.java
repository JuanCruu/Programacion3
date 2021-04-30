package ProgramacionIII.tp1;

public class Mylista extends MySimpleLinkedList {
	
	protected int size;
	protected Node first;
	protected Node last;
	public Mylista() {
		this.size = 0;
		this.first = null;

	}
	
	private void insertarAdelante(Integer o) {
		Node tmp = new Node(o, null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	//el metodo es o(1) 
	public void push(Node n){ //metodo utilizado dentro de getSecuencia(nodo)
        Node tmp = n;
        if(this.size == 0){
            this.first = tmp;
        }
        if(this.last != null){
            this.last.setNext(tmp);
        }
        this.last = tmp;
        this.size++;
    }
	// public void push(Node nuevo) { consumia mucho gasto computacional
	// 	if(first==null) {
	// 		this.insertarAdelante(nuevo.getInfo());//en caso de que la lista este vacia
	// 		this.size++;
	// 	}else {
	// 		Node temp=this.first;	
	// 		while(temp!=null&&temp.getNext()!=null) {
	// 			temp=temp.getNext();
	// 		}
	// 		temp.setNext(nuevo);
	// 		this.size++;
	// 	}
		
	// }

	 public Integer pop() {
	        int aux = -1;
	        Node temp=this.first;
	        while (temp.getNext().getNext() != null) {
	        	temp = temp.getNext();
	        	//el while corta en el anteultimo
	        }
	        aux = temp.getNext().getInfo();//desde el anteultimo toma el valor del siguiente ,osea el ultimo
	        temp.setNext(null);
	        size--;
	        return aux;
	        }

	 public Node top() {
	       return last;
	    }

	 public Node getFirst() {
			return this.first;
		}
	


	
}
