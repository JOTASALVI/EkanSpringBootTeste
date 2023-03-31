# EkanSpringBootTeste
Aplicação desenvolvida em SpringBoot utilizando banco em memoria H2, duas tabelas relacionais 1 pra N, Beneficiario e Documento.
Para testar os servicos basta startar o projeto, ele cria as tabelas automaticamente apos o start da app acessar o swagger para testar os servicos disponiveis.

IMPORTANTE --> CLASSE PARA START DO PROJETO (ApiEkanH2Application.java)

- Cadastrar um beneficiário junto com seus documentos;
- Listar todos os beneficiários cadastrados;
- Listar todos os documentos de um beneficiário a partir de seu id;
- Atualizar os dados cadastrais de um beneficiário;
- Remover um beneficiário.

SWAGGER
http://localhost:8080/swagger-ui/index.html

Banco H2
http://localhost:8080/h2

