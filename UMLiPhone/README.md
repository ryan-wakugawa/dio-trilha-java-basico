# Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet
Desafio de código cujo obejtivo é criar um diagrama UML com base nas funcionalidades do primeiro modelo iPhone.
As classes criadas nesse projeto foram feitas com o intuito de ilustras as funcionalidades, portanto elas não realizam tarefas reais, imprimindo apenas descrições do que os métodos fariam caso fossem empregadas em um ambiente verdadeiro.
## Diagrama UML (Mermaid)
``` mermaid
classDiagram
    direction BT
    IPhone o-- Musicas
    IPhone o-- Telefone
    IPhone o-- Navegador

    class IPhone{
        -boolean tocando
        -String musicaSelecionada
        -Scanner scanner = new Scanner(System.in)
        -String paginaSelecionada
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class Musicas{
        <<Interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }
    class Telefone{
        <<Interface>>
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
    }
    class Navegador{
        <<Interface>>
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }
```
