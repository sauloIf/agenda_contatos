# Agenda de Contatos - V.0.2.0

Este repositório contém a evolução para a versão **V.0.2.0** do projeto **Agenda de Contatos**, utilizado como material didático na disciplina de **Programação Orientada a Objetos (POO)** no Instituto Federal de Educação, Ciência e Tecnologia do Ceará (IFCE) - campus Maranguape.

O foco desta versão é a introdução do conceito de **Coleções Dinâmicas**, substituindo o uso de arrays fixos por `List` e `ArrayList` para gerenciar os dados em memória.

## 📌 Sobre a Versão V.0.2.0

A versão V.0.2.0 resolve os problemas estruturais e limitações encontrados na versão baseada em arrays (V.0.1.0). O projeto continua estruturado de forma procedural dentro da classe `Principal` e do método `main()`. O objetivo pedagógico é permitir ao aluno comparar, linha por linha, a transição entre as três formas de armazenamento:
1. `V.0.0.0` ➡️ Variáveis simples (1 contato)
2. `V.0.1.0` ➡️ Arrays (capacidade fixa, manipulação manual)
3. `V.0.2.0` ➡️ ArrayList (capacidade dinâmica, métodos nativos)

### 🚀 Vantagens alcançadas nesta versão:
* **Capacidade Dinâmica:** Não há necessidade de definir uma capacidade máxima prévia. A agenda cresce e diminui de tamanho conforme a necessidade.
* **Fim do Deslocamento Manual:** Métodos nativos da API do Java assumem a responsabilidade de reorganizar os elementos internamente após uma exclusão.

## 💾 Operações Adaptadas da Coleção

O menu de opções permanece o mesmo, mas a manipulação dos dados agora utiliza os métodos nativos da classe `ArrayList`:

* **Adicionar contato (`add`):** Insere os novos dados diretamente ao final das listas, eliminando o controle manual do índice livre.
* **Listar contatos (`size` e `get`):** A própria lista sabe seu tamanho atual através do `.size()`. O acesso aos elementos mapeados é feito via `.get(i)`.
* **Procurar contato (`get`):** Pesquisa de forma limpa em uma quantidade dinâmica de registros mantendo a lógica de busca com `.equalsIgnoreCase()`.
* **Excluir contato (`remove`):** A remoção total e o rearranjo dos elementos seguintes são feitos diretamente com o método `.remove(indiceExcluir)`, extinguindo a necessidade de laços `for` de deslocamento ou atribuições manuais de `null`.

## 🧠 Conceitos Praticados

Esta etapa do roteiro incremental exercita os seguintes fundamentos:

* **Coleções do Java (Framework Collections):** Importação e declaração das estruturas `java.util.List` e `java.util.ArrayList`.
* **Uso de Generics (`<String>`):** Definição do tipo de dado que a coleção irá armazenar de forma segura.
* **Abstração de Métodos Nativos:** Compreensão de como utilizar `add()`, `get()`, `remove()` e `size()` para delegar tarefas de baixo nível à linguagem.
* **Otimização de Código:** Remoção de variáveis obsoletas de controle manual como `capacidade` e contadores de itens cadastrados.

## 💻 Como Executar

1. Certifique-se de que a estrutura do pacote está mantida como `br.edu.principal`.
2. Compile o arquivo modificado:
   ```bash
   javac br/edu/principal/Principal.java
   ```
3. Execute o programa:
   ```bash
   java br.edu.principal.Principal
   ```

## ⏭️ Próximos Passos

Com as três formas de armazenamento consolidadas de forma procedural, o projeto está maduro para dar o próximo salto pedagógico: **Modularização e a verdadeira Programação Orientada a Objetos**.

As próximas etapas abordarão a quebra desse método único através da criação de métodos separados e o agrupamento das variáveis (`nomes`, `celulares`, `emails`) dentro de uma classe dedicada de modelo chamada **Contato**, aplicando o conceito de **Encapsulamento**.
