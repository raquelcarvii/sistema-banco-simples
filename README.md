# Sistema Banco Simples

## Descrição
Sistema bancário simples desenvolvido em **Java** para praticar **Programação Orientada a Objetos (POO)**. O projeto 
simula operações básicas entre contas de um banco, com foco em boas práticas de modelagem e tratamento de erros.

## 🎯 Conceitos de POO aplicados

- **Encapsulamento** — atributos `private` com acesso controlado via getters/setters
- **Composição** — a classe `Conta` possui um objeto `Cliente` como atributo (em vez de apenas o nome)
- **Tratamento de erros com Exceptions** — validações lançam `IllegalArgumentException` em vez de imprimir mensagens
- **Guard Clauses** — validações no início dos métodos para evitar `if/else` aninhados
- **Validação no construtor** — garante que nenhum objeto `Conta` seja criado em estado inválido (ex: cliente menor 
de 16 anos)
- **Reuso de código** — o método `transferencia` reutiliza `depositar` na conta destino

## 🏗️ Estrutura do projeto

| Classe     | Responsabilidade |
|------------|------------------|
| `Cliente`  | Representa o titular da conta (nome, CPF, email, idade) |
| `Conta`    | Representa a conta bancária, com operações de depósito, saque e transferência |
| `Banco`    | Classe principal com o método `main` que simula o uso do sistema |

## Funcionalidades
- ✅ Cadastro de cliente
- ✅ Criação de conta com validação de idade (mínimo 16 anos)
- ✅ Depósito com validação de valor positivo
- ✅ Saque com validação de valor e saldo suficiente
- ✅ Transferência entre contas com validação de valor e saldo
- ✅ Tratamento de erros na classe principal via `try/catch`

## Tecnologias
- Java 17
- IntelliJ IDEA

## Como rodar
1. Clone o repositório:
   ```bash
   git clone https://github.com/raquelcarvii/sistema-banco-simples.git

## 🧪 Exemplo de execução

```
Sua conta foi criada com sucesso!
===Dados da conta===
Agência: 123
Conta: 4567-8
Titular: Ana Clara

Sua conta foi criada com sucesso!
===Dados da conta===
Agência: 987
Conta: 9874-5
Titular: João Silva

Usuário: Ana Clara
Saldo atual: 500.0

Usuário: Ana Clara
Saque efetuado com sucesso!
Saldo atual: 250.0

Usuário: Ana Clara
Transferência realizada com sucesso
Saldo atual: 200.0
```

## 📚 O que aprendi neste projeto
Diferença entre estado e comportamento de um objeto
Por que é melhor a classe validar seus próprios dados no construtor
Como usar exceptions para separar lógica de negócio da apresentação
Como objetos colaboram entre si (ex: uma Conta chamando método em outra Conta)
Importância de manter cada classe com uma responsabilidade única

👩‍💻 Autora
Raquel Carvalho — em jornada de aprendizado em Java e POO 🚀