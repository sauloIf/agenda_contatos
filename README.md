# Agenda de Contatos - V.0.0.0

Este repositório contém a versão inicial (V.0.0.0) do projeto **Agenda de Contatos**, desenvolvido como material didático para a disciplina de **Programação Orientada a Objetos (POO)** no Instituto Federal de Educação, Ciência e Tecnologia do Ceará (IFCE) - campus Maranguape.

O objetivo desta versão é estabelecer uma estrutura básica e procedural em Java, servindo como ponto de partida para o desenvolvimento incremental de conceitos mais avançados de programação.

## 📌 Sobre a Versão V.0.0.0

A versão V.0.0.0 foi construída seguindo uma abordagem puramente estrutural. Todo o sistema está centralizado dentro de uma única classe (`Principal`) e de um único método (`main`). 

A principal característica e limitação intencional desta versão é a capacidade de armazenar apenas **um contato por vez** na memória. Como não são utilizados arrays, listas ou objetos nesta etapa, os dados são guardados diretamente em variáveis simples. Caso um novo contato seja adicionado, os dados do contato anterior serão sobrescritos.

## 🚀 Funcionalidades

O programa roda diretamente no console e apresenta um menu interativo com cinco opções:

1. **Adicionar contato:** Permite ao usuário digitar o nome, celular e e-mail do contato.
2. **Listar contato:** Exibe as informações do contato atualmente salvo (valida se existe algum dado cadastrado).
3. **Procurar contato:** Realiza a busca pelo nome do contato (ignorando diferenças entre letras maiúsculas e minúsculas).
4. **Excluir contato:** Remove o contato da memória, limpando as variáveis e retornando-as ao estado inicial vazio.
5. **Sair:** Encerra a execução do programa de forma limpa.

## 🧠 Conceitos Praticados

Esta etapa do roteiro pedagógico exercita os seguintes fundamentos de programação em Java:

* **Variáveis e Tipos de Dados:** Uso de `String` para textos, `int` para a opção do menu e `boolean` para o controle do laço.
* **Entrada de Dados:** Utilização da classe `Scanner` para capturar as entradas do teclado e limpeza de buffer com `nextLine()`.
* **Estrutura de Repetição:** Uso do laço `while` para manter o programa ativo e retornar ao menu após cada operação.
* **Estruturas Condicionais:** Aplicação de `switch-case` para direcionar a ação do menu e `if-else` para validações lógicas.
* **Manipulação de Strings:** Emprego dos métodos `isEmpty()` e `equalsIgnoreCase()`.

## 💻 Como Executar

Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

1. Navegue até o diretório do projeto.
2. Compile o arquivo (respeitando a estrutura do pacote `br.edu.principal`):
   ```bash
   javac br/edu/principal/Principal.java
   ```
3. Execute o programa:
   ```bash
   java br.edu.principal.Principal
   ```

## ⏭️ Próximos Passos

Por se tratar de um desenvolvimento incremental, o próximo problema a ser resolvido é como guardar mais de um contato. A evolução seguinte (**V.0.1.0**) abordará a introdução de **Arrays** para solucionar essa limitação.

