# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando Java puro:
- Singleton
- Strategy
- Facade


## Projeto final: ELETRÔNICA - Lei de Ohm 

**A Lei de Ohm é uma das mais usadas em cálculos de circuitos elétricos e eletrônicos. Esta lei define a relação entre a voltagem e a amperagem em um circuito elétrico. Esta lei foi descoberta pelo físico e matemático alemão Georg Simon Ohm. Em homenagem a ele, a unidade de Resistência Elétrica é Ohm.** 

![leideohm](http://www.eletronpi.com.br/images/cirleiohm.png)

Considere o esquema eletrônico acima. A Lei de Ohm é muito simple e é dada por:

**I = V / R**

A corrente I que circula por um resistor pode ser calculada dividindo-se o valor de tensão aplicado aos extremos do resistor pelo valor da resistência do resistor.

**V = I x R**

A tensão aplicada aos extremos do resistor pode ser calculada multiplicando-se a corrente que circula pelo resistor pelo valor de sua resistência.

**R = V / I**

O valor da resistência de um resistor pode ser calculado dividindo-se o valor de tensão aplicado aos extremos do resistor pelo valor da corrente que circula pelo resistor.

Em nosso sistema métrico a voltagem é expressa em Volts, a Resistência em Ohms e a corrente em Ampéres

Vejamos alguns exemplos:

Observe o esquema da figura 2:

![fig2](http://www.eletronpi.com.br/images/circuito1_fonte_resistor.png)


1) No circuito da figura 2, calcule o valor da corrente I, sabendo que a tensão da fonte F1 é de 12V e que o valor da resistência de R1 é 10 Ohms.

Resposta:

**I = V / R     então: I = 12V / 10 Ohms     logo: I = 1,2A**



2) No circuito da figura 2, calcule o valor da tensão V, sabendo que a intensidade da corrente I é de 1,2A e a resistência de R1 é 10 ohms.

Resposta:

**V = I x R     então: V = 1,2A x 10 Ohms     logo: V = 12V**

O valor da resposta acima é o esperado pois já sabíamos do exemplo 1 que para circular 1,2A pelo resistor de 10 ohms a tensão V era de 12V.


3) No circuito da figura 2, calcule o valor da Resistência do Resistor R1, sabendo que ao aplicar 12V em seus extremos, circula uma corrente de 1,2A.

Resposta:

**R = V / I     então: R = 12V / 1,2A     logo: R = 10 ohms**

Novamente o resultado é o esperado em função dos valores calculados nos exemplos 1 e 2.


Mais um exemplo:

Observe o circuito eletrônico da figura 3:

![fig2](http://www.eletronpi.com.br/images/circuito2_fonte_2_resistores.png)

3) No circuito da figura 3, calcule o valor do resistor R1, sabendo que por ele circula uma corrente de 1A. Sabemos ainda que o valor de R2 é de 20 ohms e que a intensidade da corrente I2 é de 4A.

Resposta:

Primeiro vamos calcular o valor da tensão V da fonte F1:

**V = I2 x R2     então: V = 4A x 20 ohms     logo: V = 80V**


Sabendo o valor de V, podemos facilmente calcular o valor de R1. O valor da corrente I1, que circula por R1, foi dado e vale 1A:

**R1 = V / I1     então: R1 = 80V / 1A     logo: R1 = 80 ohms**



As 3 fórmulas acima são as mais básicas da eletrônica e também são as mais usadas no cálculo de circuitos eletrônicos.




#fonte:(http://www.eletronpi.com.br/lei_de_ohm.aspx)



