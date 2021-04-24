package Application;

public class Lista{
	
	private No inicio;
	
	public Lista() {
		//criando lista vazia
		this.inicio = null;
	}

	public void inserir(int elemento) {
		//criar um novo nó
		No nova = new No();
		nova.setElemento(elemento); //inserir elemento no NO
		nova.setProximo(null); // depois dela vem ninguem
		
		if(inicio == null) {
			inicio = nova;
		}else {
			No aux;
			aux = inicio;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(nova);
		}
	}
	
	public int retirar() {
		//metodo que considewra que a lista sempre tem elemento
		if(inicio != null){
		No aux = inicio;
		int elemento = aux.getElemento();
		inicio = aux.getProximo();
		return elemento;
		}else {
			throw new RuntimeException("Lista Vazia");
		}
	}
	public void listar() {
		if(inicio == null) {
			System.out.println("Nada a exibir");
		}else {
			No aux = inicio;
			while(aux != null) {
				System.out.println("Elemento visto "+ aux.getElemento());
				aux = aux.getProximo();
			}
		}
	}
	
	public boolean isEmpty() {
		return this.inicio == null;
	}
}
