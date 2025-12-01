## Exercício 7: Sistema PIX Completo

### Descrição
Crie um sistema completo para simular transferências PIX entre contas bancárias.

### Requisitos

#### Classe `ContaPix`

**Atributos privados:**
- `numeroConta` (Long)
- `titular` (String)
- `cpf` (String)
- `chavePix` (String)
- `saldo` (BigDecimal)
- `ativa` (Boolean)

**Construtor:**
- Deve receber: numeroConta, titular, cpf e chavePix
- Deve inicializar automaticamente `saldo` com BigDecimal("1000.00") (saldo inicial)
- Deve inicializar automaticamente `ativa` com true

**Métodos:**
- Getters e setters apropriados
- Método `depositar(BigDecimal valor)` que adiciona ao saldo
- Método `sacar(BigDecimal valor)` que verifica se há saldo suficiente antes de sacar
    - Retorna true se conseguiu sacar, false caso contrário
- Método `exibirDados()` que imprime as informações da conta

#### Classe `TransacaoPix`

**Atributos privados:**
- `idTransacao` (Long)
- `contaOrigem` (ContaPix) - referência para objeto ContaPix
- `chavePixDestino` (String)
- `valor` (BigDecimal)
- `dataTransacao` (Date)
- `descricao` (String)
- `statusTransacao` (String) - "PENDENTE", "APROVADA", "RECUSADA"

**Construtor:**
- Deve receber: idTransacao, contaOrigem, chavePixDestino, valor e descricao
- Deve inicializar automaticamente `dataTransacao` com `new Date()`
- Deve inicializar automaticamente `statusTransacao` com "PENDENTE"

**Métodos:**
- Getters e setters apropriados
- Método `processar()` que:
    - Verifica se a conta origem está ativa
    - Tenta sacar o valor da conta origem
    - Se conseguir, altera statusTransacao para "APROVADA"
    - Se não conseguir, altera statusTransacao para "RECUSADA"
    - Imprime uma mensagem do resultado
- Método `exibirComprovante()` que imprime:
    - ID da transação
    - Data e hora formatada (dd/MM/yyyy HH:mm:ss)
    - Conta origem (número e titular)
    - Chave PIX destino
    - Valor transferido
    - Descrição
    - Status da transação

**Classe de Teste:**
- Crie a classe `TestePixCompleto` com método `main`
- Crie 2 contas PIX diferentes
- Exiba os dados das contas antes das transações
- Crie 3 transações:
    1. Transferência de R$ 250,00 da conta 1 para conta 2 (deve ser aprovada)
    2. Transferência de R$ 1.500,00 da conta 1 para conta 2 (deve ser recusada por falta de saldo)
    3. Transferência de R$ 100,00 da conta 2 para conta 1 (deve ser aprovada)
- Processe cada transação
- Exiba o comprovante de cada transação
- Exiba os dados das contas após todas as transações para verificar os saldos

---

## Desafio Extra (Opcional)

Adicione à classe `ContaPix`:
- Método `consultarExtrato()` que lista todas as transações
- Para isso, crie um atributo `List<TransacaoPix>` que armazena as transações (usar ArrayList)

Adicione à classe `TransacaoPix`:
- Validação de valor mínimo (R$ 0,01) e máximo (R$ 5.000,00) para PIX

---

## Dicas para o Exercício PIX

1. **Relacionamento entre classes**: A classe `TransacaoPix` tem um atributo do tipo `ContaPix` - isso é composição!

2. **Validações importantes**:
    - Verificar se a conta está ativa antes de processar
    - Verificar se há saldo suficiente
    - Verificar se o valor é maior que zero

3. **Mensagens sugeridas**:
    - "PIX realizado com sucesso!"
    - "PIX recusado - Saldo insuficiente"
    - "PIX recusado - Conta inativa"

4. **Formatação de valores**: Para exibir valores monetários formatados:
```java
System.out.println("R$ " + valor);
```

---

## Resumo dos Conceitos Abordados

### Tipos de Dados Trabalhados
- `Long` - para identificadores numéricos
- `String` - para textos
- `BigDecimal` - para valores monetários (precisão decimal)
- `Date` - para data e hora
- `Boolean` - para valores verdadeiro/falso
- `Integer` - para números inteiros

### Boas Práticas
1. Sempre use `private` para atributos
2. Sempre use `public` para getters, setters e construtores
3. Use `BigDecimal` para valores monetários, nunca `double` ou `float`
4. Inicialize atributos no construtor quando possível
5. Use nomes descritivos para métodos e atributos
6. Formate datas para exibição usando `SimpleDateFormat`
7. Valide dados antes de processar operações críticas

### Imports Necessários
```java
import java.math.BigDecimal;
import java.util.Date;
import java.text.SimpleDateFormat;
```
