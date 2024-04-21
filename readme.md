# Calculadora para Resistores em Java

## <span style="color:#00C151;">Visão Geral</span>

Este aplicativo Java fornece uma interface gráfica do usuário (GUI) para calcular a resistência de um resistor com base nas suas faixas de cores. Os usuários podem selecionar os códigos de cores para as faixas do resistor, e o aplicativo calculará e exibirá o valor de resistência correspondente, incluindo a tolerância.

## <span style="color:orange;">Funcionalidades</span>

- **<span style="color:purple;">Seleção de Faixas de Cores:</span>** Escolha as cores para a primeira faixa, segunda faixa, multiplicador e tolerância usando menus suspensos.

- **<span style="color:purple;">Cálculo:</span>** Clique no botão "Calcular Resistência" para calcular o valor da resistência com base nos códigos de cores selecionados e exibir o resultado.

- **<span style="color:purple;">Exibição de Tolerância:</span>** O valor calculado da resistência é exibido juntamente com a porcentagem de tolerância.

## <span style="color:orange;">Como Usar</span>

1. **<span style="color:purple;">Executar o Aplicativo:</span>**
    - Execute o método `main` na classe `ResistenciaColorida`.
    - A janela da GUI aparecerá, permitindo a interação com o aplicativo.

2. **<span style="color:purple;">Selecionar Faixas de Cores:</span>**
    - Use os menus suspensos para selecionar as cores para a primeira faixa, segunda faixa, multiplicador e tolerância.

3. **<span style="color:purple;">Calcular Resistência:</span>**
    - Clique no botão "Calcular Resistência" para realizar o cálculo da resistência.

4. **<span style="color:purple;">Ver Resultado:</span>**
    - O valor calculado da resistência, incluindo a tolerância, será exibido.

## <span style="color:orange;">Mapeamento de Códigos de Cores</span>

- **<span style="color:purple;">Faixas (Color Bands):</span>**
  - Preto: 0, Marrom: 1, Vermelho: 2, Laranja: 3, Amarelo: 4, Verde: 5, Azul: 6, Violeta: 7, Cinza: 8, Branco: 9.

- **<span style="color:purple;">Multiplicadores (Multipliers):</span>**
  - Preto: 1, Marrom: 10, Vermelho: 100, Laranja: 1000, Amarelo: 10000, Verde: 100000, Azul: 1000000, Violeta: 10000000, Cinza: 100000000, Branco: 1000000000.

- **<span style="color:purple;">Tolerâncias (Tolerances):</span>**
  - Sem Tolerância: 0.0, Marrom: 1.0, Vermelho: 2.0, Verde: 0.5, Azul: 0.25, Violeta: 0.1, Cinza: 0.05, Ouro: 5.0, Prata: 10.0.

## <span style="color:orange;">Sugestões para Melhoria</span>

- Implementar tratamento de erros para entradas inesperadas.
- Aprimorar o layout e o design da GUI para uma experiência mais amigável ao usuário.
- Fornecer dicas ou mensagens de ajuda para uma melhor orientação do usuário.




