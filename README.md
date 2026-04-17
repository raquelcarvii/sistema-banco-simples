# Sistema Banco Simples

## Descrição
Sistema bancário simples desenvolvido em Java para praticar lógica de programação e Programação Orientada a Objetos
(POO). O sistema possui as classes `Cliente` e `Conta`, com a classe principal `Banco` para execução.

## Funcionalidades
- Cadastro de cliente com validação de idade (mínimo 16 anos)
- Depósito
- Saque com validação de saldo
- Transferência com validação de saldo

## Tecnologias
- Java 17

## Como rodar
1. Execute a classe principal `Banco`
2. Preencha os parâmetros: nome, CPF, email e idade
3. Se a idade for maior ou igual a 16, a conta será criada e os dados exibidos no console

## Testando os métodos:
- **Depósito** → insira o valor. O saldo será atualizado automaticamente. Para exibir o saldo, descomente as 
- linhas 22 e 23
- **Saque** → insira o valor desejado. Se o saldo for suficiente, o saque será efetuado. Caso contrário, será exibida 
- a mensagem "Saldo insuficiente". Descomente as linhas 26 e 27
- **Transferência** → se o saldo for suficiente, a transferência será efetuada. Caso contrário, será exibida a 
- mensagem "Saldo insuficiente". Descomente a linha 30