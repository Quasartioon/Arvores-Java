# Implementação de Árvore Binária em Java

## O que são árvores?
Uma árvore é uma estrutura de dados hierárquica composta por nós conectados por arestas.
Ela começa em um nó principal chamado raiz e se ramifica em outros nós chamados filhos. Cada nó pode ter zero ou mais filhos, formando níveis.

## O que é uma árvore binária?
Uma árvore binária é um tipo especial de árvore onde cada nó pode ter no máximo dois filhos:  
* Filho da esquerda
* Filho da direita  
** Características principais: **   
* Estrutura limitada a dois filhos por nó
* Pode ser usada para representar expressões, hierarquias simples, etc.
* Não necessariamente tem ordem entre os valores

## O que é uma árvore binária de busca?
Uma árvore binária de busca é uma árvore binária com uma regra de organização:    
**Para cada nó:**
* Valores menores ficam à esquerda
* Valores maiores ficam à direita

**Características principais:**
* Permite buscas rápidas (em média O(log n))
* Facilita operações como inserção, remoção e busca
* Mantém os dados ordenados implicitamente
