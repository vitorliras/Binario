package pilhagem;

import Application.No;

public class Pilha_dinanmica {

	private No topo;
	
	public void push(int elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		novo.setProximo(topo);
		
		topo = novo;
	}
	
	public int pop() {
		int elemento = topo.getElemento();
		topo = topo.getProximo();
		return elemento;
	}
	
	public boolean isEmpty() {
		return (topo == null);
	}
}

