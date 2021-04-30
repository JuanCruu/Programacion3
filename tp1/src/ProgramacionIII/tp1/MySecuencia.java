package ProgramacionIII.tp1;

import java.util.Iterator;

public class MySecuencia {

	protected Mylista lista;
	private boolean numeroseModifico = false;
	
	public MySecuencia(Mylista list) {
		this.lista=list;
	}
	
	public Mylista getSecuencia(Integer umbral) {	//este metodo tiene un gasto computacional O(n+1)--->n el while del iterador 
													//y 1 al salir del while y pushear el ultimo nodo
		Mylista returnList=new Mylista();//lista a retornar
		Iterator<Integer> iterador = new MyIterador(this.lista.getFirst());
		int numero=0;		//numero actual
		int siguiente=0;	//numero siguiente
		
		//si ya el primer nodo de la lista esta vacio no hace falta recorrerla para ver si supero el umbral
		if(isEmpty()) {
			 return returnList;	
		}else {
			 siguiente=this.lista.first.getInfo();
		}
		while(iterador.hasNext()) {
			if(numero!=0)numeroseModifico=true;//detecta cuando se modifico la variable numero
			siguiente = iterador.next();
			if((numero + siguiente) <=umbral) {
				numero = numero + siguiente;
			}else {
				if(numero <= umbral && numeroseModifico) { 	//si el numero(la suma de numero y siguiente supero el umbral, la guardo dentro de la lista)
					Node nuevoNodo = new Node(numero,null);//no sin antes verificar que numero es menos o igual al umbral y si es distinto de la primera vez
					returnList.push(nuevoNodo);			//que se seteo, permitiendo tambien la entrada de un numero 0 que podria llegar a estar en la lista
				}
				numero = siguiente;
			}	
		}
		//o en caso de que la suma de todos no halla superado al maximo
		if(numero <= umbral){ 
			Node nuevoNodo = new Node(numero,null);
			returnList.push(nuevoNodo);
		}
		return returnList;	
	}
	private boolean isEmpty() {
		return lista.first== null;
	}

	
	
}

























