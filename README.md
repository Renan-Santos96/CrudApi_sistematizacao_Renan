# Sistematização POO - API REST

Trabalho de conclusão da matéria de programação orientada a objetos. Implementar um API REST para monitoramentos de dados dos funcionários de uma empresa, com informações como: nome, email, telefone e histórico médico para criação de um base de dados. Versão escolhida no edital foi Projeto B com funções além.


# Pré-requisitos

Ter instalado um JDK versão 17, Github configurado na máquina (para clonar esse repositório) e uma plataforma de API, recomendando o Postman e uma IDE a sua escolha, recomendando Intellij

## Como rodar a API

Clonar o repositório para sua maquina, abrindo o terminal e utilizando o comando git clone https://github.com/Renan-Santos96/CrudApi_sistematizacao_Renan.git ;
Abrir o repositório clonado e na IDE de sua preferência, se necessario confirma a instalação de dependências conforme intruções MAVEN contidas nesse projeto;
Rodar o programa, apertando a tecla PLAY verde de acordo com a sua IDE 

## Como utilizar a API

Abrir o software postman ou similar e colocar o endpoint de acordo com a funcionalidade desejada; 
GETALL-> recupera os dados de todos os funcionários, localhost:8080/api/funcionario
GET -> recupera um funcionário pela id, localhost:8080/api/funcionario/id
PUT -> altera os dados de um funcionário pela id, localhost:8080/api/funcionario/id, a solicitação deve incluir um JSON no seguinte formato, {"nome": "Carlos", "email": "carlos@email.com", "telefone": "61999998888", "informacoesMedicas": "diabético e hipertenso"};
POST -> insere um novo funcionário na base de dados com id auto incremental, localhost:8080/api/funcionario, a solicitação deve fazer uso de um JSON no seguinte modelo, {"nome": "Carlos", "email": "carlos@email.com", "telefone": "61999998888", "informacoesMedicas": "diabético e hipertenso"};
DELETE -> apaga um funcionário da base de dados, localhost:8080/api/funcionario/id;

**ATENÇÃO**: por se tratar de base de dados não persistente, ao iniciar o programa, não haverá nenhum funcionário cadastrado, sendo possível inclui-los usando o comando POST

