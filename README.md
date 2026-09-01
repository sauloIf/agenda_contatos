# Agenda de Contatos - V.0.1.0

Este repositório contém a evolução para a versão **V.0.1.0** do projeto **Agenda de Contatos**, utilizado como material didático na disciplina de **Programação Orientada a Objetos (POO)** no Instituto Federal de Educação, Ciência e Tecnologia do Ceará (IFCE) - campus Maranguape.

O foco desta versão é avançar na forma de armazenamento de dados, evoluindo a estrutura procedural básica da versão anterior para permitir o cadastro de múltiplos contatos por meio de vetores (arrays).

## 📌 Sobre a Versão V.0.1.0

Partindo do código da V.0.0.0, as variáveis simples de texto foram substituídas por estruturas de vetores. O sistema continua centralizado dentro da classe `Principal` e do método `main()`, mantendo o foco didático exclusivamente na transição de armazenamento antes de avançar para a criação de objetos e classes personalizadas.

### ⚠️ Limitações Intencionais desta Versão:
* **Capacidade Fixa:** Os arrays exigem que o tamanho máximo seja definido no momento da criação. Nesta versão, a agenda possui um limite inicial rígido de **5 contatos**.
* **Gerenciamento Manual:** É necessário utilizar um contador manual (`quantidade`) para descobrir quais índices estão ocupados e evitar buracos na memória ao excluir registros.

## 🚀 Funcionalidades Adaptadas

O menu interativo permanece com as cinco opções clássicas, porém totalmente reescritas para manipular os índices dos vetores correlacionados:

1. **Adicionar contato:** Salva nome, celular e e-mail no índice apontado pela variável `quantidade` e incrementa o contador.
2. **Listar contatos:** Utiliza uma estrutura `for` para percorrer os arrays de `0` até o limite atual de contatos salvos, exibindo todos de forma limpa.
3. **Procurar contato:** Percorre o vetor com `for` comparando o termo digitado via `equalsIgnoreCase()`, permitindo encontrar contatos sem diferenciar maiúsculas de minúsculas.
4. **Excluir contato:** Localiza a posição do contato e reorganiza o vetor, deslocando os elementos seguintes para a esquerda para não deixar lacunas (`null`) no meio da estrutura.
5. **Sair:** Finaliza o laço `while` e encerra a aplicação.

## 🧠 Conceitos Praticados

Esta etapa do roteiro incremental exercita os seguintes fundamentos:

* **Declaração e Inicialização de Vetores:** Criação de `String[]` com tamanho pré-definido via variável de controle (`capacidade`).
* **Acesso por Índices:** Compreensão de que os arrays em Java iniciam na posição `0` e vão até `tamanho - 1`.
* **Estruturas de Controle Avançadas:** Uso do laço `for` casado com variáveis contadoras para percorrer e manipular coleções de dados de tamanho fixo.
* **Lógica de Deslocamento (Shifting):** Reorganização interna de posições de memória durante a remoção de itens.

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

Esta versão evidencia os problemas de trabalhar com arrays fixos (gerenciamento manual de tamanho, risco de `ArrayIndexOutOfBoundsException` e necessidade de deslocar dados na exclusão). 

A próxima evolução (**V.0.2.0**) resolverá esses problemas substituindo os arrays por coleções dinâmicas usando **List e ArrayList**.
