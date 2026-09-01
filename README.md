# Agenda de Contatos - V.0.3.0

Este repositório contém a evolução para a versão **V.0.3.0** do projeto **Agenda de Contatos**, utilizado como material didático na disciplina de **Programação Orientada a Objetos (POO)** no Instituto Federal de Educação, Ciência e Tecnologia do Ceará (IFCE) - campus Maranguape.

O foco principal desta versão é consolidar os métodos de manipulação de coleções dinâmicas através da introdução do método `set()`, completando o ciclo de um sistema **CRUD** básico utilizando a infraestrutura do framework `java.util.List`.

## 📌 Sobre a Versão V.0.3.0

Mantendo o alinhamento didático planejado, esta versão preserva o modelo de armazenamento dinâmico baseado em `ArrayList` e a arquitetura simplificada (todo o código centralizado no método `main()` da classe `Principal`). 

A novidade está no fechamento das operações básicas de dados. Ao adicionar o recurso de modificação, o aluno conclui o aprendizado das principais estruturas de manipulação de coleções em bloco antes de migrar os dados para objetos personalizados.

### 🔄 Alinhamento com o Conceito de CRUD
Com a chegada da funcionalidade **Alterar**, o projeto atinge a maturidade lógica de gerenciamento de dados de nível básico:
* **C**reate (Criar) ➡️ `nomes.add()` *(V.0.2.0)*
* **R**ead (Ler) ➡️ `nomes.get()` e `nomes.size()` *(V.0.2.0)*
* **U**pdate (Atualizar) ➡️ **`nomes.set()`** *(Novidade da V.0.3.0)*
* **D**elete (Excluir) ➡️ `nomes.remove()` *(V.0.2.0)*

## 🚀 Novas Funcionalidades e Ajustes de Interface

A inclusão da funcionalidade de edição exigiu uma reestruturação nas opções de fluxo do console para manter a coerência operacional:

1. **Adicionar contato**
2. **Listar contatos**
3. **Procurar contato**
4. **Alterar contato (NOVO):** Realiza uma busca sequencial pelo nome do registro desejado via `equalsIgnoreCase()`. Caso seja encontrado, armazena a posição do índice correspondente, solicita os novos dados por meio do `Scanner` e utiliza o método `.set(posicao, novoValor)` nas listas sincronizadas para atualizar as strings de dados.
5. **Excluir contato** *(Deslocado de 4 para 5)*
6. **Sair** *(Deslocado de 5 para 6)*

## 🧠 Conceitos Praticados

Esta etapa do roteiro pedagógico incremental exercita os seguintes fundamentos:

* **Substituição por Posição (`set`):** Diferenciação prática entre o método `add()` (que insere novos nós ao final da coleção) e o método `set()` (que substitui o valor contido em um índice já existente de forma destrutiva).
* **Controle de Estado de Busca:** Uso de inicializações com variáveis sinalizadoras (como `int posicao = -1`) para separar a fase de busca física dos dados da fase de leitura/escrita do console.
* **Tratamento de Exceções Lógicas:** Uso da estrutura `if-else` acoplada ao indexador para evitar tentativas de mutação de dados em referências nulas ou inexistentes.

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

Com o ciclo **CRUD completo** finalizado em ambiente estruturado, a limitação que se torna evidente é a redundância estrutural de manter três listas paralelas separadas (`nomes`, `celulares`, `emails`) para representar uma única entidade conceitual.

A próxima grande evolução do projeto sairá do modelo puramente procedural para introduzir a **Orientação a Objetos de verdade**, encapsulando estes três atributos em uma classe unificada chamada **Contato** e simplificando o armazenamento para uma lista unificada do tipo `List<Contato>`.
