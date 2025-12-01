## Exercício 3: Sistema de Funcionários

### Descrição
Crie uma classe `Funcionario` para gerenciar dados de colaboradores de uma empresa.

### Requisitos

**Atributos privados:**
- `matricula` (Long)
- `nome` (String)
- `cargo` (String)
- `salario` (BigDecimal)
- `dataAdmissao` (String) - formato "dd/MM/yyyy"

**Construtor:**
- Deve receber: matricula, nome e cargo
- Deve inicializar automaticamente `salario` com valor BigDecimal("1412.00") (salário mínimo)
- Deve inicializar automaticamente `dataAdmissao` com a data atual em formato String

**Métodos:**
- Getters e setters para todos os atributos
- Método `aplicarAumento(BigDecimal percentual)` que aumenta o salário
- Método `exibirFicha()` que imprime todos os dados do funcionário

**Classe de Teste:**
- Crie a classe `TesteFuncionario` com método `main`
- Crie 2 funcionários
- Altere o salário de um deles usando o setter
- Aplique um aumento percentual no salário do outro
- Exiba a ficha completa de ambos

---

## Dicas Importantes

1. **Import necessário**: Adicione `import java.math.BigDecimal;` no início das classes que usarem BigDecimal

2. **Operações com BigDecimal**: Use os métodos próprios da classe:
    - Soma: `saldo.add(valor)`
    - Subtração: `saldo.subtract(valor)`
    - Multiplicação: `saldo.multiply(percentual)`
