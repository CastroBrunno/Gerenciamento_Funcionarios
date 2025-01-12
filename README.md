# Gerenciamento de Funcionários - Java Puro

Este projeto tem como objetivo a implementação de um sistema de gerenciamento de funcionários com as operações básicas de CRUD (Create, Read, Update, Delete) utilizando apenas **Java Puro**, sem a utilização de banco de dados ou frameworks. Os dados dos funcionários são armazenados em uma **ArrayList**.

## Funcionalidades

O sistema permite as seguintes operações sobre os dados dos funcionários:

- **Criar (Create)**: Adicionar um novo funcionário ao sistema.
- **Ler (Read)**: Visualizar informações de todos os funcionários cadastrados.
- **Atualizar (Update)**: Modificar as informações de um funcionário existente.
- **Excluir (Delete)**: Remover um funcionário do sistema.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Estrutura de dados**: ArrayList
- **Sem dependências externas**: O sistema não utiliza frameworks nem banco de dados, mantendo-se em Java puro.

## Estrutura do Projeto

O projeto está organizado de maneira simples, sem a necessidade de configurações complexas. Abaixo está uma breve descrição dos componentes principais:

- **Cargos**: Classe que representa oo cargos, com atributos, metodo construtor e metodos geters. Neste caso, os cargos são inseridos de forma manual no codigo (Provisório).
- **CargoValidador**: Classe responsável pela lógica de verificação dos cargos inseridos pela classe Main, utilizando o try catch para a verificação se o cargo inserio existe na classe Cargos.
- **Empregado**: Classe que representa o Funcionario, com os atributos nome, id, salario e cargo. Gerado com os metodos Geters e contrutor.
- **ListaEmpregados**: Classe que contem a logica das funções CRUD (CREATE, READ, UPDATE, DELETE).
- **Main**: Classe com o método `main` onde o sistema interage com o usuário, realizando as operações solicitadas.

## Como Rodar o Projeto

Para executar o projeto, siga os seguintes passos:

1. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/gerenciamento-funcionarios.git
   ```

2. Navegue até a pasta do projeto:
   ```bash
   cd Gerenciamento_Funcionarios
   ```
3. Compile e execute o projeto utilizando o comando abaixo:
   ```bash
   javac Main.java
   java Main
   ```
## Contribuindo

Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novos recursos. Se você encontrar algum problema ou tiver sugestões, abra uma issue para discussão.

   
