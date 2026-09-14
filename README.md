# 📇 Agenda de Contatos - V1.0.0

Uma aplicação de console simples e eficiente desenvolvida em **Java** para gerenciar uma agenda de contatos. O sistema permite realizar todas as operações essenciais de um CRUD (Criar, Ler, Atualizar e Deletar) diretamente pelo terminal.

---

## 🚀 Funcionalidades

O sistema conta com as seguintes opções de gerenciamento:
1. **Adicionar contato**: Cadastra o nome, celular e e-mail de um novo contato.
2. **Listar contatos**: Exibe todos os contatos salvos no sistema.
3. **Procurar contato**: Busca um contato específico pelo nome (ignora letras maiúsculas/minúsculas).
4. **Alterar contato**: Atualiza as informações de um contato existente.
5. **Excluir contato**: Remove um contato da agenda de forma definitiva.
6. **Sair**: Encerra a execução do programa com segurança.

---

## 🛠️ Tecnologias Utilizadas

* **Java SE (Standard Edition)**
* **Java Collections Framework**: Uso de `ArrayList` para armazenamento dinâmico de dados.
* **Java Utility Scanner**: Para captura de entradas de dados via console.

---

## 📥 Como Executar o Projeto

### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:
* [JDK (Java Development Kit)](https://oracle.com) instalado (versão 14 ou superior recomendada devido à sintaxe do `switch-case` utilizada).
* Um terminal (Prompt de Comando, PowerShell ou Terminal do Linux/Mac) ou uma IDE de sua preferência (Eclipse, IntelliJ IDEA, VS Code).

### Passo a Passo

1. **Clone este repositório:**
   ```bash
   git clone https://github.com
   ```

2. **Navegue até a pasta do projeto:**
   ```bash
   cd nome-do-seu-repositorio
   ```

3. **Navegue até o diretório do arquivo principal:**
   ```bash
   cd src/br/edu/principal
   ```

4. **Compile o código fonte:**
   ```bash
   javac Principal.java
   ```

5. **Execute a aplicação:**
   ```bash
   java br.edu.principal.Principal
   ```

---

## 💻 Exemplo de Uso

Ao iniciar a aplicação, a seguinte interface será exibida no terminal:

```text
==========================
    AGENDA DE CONTATOS    
         v1.0.0           
==========================
Bem-vindo!

1 - Adicionar contato
2 - Listar contatos
3 - Procurar contato
4 - Alterar contato
5 - Excluir contato
6 - Sair
Escolha uma opção: 
```

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
Desenvolvido com ☕ por [Seu Nome](https://github.com).
