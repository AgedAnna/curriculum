<h1>Currículo API - Spring Boot + PostgreSQL</h1>

<h2>Descrição</h2>
<p>
  Este projeto é uma API REST desenvolvida com <strong>Spring Boot</strong> e <strong>PostgreSQL</strong>, com o objetivo de fornecer um backend para um aplicativo de gerenciamento de currículos. A API permite que você crie, atualize, visualize e exclua informações relevantes para um currículo, incluindo dados pessoais, experiências profissionais, educação e habilidades.
</p>

<h2>Funcionalidades</h2>
<ul>
  <li><strong>CRUD de Dados Pessoais:</strong> Gerencie informações básicas como nome, email, telefone, endereço, etc.</li>
  <li><strong>CRUD de Experiências Profissionais:</strong> Insira detalhes de suas experiências de trabalho, incluindo cargos, empresas, datas de início e término, e descrições das atividades.</li>
  <li><strong>CRUD de Educação:</strong> Adicione e gerencie seus registros educacionais, como cursos, instituições e anos de conclusão.</li>
  <li><strong>CRUD de Habilidades:</strong> Registre e atualize suas competências, como linguagens de programação, ferramentas e habilidades pessoais.</li>
</ul>

<h2>Estrutura do Projeto</h2>
<p>
  A aplicação é estruturada com base nas entidades e relacionamentos comuns a um currículo. As principais entidades e seus relacionamentos estão descritos a seguir:
</p>

<h3>Entidades</h3>
<ul>
  <li><strong>Pessoa:</strong> Contém informações pessoais do usuário, como nome, data de nascimento, email, telefone, etc.</li>
  <li><strong>Experiência Profissional:</strong> Descreve os empregos e projetos nos quais o usuário trabalhou.</li>
  <li><strong>Educação:</strong> Armazena dados relacionados à formação acadêmica do usuário.</li>
  <li><strong>Habilidades:</strong> Representa as competências que o usuário possui, incluindo tanto hard skills quanto soft skills.</li>
</ul>

<h3>Relacionamentos</h3>
<ul>
  <li>Uma <strong>Pessoa</strong> pode ter várias <strong>Experiências Profissionais</strong>.</li>
  <li>Uma <strong>Pessoa</strong> pode ter várias <strong>Educações</strong>.</li>
  <li>Uma <strong>Pessoa</strong> pode possuir várias <strong>Habilidades</strong>.</li>
</ul>

<h2>Tecnologias Utilizadas</h2>
<ul>
  <li><strong>Java 17</strong></li>
  <li><strong>Spring Boot 3.x</strong>
    <ul>
      <li>Spring Data JPA</li>
      <li>Spring Web</li>
      <li>Spring Validation</li>
    </ul>
  </li>
  <li><strong>PostgreSQL</strong> como banco de dados relacional</li>
  <li><strong>Hibernate</strong> como ORM (Object-Relational Mapping)</li>
  <li><strong>Maven</strong> como ferramenta de build e gerenciamento de dependências</li>
  <li><strong>Postman</strong> ou <strong>Insomnia</strong> para testar a API</li>
</ul>

<h2>Configuração do Ambiente</h2>

<h3>Pré-requisitos</h3>
<ul>
  <li><strong>Java 17</strong> ou superior</li>
  <li><strong>PostgreSQL</strong> instalado e rodando localmente ou via Docker</li>
  <li><strong>Maven</strong></li>
</ul>

<h3>Passos para rodar o projeto localmente</h3>
<ol>
  <li>Clone o repositório:
    <pre><code>git clone https://github.com/AgedAnna/curriculum
cd curriculum
    </code></pre>
  </li>
  <li>Crie um banco de dados no PostgreSQL:
    <pre><code>CREATE DATABASE curriculo_db;</code></pre>
  </li>
  <li>Configure as credenciais do banco de dados no arquivo <code>application.properties</code>:
    <pre><code>spring.datasource.url=jdbc:postgresql://localhost:5432/curriculo_db
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
    </code></pre>
  </li>
  <li>Rode a aplicação:
    <pre><code>mvn spring-boot:run</code></pre>
  </li>
  <li>A API estará disponível em <code>http://localhost:8080</code>.</li>
</ol>

<h3>Endpoints</h3>
<ul>
  <li><strong>GET</strong> <code>/api/curriculos</code>: Lista todas as pessoas.</li>
  <li><strong>POST</strong> <code>/api/curriculos</code>: Cria uma nova pessoa.</li>
  <li><strong>PUT</strong> <code>/api/curriculos/{id}</code>: Atualiza uma pessoa existente.</li>
  <li><strong>DELETE</strong> <code>/api/curriculos/{id}</code>: Exclui uma pessoa.</li>
</ul>
<p>Exemplos similares para <strong>experiências profissionais</strong>, <strong>educações</strong> e <strong>habilidades</strong>.</p>

<h2>Estrutura de Pastas</h2>
<pre><code>src/
└── main/
    ├── java/
    │   └── com/seu-usuario/curriculoapi/
    │       ├── controller/
    │       ├── model/
    │       ├── repository/
    │       └── service/
    └── resources/
        ├── application.properties
</code></pre>

<h2>Melhorias Futuras</h2>
<ul>
  <li>Implementação de autenticação com Spring Security e JWT.</li>
  <li>Adição de uploads de documentos para anexar certificados ou cartas de recomendação.</li>
  <li>Criação de funcionalidades de busca por habilidades e experiências.</li>
</ul>

<h2>Contribuição</h2>
<p>
  Sinta-se à vontade para abrir issues ou enviar pull requests com sugestões de melhorias ou correções.
</p>
