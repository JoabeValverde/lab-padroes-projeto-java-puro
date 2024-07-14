

# Explorando Padrões de Projetos na Prática com Java

### <span style="color: #007acc;">UML DO PROJETO</span>
![img_1.png](src/imgs/UML%20lab%20Padrao%20do%20Projeto.jpg)
## Estrutura do Projeto

O projeto está organizado da seguinte forma:

* **one.digitalinnovation.gof.facade**: Contém a classe `Facade`, que é a fachada responsável por simplificar o processo de migração de um cliente para o sistema de CRM. Ela utiliza as classes `CepApi` e `CrmService` do subsistema.
* **one.digitalinnovation.gof.singleton**: Contém as classes relacionadas à implementação do padrão Singleton. São elas:
    * `SingletonEager`: Implementa o Singleton "Apressado", onde a instância é criada no momento da inicialização da classe.
    * `SingletonLazy`: Implementa o Singleton "Preguiçoso", onde a instância é criada somente quando solicitada pela primeira vez.
    * `SingletonLazyHolder`: Implementa o Singleton "Lazy Holder", onde a instância é criada apenas quando necessária, usando uma classe interna estática.
* **one.digitalinnovation.gof.strategy**: Contém as classes relacionadas à implementação do padrão Strategy. São elas:
    * `Comportamento`: Interface que define o comportamento.
    * `ComportamentoAgressivo`, `ComportamentoDefensivo`, `ComportamentoNormal`: Implementações concretas do comportamento.
    * `Robo`: Classe que possui um comportamento e permite alterá-lo em tempo de execução.
* **one.digitalinnovation.gof.subsistema**: Contém a classe `CrmService`, responsável por gravar um cliente no sistema de CRM.
* **one.digitalinnovation.gof.subsistema2**: Contém a classe `CepApi`, que simula uma API de consulta de CEP e fornece informações sobre a cidade e o estado associados a um determinado CEP.
* **Test**: Classe que contém o método `main` que exemplifica o uso dos padrões Singleton, Strategy e Facade com os exemplos apresentados.

## Padrões de Projeto

### <span style="color: #007acc;">Singleton</span>

O padrão Singleton é utilizado nas classes `SingletonEager`, `SingletonLazy` e `SingletonLazyHolder`. Ele garante que somente uma instância da classe seja criada e fornece um ponto global de acesso a essa instância.

* `SingletonEager`: Utiliza a estratégia "Apressada", criando a instância no momento da inicialização da classe.
* `SingletonLazy`: Utiliza a estratégia "Preguiçosa", criando a instância somente quando é solicitada pela primeira vez.
* `SingletonLazyHolder`: Utiliza a estratégia "Lazy Holder", onde a instância é criada apenas quando necessária, por meio de uma classe interna estática.

### <span style="color: #d9534f;">Strategy</span>

O padrão Strategy é utilizado nas classes relacionadas ao comportamento do robô. A interface `Comportamento` define o contrato para diferentes comportamentos. As classes `ComportamentoAgressivo`, `ComportamentoDefensivo`, `ComportamentoNormal` e `ComportamentoRapido` são as implementações concretas desse contrato. A classe `Robo` possui uma referência a um objeto de comportamento e permite alterar esse comportamento em tempo de execução.

### <span style="color: #5cb85c;">Facade</span>

O padrão Facade é utilizado na classe `Facade`, que fornece uma interface simplificada para o subsistema complexo formado pelas classes `CepApi` e `CrmService`. O método `migrarCliente` da classe `Facade` recebe o nome e o CEP de um cliente, utiliza a `CepApi` para recuperar a cidade e o estado associados ao CEP e, em seguida, utiliza o `CrmService` para gravar o cliente no sistema de CRM.

## Execução

Para executar o projeto, basta executar o método `main` na classe `Test`. Ele irá imprimir no console a utilização dos padrões de projeto Singleton, Strategy e Facade com os exemplos apresentados.


