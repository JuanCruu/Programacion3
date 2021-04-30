package ProgramacionIII.tp1;

import java.util.Iterator;
	
public class MyIterador implements Iterator <Integer>{

	private Node aux;
	
	public MyIterador( Node nodo) {
		  aux = nodo;
	}
	public boolean hasNext() {
        if(aux==null){
            return false;
        }
        return true;
    }
    @Override
    public Integer next() {
        Integer data = 0;
        data = aux.getInfo();
        aux = aux.getNext();
        return data;
    }
	
}




