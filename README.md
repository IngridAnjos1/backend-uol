# Desafio: Sistema de Cadastro de Jogadores com Codinomes
Descrição do Projeto
O objetivo deste projeto é desenvolver um sistema em Java capaz de gerenciar o cadastro de jogadores, atribuindo a cada um deles um codinome retirado das listas "Os Vingadores" e "A Liga da Justiça". O sistema deve permitir o cadastro de jogadores com nome, e-mail e telefone, persistir essas informações em um banco de dados em memória e garantir que não haja repetição de codinomes, a menos que seja para listas diferentes.

## Funcionalidades
Cadastro de jogadores com nome, e-mail e telefone
Persistência das informações em um banco de dados em memória (por exemplo, HSQLDB ou arquivo)
Obtenção da lista de todos os jogadores cadastrados com seus respectivos codinomes e informações sobre a lista de origem
Impedimento de utilização do mesmo codinome para diferentes usuários, a menos que seja para listas diferentes
Inclusão do codinome escolhido dentro das listas "Os Vingadores" ou "A Liga da Justiça"

## Tecnologias Utilizadas
Linguagem de Programação: Java
Ferramentas: Spring Boot, Hibernate

## Como Executar o Projeto

Certifique-se de ter o Java JDK e o Maven instalados em sua máquina. Clone este repositório em seu ambiente local. Navegue até o diretório do projeto e execute o seguinte comando para compilar o código e iniciar o servidor: bash Copy code mvn spring-boot:run Após a inicialização bem-sucedida, você pode acessar a API localmente em localhost:8080/players.

Contribuição
Contribuições são sempre bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novas funcionalidades.
