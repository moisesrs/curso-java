## Exercício 4: Sistema de Pedidos

### Descrição
Crie uma classe `Pedido` para gerenciar pedidos.

### Requisitos

**Atributos privados:**
- `numeroPedido` (Long)
- `nomeCliente` (String)
- `valorTotal` (BigDecimal)
- `dataPedido` (Date)
- `status` (String)

**Construtor:**
- Deve receber: numeroPedido e nomeCliente
- Deve inicializar automaticamente `dataPedido` com `new Date()` (data/hora atual)
- Deve inicializar automaticamente `valorTotal` com BigDecimal.ZERO
- Deve inicializar automaticamente `status` com "PENDENTE"

**Métodos:**
- Getters e setters para todos os atributos
- Método `adicionarValor(BigDecimal valor)` que adiciona ao valorTotal
- Método `confirmarPedido()` que altera o status para "CONFIRMADO"
- Método `exibirPedido()` que imprime todos os dados formatados (use SimpleDateFormat para formatar a data)

**Classe de Teste:**
- Crie a classe `TestePedido` com método `main`
- Crie 2 pedidos
- Adicione valores aos pedidos
- Confirme um dos pedidos
- Exiba as informações de ambos
