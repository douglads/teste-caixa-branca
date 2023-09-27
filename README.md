# Teste de caixa branca

## Observe o código no slide 28 da aula com conteúdo de teste de caixa branca;
[![N|Code](https://github.com/douglads/teste-caixa-branca/blob/main/code.JPG?raw=true)](https://github.com/douglads/teste-caixa-branca)
## Aponte os erros que podem conter no código;
As variaveis nome e result não fazem sentido ficarem fora dos escopos das funções
A instrução SQL não precisa necessariamente ser quebrada varias vezes e alterado seu valor.
Nos catchs os erros não são tratados

## Considere as recomendações dos slides posterior ao enunciado do exercício (slide 29);

- ### A DOCUMENTAÇÃO FOI DESCRITA NO CÓDIGO?
    Não, ele não descreve o que ocorre no código quase não há comentários
- ### AS VARIÁVEIS E CONSTANTES POSSUEM BOA NOMENCLATURA?
    Sim, ao meu ver elas descrevem bem o código.
- ### EXISTEM LEGIBILIDADE E ORGANIZAÇÃO NO CÓDIGO?
    Sim, o código esta bem descrito e legivel
- ### TODOS OS NULLPOINTERS FORAM TRATADOS?
    Os try catch não estão sendo tratados por tanto os null pointer podem haver erros
- ### A ARQUITETURA UTILIZADA FOI DEVIDAMENTE RESPEITADA?
    Não, pois, o código faltam coisas descritas logo a cima
- ### AS CONEXÕES UTILIZADAS FORAM FECHADAS?
    Sim, todas forão
