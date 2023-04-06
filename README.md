
# API Rest de Agenda Telefônica

Esta API Rest foi desenvolvida utilizando o framework Spring Boot, com o objetivo de fornecer um serviço de agenda telefônica online. A API permite que os usuários criem, atualizem, excluam e consultem contatos na agenda telefônica.

## Métodos do Controller

O controller da API possui os seguintes métodos:

### 1. Listar contatos

**Método:** GET

**Endpoint:** /contatos

**Descrição:** Retorna uma lista de todos os contatos cadastrados na agenda telefônica.

**Parâmetros:**

Nenhum.

**Respostas:**

-   **200 OK:** Retorna a lista de contatos cadastrados.
-   **404 Not Found:** Retorna uma mensagem informando que não há contatos cadastrados na agenda.

### 2. Buscar contato por id

**Método:** GET

**Endpoint:** /contatos/{id}

**Descrição:** Retorna o contato correspondente ao id informado.

**Parâmetros:**

-   **id:** Identificador único do contato a ser buscado.

**Respostas:**

-   **200 OK:** Retorna o contato correspondente ao id informado.
-   **404 Not Found:** Retorna uma mensagem informando que o contato não foi encontrado na agenda.

### 3. Criar contato

**Método:** POST

**Endpoint:** /contatos

**Descrição:** Cria um novo contato na agenda telefônica.

**Parâmetros:**

-   **nome:** Nome do contato. (obrigatório)
-   **email:** Endereço de e-mail do contato. (obrigatório)
-   **telefone:** Número de telefone do contato. 


**Respostas:**

-   **201 Created:** Retorna o contato recém-criado com o seu id.
-   **400 Bad Request:** Retorna uma mensagem de erro informando que os parâmetros obrigatórios não foram informados.

### 4. Atualizar contato

**Método:** PUT

**Endpoint:** /contatos/{id}

**Descrição:** Atualiza os dados de um contato na agenda telefônica.

**Parâmetros:**

-   **id:** Identificador único do contato a ser atualizado. (obrigatório)
-   **nome:** Novo nome do contato.
-   **email:** Novo endereço de e-mail do contato.

**Respostas:**

-   **200 OK:** Retorna o contato atualizado.
-   **400 Bad Request:** Retorna uma mensagem de erro informando que o id do contato não foi informado.
-   **404 Not Found:** Retorna uma mensagem informando que o contato não foi encontrado na agenda.

### 5. Excluir contato

**Método:** DELETE

**Endpoint:** /contatos/{id}

**Descrição:** Exclui um contato da agenda telefônica.

**Parâmetros:**

-   **id:** Identificador único do contato a ser excluído. (obrigatório)

**Respostas:**

-   **204 No Content:** Retorna uma mensagem informando que o contato foi excluído com sucesso.
-   **400 Bad Request:** Retorna uma mensagem de erro informando que o id do contato não foi informado.
-   **404 Not Found:** Retorna uma mensagem informando que o contato não foi encontrado na agenda.
