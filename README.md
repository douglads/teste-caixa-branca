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
    As variáveis e constantes não possuem uma boa nomenclatura. Por exemplo, a variável "conn" poderia ser renomeada para "connection" para tornar seu propósito mais claro.
- ### EXISTEM LEGIBILIDADE E ORGANIZAÇÃO NO CÓDIGO?
    Sim, o código esta bem descrito e legivel, porém, a ressalvas é recomendado utilizar indentação adequada, separar as instruções SQL em linhas diferentes e adicionar espaços entre operadores e palavras-chave.
- ### TODOS OS NULLPOINTERS FORAM TRATADOS?
    Não há tratamento de null pointers no código fornecido. Seria necessário adicionar verificações para evitar possíveis exceções.
- ### A ARQUITETURA UTILIZADA FOI DEVIDAMENTE RESPEITADA?
    Não, pois, aqui só analisamos uma class e não o projeto como um todo.
- ### AS CONEXÕES UTILIZADAS FORAM FECHADAS?
    As conexões utilizadas não estão sendo fechadas corretamente. É recomendado utilizar blocos try-finally para garantir o fechamento adequado das conexões.
