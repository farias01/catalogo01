// Aqui não se cria uma instância, e sim usa-se a classe diretamente.

class TestaFichaDeLivro extends FichaDeLivro {

// Implementa o método testa()
  void testa() {
	
        // Testa Método escreveAutor da FichaDeLivro.
	this.escreveAutor("Jules Verne"); 
		
        // Testa Método leAutor da FichaDeLivro.
	System.out.println(this.leAutor()); 
	
	return;  //finaliza o metodo testa();	
  	}
}
