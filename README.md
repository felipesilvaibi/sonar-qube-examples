# SonarQube Examples

Este projeto demonstra o uso do SonarQube para análise de qualidade de código em projetos Java. Aqui você encontrará todos os passos necessários para configurar o ambiente e executar análises com o SonarQube via SonarCloud.

## Pré-requisitos e Configuração

### 1. Java JDK

*   **Download e Instalação:** Baixe e instale o Java JDK 17 LTS (Azul Zulu: 17.52.17) do [site oficial da Azul](https://www.azul.com/downloads/?package=jdk#zulu).

*   **Verificação:** Após a instalação, verifique se o JDK foi instalado corretamente executando o comando:

    ```
    java -version

    ```

    Confira se a versão instalada é a 17.52.17.

### 2. Apache Maven

*   **Download e Instalação:** Baixe e instale o Apache Maven 3.6.3.

*   **Verificação:** Para confirmar se o Maven foi instalado corretamente, execute:

    ```
    mvn -version

    ```

    A versão do Maven deve ser a 3.6.3.

### 3. Git

*   **Instalação:** Instale o Git em sua máquina.

*   **Tutoriais:** Para ajudar na utilização do Git, assista aos vídeos:

    *   [GitHub Básico em 30 Minutos](https://www.youtube.com/watch?v=Zwv9qRyVeU4)

    *   [Como Criar um Novo Pull Request no GitHub](https://www.youtube.com/watch?v=RNbKd8cD0LI)

## Funcionamento do SonarQube

SonarQube analisa o código-fonte para detectar problemas de qualidade e segurança. O resultado é um relatório detalhado que pode ser acessado através do [SonarCloud](https://sonarcloud.io/project/overview?id=felipesilvaibi_sonar-qube-examples).

**Gatilho das Análises:**

*   As análises são automaticamente desencadeadas ao criar um Pull Request ou ao fazer um merge na branch `main`.

## Executando uma Nova Análise com SonarQube

Para executar uma nova análise:

1.  **Clone o Repositório:**

    ```
    git clone https://github.com/felipesilvaibi/sonar-qube-examples

    ```

2.  **Crie uma Nova Branch:**

    *   Faça uma alteração no código que introduza um problema identificável pelo SonarQube. Exemplos de problemas comuns podem ser encontrados [aqui](https://medium.com/javarevisited/common-occurred-sonarqube-issues-in-java-52c32545b108).

    *   Execute os seguintes comandos:

        ```
        git checkout main
        git pull
        git checkout -b feat/nome_da_alteracao
        git add .
        git commit -m "Descrição da alteração"
        git push -u origin feat/nome_da_alteracao

        ```

3.  **Crie um Pull Request:**

    *   Acesse [Pull Requests no GitHub](https://github.com/felipesilvaibi/sonar-qube-examples/pulls) e clique em 'New Pull Request'.

    *   Defina a comparação: `base: main <- compare: feat/nome_da_alteracao`.

    *   Crie o Pull Request.

Após a criação do Pull Request, o SonarCloud automaticamente reanalisará o código, e os resultados poderão ser visualizados no painel do SonarCloud.
