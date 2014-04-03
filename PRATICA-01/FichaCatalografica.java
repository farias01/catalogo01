/*************************************** Metainformação de desenvolvimento **********************************************************/

/* A minha idéia inicial é criar uma ficha catalográfica altamente flexivel para se adaptar as necessidades
de variação destas (usar um separador "\" para separar ítens) , e armazenar como um tipo String, porém manter ítens essenciais em campos distintos(como por exemplo, autor, titulo e informações complementares) para facilitar o processo de busca e evitar replicação de 
termos (por exemplo, repetir a palavra autor, ou título). Para a busca se tornar completa, pensei em criar aliases onde necessário (por ex. Variantes do nome do autor/autores). Talvez exista uma técnica mais eficiente de fazer isso e que possa ser facilmente implementada em banco de dados ... (?)  

Ainda não pensei quais métodos vou implementar.

- Farias(usuário github/farias01)
*/

/* A separação das classes em sub-blocos (Descricao, PontoDeAcesso, NumeroDeChamada começou a se mostrar bastante inconveniente. Para agrupar
estas classes, temos sinonimos ...
vou mudar o nome da Descrição para ficha catalografica para PRATICA-01-a e juntar PontoDeAcesso e NumeroDeChamada na mesma classe da DadosDeDescricao - separar logicamente os dados por meio de comentário e secoes distintas - fica como desafio pensar se há logica em 
separar grupos de dados em classes e depois reuni-los, pode-se fazer um exercicio simples sobre isso.
Este micro projeto fica arquivado para fins de estudo e sua modificação passa para a PRATICA-01-a

- Farias(usuário github/farias01)
 */

/* Cada vez que editar este arquivo (a parte do código) coloque a tua idéia acima desta linha e "assine". Não altere as postagens anteriores
da "Metainformação de desenvolvimento" inclusive as tuas próprias. - Separe cada postagem usando /*postagem* / ao invés de //   */



/***************************************               Código              **********************************************************/

// Para compatibilidade com sistemas de arquivos que não suportam utf-8 mantemos os nomes das classes restritos aos caracteres ASCII

class FichaCatalografica {
	private Descricao descricao;
	private PontoDeAcesso ponto_de_acesso;
	private NumeroDeChamada numero_de_chamada;
}	



	
