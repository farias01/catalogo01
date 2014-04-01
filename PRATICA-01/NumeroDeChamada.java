/*************************************** Metainformação de desenvolvimento **********************************************************/

/* A minha idéia inicial é criar uma ficha catalográfica altamente flexivel para se adaptar as necessidades
de variação destas (usar um separador "\" para separar ítens) , e armazenar como um tipo String, porém manter ítens essenciais em campos distintos(como por exemplo, autor, titulo e informações complementares) para facilitar o processo de busca e evitar replicação de 
termos (por exemplo, repetir a palavra autor, ou título). Para a busca se tornar completa, pensei em criar aliases onde necessário (por ex. Variantes do nome do autor/autores). Talvez exista uma técnica mais eficiente de fazer isso e que possa ser facilmente implementada em banco de dados ... (?)  

Ainda não pensei quais métodos vou implementar.

- Farias(usuário github/farias01)
*/  

/* A descrição do ISBN-13 pode ser encontrada na wikipedia. Não sei exatamente como se implementa o número de chamada. Pelo que pesquisei brevemente o sistema mais antigo e que ainda é utilizado em pequena escala é a Classificação Decimal Dewey (ou DDC), que tem a desvantagem de ser um sistema proprietário. Uma boa alternativa é o sistema de classificação "Library of Congress Classification (LCC) http://authorities.loc.gov/ " que é mais moderno e livre.
Um possível método para esta classe é para verificar o checksum do ISBN-13.

- Farias(usuário github/farias01)
*/


/* Cada vez que editar este arquivo (a parte do código) coloque a tua idéia acima desta linha e "assine". Não altere as postagens anteriores
da "Metainformação de desenvolvimento" inclusive as tuas próprias. - Separe cada postagem usando /*postagem* / ao invés de //   */



/***************************************               Código              **********************************************************/

// Para compatibilidade com sistemas de arquivos que não suportam utf-8 mantemos os nomes das classes restritos aos caracteres ASCII

class NumeroDeChamada {
	private double ISBN_13 ;
	private String LCC;

}	



	
