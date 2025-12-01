## Exercício 6: Sistema de Consultas Médicas

### Descrição
Crie uma classe `Consulta` para gerenciar consultas médicas.

### Requisitos

**Atributos privados:**
- `idConsulta` (Long)
- `nomePaciente` (String)
- `nomeMedico` (String)
- `especialidade` (String)
- `valorConsulta` (BigDecimal)
- `dataConsulta` (Date)
- `realizada` (Boolean)

**Construtor:**
- Deve receber: idConsulta, nomePaciente, nomeMedico e especialidade
- Deve inicializar automaticamente `dataConsulta` com `new Date()` (data/hora atual)
- Deve inicializar automaticamente `valorConsulta` com BigDecimal("150.00")
- Deve inicializar automaticamente `realizada` com false

**Métodos:**
- Getters e setters para todos os atributos
- Método `remarcar(Date novaData)` que altera a dataConsulta
- Método `finalizarConsulta()` que marca realizada como true
- Método `aplicarDesconto(BigDecimal percentual)` que reduz o valorConsulta
- Método `exibirConsulta()` que imprime todos os dados (formate a data como "dd/MM/yyyy HH:mm")

**Classe de Teste:**
- Crie a classe `TesteConsulta` com método `main`
- Crie 2 consultas
- Aplique desconto de 10% em uma consulta
- Finalize uma das consultas
- Remarque a data de uma consulta
- Exiba as informações de ambas
