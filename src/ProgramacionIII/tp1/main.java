package ProgramacionIII.tp1;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 =new Node(-2,null);//9
		Node n2 =new Node(-1,null);
		Node n3 =new Node(2,null);//6
		Node n4 =new Node(-4,null);//7
		Node n5 =new Node(15,null);//8
		Node n6 =new Node(-6,null);
		Node n7 =new Node(20,null);
		Node n8 =new Node(5,null);
		
		Mylista lista =new Mylista();
		Mylista emptylist =new Mylista();

		lista.push(n1);
		lista.push(n2);
		lista.push(n3);
		lista.push(n4);
		lista.push(n5);
		lista.push(n6);
		lista.push(n7);
		lista.push(n8);
//		
		int umbral=15;

		MySecuencia secuencia= new MySecuencia(lista);
		Mylista muestra=secuencia.getSecuencia(umbral);

		Iterator<Integer> iterador = new MyIterador(muestra.getFirst());	
		while(iterador.hasNext()){// o(n) siendo en este caso recorrer toda la lista 
			System.out.println(iterador.next());
		}
		
//		System.out.println(muestra.pop());
		
//	  	Iterator<Integer> iterador = new MyIterador(lista.first);
//	   	while(iterador.hasNext()){
//			System.out.println(iterador.next());
//	   	}
//		System.out.println("---------");
//		System.out.println(lista.pop());
//		System.out.println("---------");
//		
//		Iterator<Integer> comprobarPop = new MyIterador(lista.first);
//	   	while(comprobarPop.hasNext()){
//			System.out.println(comprobarPop.next());
//	   	}
//	   	System.out.println("---------");
//		System.out.println(lista.top().getInfo());
	}

	

}
