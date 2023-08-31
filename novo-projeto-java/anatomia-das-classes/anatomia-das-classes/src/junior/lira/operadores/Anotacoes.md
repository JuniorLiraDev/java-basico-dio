# **Operadores**

# **Tipos**

- Atribuição
- Aritiméticos
- Unário - usados junto com outros op aritiméticos:
  - (+) valor positivo
  - (-) Valor negativo
  - (++) Incrementar valor
  - (--) Decrementar
  - (!) Lógico de negação --> inverter
- Ternário - é uma forma resumida para definir uma condição e escolher por um dentre dois valores, como um IF.
  - representado pelos símbolos ?:
  - sintaxe: - <Expressão Condicional>` ?`<Caso condição seja true>`: `<Caso condição seja false> - // classe Operadores.java
    int a, b;

a = 5;
b = 6;

/_ EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
resultado = "verdadeiro";
else
resultado = "falso";
_/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(valor);

- Relacionais - avaliam a relação entre duas variáveis ou expressões.

  - ==
  - !=
  - > , <, >=, <=

- Comparações Avançadas
  Quando estiver mais familiarizado com linguagem, recomendamos se aprofundar no conceito de espaço em memória Stack versus Heap.

  == versus equals: Existe uma relevância forte em realizar comparações com == e equals na qual precisamos ter uma compreensão de quais as regras seguidas pela linguagem \*\*\*\* , exemplo:
  // ComparacaoAvancada.java
  public static void main(String[] args) {

          int numero1 = 130;
          int numero2 = 130;
          System.out.println(numero1 == numero2); //true

          Integer numero1 = 130;
          Integer numero2 = 130;

          System.out.println(numero1 == numero2); //false

          // A razão pela qual o resultado é false, é devido o Java tratar os valores
          // Como objetos a partir de agora.
          // Qual a solução ?
          // Quando queremos comparar objetos, usamos o método equals

           System.out.println(numero1.equals(numero2));

  }

- Lógicos

  - &&
  - ||
  - !

- Expressões lógicas avançadas
  Nós acabamos de aprender que existem os operadores lógicos & (E) e || (OU), mas por quê no exemplo acima, foram ilustradas as condições:
  if (condicao1 && condicao2) e if(condicao1 || condicao2) ?
  A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado, isso quer que se a condição1 atender aos critérios não será necessário validar a condição2.
  // ComparacaoAvancada.java
  int numero1 = 1;
  int numero2 = 1;

if(numero1== 2 & numero2 ++ == 2 )
System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero1);
System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
O mesmo acontece com o operador | e || considerando que operador agora representa que, se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.
