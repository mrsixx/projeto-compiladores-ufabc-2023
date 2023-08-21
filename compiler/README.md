# 💡 Linguagem de Programação IsiLanguage

A **IsiLanguage** é uma linguagem de programação simples que permite a criação e execução de programas. Ela é baseada em um conjunto de regras e estruturas de código bem definidas descritas abaixo, que podem ser compiladas para código JAVA ou C. Esta documentação fornece uma visão geral dos principais elementos da linguagem e como eles são usados.

[![Veja o vídeo de demonstração](https://img.youtube.com/vi/Bksj054FIes/maxresdefault.jpg)](https://youtu.be/Bksj054FIes)

Uma IDE foi desenvolvida para a linguagem e pode ser encontrada [aqui](https://github.com/mrsixx/projeto-compiladores-ufabc-2023/tree/main/ide)

## Estrutura do Programa

Um programa em **IsiLanguage** segue a seguinte estrutura básica:

```isilanguage
programa
  <variáveis>
  <código>
fimprog.
```
O código do programa deve estar contido dentro do bloco delimitado pelo início (programa) e fim (fimprog) do programa.

## Declaração de Variáveis
As variáveis em IsiLanguage são declaradas da seguinte maneira:
```
declare <variável1>, <variável2>, ... como <tipo>;
```

Onde <variável1>, <variável2>, etc. são os nomes das variáveis que estão sendo declaradas e <tipo> é o tipo da variável (INTEIRO, DECIMAL ou TEXTO).

# Comandos
A linguagem suporta os seguintes comandos:

## Leitura de Dados
```
leia(<variável>);
```
Este comando permite a entrada de dados do usuário para a variável especificada.

## Escrita de Dados
```
escreva(<literal ou variável>);
```
Este comando exibe na saída os dados especificados, que podem ser texto entre aspas ou valores de variáveis.

## Atribuição
```
<variável> := <expressão>;
```

Atribui o valor resultante da expressão à variável especificada.

# Estruturas de Controle
## Estrutura Condicional (se-então-senão)

```
se (<condição>) entao
{
  <código>
}
senao
{
  <código>
}

```
Executa o bloco de código dentro do se se a condição for verdadeira; caso contrário, executa o bloco dentro do senao.

## Estrutura de Loop (Para todo)
```
paratodo <variável> <tipo> em [<limite inferior>..<limite superior>;<passo> ]|)
{
  <código>
}
```
Executa o bloco de código dentro do paratodo para cada valor no intervalo especificado. Segue uma notação semelhante à de intervalos na matemática, de modo que intervalos fechados à direita (variavel <= limite superior) são denotados com ] e intervalos abertos à direita (variavel < limite superior) são denotados com ). No caso de iterações decrescentes, os limites superior e inferior devem ser trocados


## Exemplos
```
paratodo z DECIMAL em [0..1;0.1) {
  se (z > 0.3 e z < 0.5) entao {
    escreva("Dentro do intervalo...").
  }
}

paratodo x INTEIRO em [10..1;-2] {
  escreva(x).
}
```

## Estrutura de Loop (Enquanto)
```
enquanto (<condição>) faca
{
  <código>
}

```
Executa o bloco de código dentro do enquanto enquanto a condição for verdadeira.

# Expressões
As expressões em IsiLanguage podem conter operadores aritméticos (+, -, *, /), relacionais (<, >, <=, >=, !=, ==) e lógicos (e, ou) e podem envolver números inteiros, decimais ou variáveis.

# Tipos de Dados
IsiLanguage suporta os seguintes tipos de dados:

* INTEIRO: Números inteiros.
* DECIMAL: Números decimais.
* TEXTO: Sequências de caracteres.


## ANTLR Tool
```
java -cp .;antlr-4.13.0-complete.jar org.antlr.v4.Tool IsiLanguage.g4 -package parser -o ./src/parser/
```
Comando para a recompilar a gramática da linguagem.