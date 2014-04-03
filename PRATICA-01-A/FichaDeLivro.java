class FichaDeLivro extends FichaDeLivro_Dados {
	

// Pergunta: um método que retorna void é finalizado com return ?
// Resposta: Não necessáriamente. Eu contudo recomendo que seja utilizado o return pois é boa pratica de programação. Note que mais de um 
// return pode ser utilizado para finalizar o método.

// Método escreveAutor. Serve para preencher o nome do autor na ficha.
	void escreveAutor(String autor) {
		this.autor = autor;
		return;
	}
// Método leAutor. Serve para ler o nome do autor na ficha.

	String leAutor() {
		return this.autor;
	}

}
