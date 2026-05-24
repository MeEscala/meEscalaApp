# Diagrama de Classes - MeEscala

```mermaid
classDiagram
    class Usuario {
        +String id
        +String nome
        +String email
    }

    class Organizador {
        +criarPartida(detalhes) Partida
        +aprovarSolicitacao(SolicitacaoVaga) boolean
        +rejeitarSolicitacao(SolicitacaoVaga) boolean
    }

    class Atleta {
        +solicitarVaga(Partida, Posicao) SolicitacaoVaga
    }

    class Partida {
        +String id
        +String local
        +DateTime dataHora
        +int limiteJogadores
        +List~SolicitacaoVaga~ solicitacoes
        +obterConfirmados() List~Atleta~
        +isCheia() boolean
    }

    class SolicitacaoVaga {
        +String id
        +StatusSolicitacao status
        +Posicao posicaoEscolhida
        +boolean pagamentoConfirmado
        +processarPagamento()
    }
    
    %% Enumerações para padronizar os dados
    class StatusSolicitacao {
        <<enumeration>>
        PENDENTE
        APROVADA
        REJEITADA
    }

    class Posicao {
        <<enumeration>>
        GOLEIRO
        ZAGUEIRO
        MEIA
        ATACANTE
    }

    Usuario <|-- Organizador : Herda
    Usuario <|-- Atleta : Herda
    Partida "1" *-- "*" SolicitacaoVaga : recebe
    SolicitacaoVaga "*" --> "1" Atleta : feita por
    SolicitacaoVaga --> StatusSolicitacao : possui
    SolicitacaoVaga --> Posicao : define