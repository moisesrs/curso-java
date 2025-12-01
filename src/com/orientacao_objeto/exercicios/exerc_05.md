## Exercício 5: Sistema de Reservas de Hotel

### Descrição
Crie uma classe `Reserva` para gerenciar reservas em um hotel.

### Requisitos

**Atributos privados:**
- `codigoReserva` (Long)
- `nomeHospede` (String)
- `numeroQuarto` (Integer)
- `valorDiaria` (BigDecimal)
- `dataCheckIn` (Date)
- `dataCheckOut` (Date)

**Construtor:**
- Deve receber: codigoReserva, nomeHospede e valorDiaria
- Deve inicializar automaticamente `dataCheckIn` com `new Date()` (data/hora atual)
- Deve inicializar automaticamente `dataCheckOut` com null
- Deve inicializar automaticamente `numeroQuarto` com 0

**Métodos:**
- Getters e setters para todos os atributos
- Método `realizarCheckOut()` que define dataCheckOut com a data atual
- Método `calcularTotalEstadia(int numeroDias)` que retorna valorDiaria multiplicado pelo número de dias
- Método `exibirReserva()` que imprime todos os dados (formate as datas como "dd/MM/yyyy HH:mm")

**Classe de Teste:**
- Crie a classe `TesteReserva` com método `main`
- Crie uma reserva
- Defina um número de quarto
- Realize o check-out
- Calcule e exiba o total da estadia para 3 dias
- Exiba todos os dados da reserva

## Trabalhando com Date

### Import necessário
```java
import java.util.Date;
import java.text.SimpleDateFormat;
```

### Dicas para trabalhar com Date
- Criar uma data atual: `new Date()`
- Formatar data: `SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");`
- Converter Date para String: `sdf.format(data)`

```java
this.dataCheckIn = new Date();
SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
System.out.println("Data checkIn: " + sdfData.format(this.dataCheckIn));
System.out.println("Data checkOut: " + sdfData.format(this.dataCheckOut));
```        