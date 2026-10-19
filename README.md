#  Sistema de Gestão de Pedidos (Java)

> Projeto desenvolvido para praticar conceitos fundamentais de Programação Orientada a Objetos (POO), Composição, Enumerações e manipulação de Coleções em Java.

---

##  Sobre o Projeto
O sistema permite cadastrar os dados de um cliente, registrar um pedido com um status específico (ex: `PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`), adicionar múltiplos itens vinculados a produtos, calcular subtotais e gerar um resumo completo e formatado do pedido com o valor total.

##  Tecnologias Utilizadas
* **Java** (JDK 21+)
* **IntelliJ IDEA**
* **Git e GitHub**

##  Diagrama de Classes (Estrutura)
O projeto é composto pelas seguintes entidades principais:
* **`Program`**: Classe de execução (`main`) responsável pela interação via terminal (`Scanner`).
* **`Order`**: Representa o pedido, contendo momento, status, cliente e uma lista de itens (`List<OrderItem>`), além de métodos para calcular o valor total.
* **`Client`**: Armazena as informações do cliente (nome, email e data de nascimento).
* **`OrderItem`**: Representa cada item do pedido, contendo a quantidade, preço unitário e o cálculo do subtotal.
* **`Product`**: Define o produto associado ao item (nome e preço).
* **`OrderStatus`**: Enum com os possíveis estados de um pedido (`PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`).

##  Exemplo de Execução
```text
Entre com os dados do cliente: 
nome: João Silva
Email: joao@email.com
Data de nascimento (DD/MM/YYYY): 15/05/2000
Entre com os dados do pedido: 
Status: PROCESSING
Quantos itens nesse pedido? 2
Entre com os dados do item #1: 
Nome do produto: TV
Preço do produto: 900.00
Quantidade: 1
Entre com os dados do item #2: 
Nome do produto: Mouse
Preço do produto: 50.00
Quantidade: 2

Resumo do pedido: 
Data do pedido: 19/10/2026
Status do pedido: PROCESSING
Cliente: 
João Silva - joao@email.com
Itens do pedido: 
TV, $900.00, Quantidade: 1, Subtotal: $900.00
Mouse, $50.00, Quantidade: 2, Subtotal: $100.00
Preço total: $1000.00