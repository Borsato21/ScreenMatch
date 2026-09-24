<div align="center">

# 🎬 ScreenMatch

### Filmes, séries e Java: orientação a objetos na prática.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/Orientação_a_Objetos-6C63FF?style=for-the-badge)
![Console](https://img.shields.io/badge/Aplicação-Console-152238?style=for-the-badge)

Um projeto de estudos que usa o universo do cinema e das séries para explorar classes, herança, polimorfismo e interfaces.

[Sobre](#-sobre-o-projeto) • [Funcionalidades](#-funcionalidades) • [Execução](#-como-executar) • [Aprendizados](#-conceitos-praticados)

</div>

---

## 🍿 Sobre o projeto

O **ScreenMatch** é uma aplicação Java executada no console que representa filmes, séries e episódios. A proposta é praticar a organização de um sistema orientado a objetos, compartilhando comportamentos entre classes e definindo regras de avaliação, duração e recomendação.

A classe `Principal` reúne uma demonstração com dados definidos no próprio código: cria títulos, registra notas, calcula o tempo de uma maratona e exibe recomendações.

> **Escopo atual:** demonstração em memória, sem menu interativo, interface gráfica, banco de dados ou integração com APIs.

## ✨ Funcionalidades

- 🎞️ **Representação de títulos:** nome, ano de lançamento, duração e indicação de inclusão no plano.
- ⭐ **Avaliações:** registro de notas, contagem de avaliações e cálculo da média.
- 📺 **Séries:** configuração de temporadas, episódios por temporada e minutos por episódio.
- ⏱️ **Tempo de maratona:** soma da duração de filmes e séries.
- 🎯 **Recomendações:** mensagens baseadas na classificação de filmes e episódios.
- 🧩 **Episódios:** associação a uma série e classificação conforme o total de visualizações.

## 🧠 Conceitos praticados

| Conceito | Aplicação no projeto |
| --- | --- |
| Encapsulamento | Atributos privados e acesso por métodos públicos. |
| Herança | `Filme` e `Serie` estendem `Titulo`. |
| Polimorfismo | `CalculadoraDeTempo` recebe um `Titulo` e calcula a duração conforme o objeto informado. |
| Sobrescrita | `Serie` redefine `getDuracaoEmMinutos()`. |
| Interfaces | `Classificavel` define o contrato usado por filmes e episódios. |
| Associação | Cada `Episodio` pode referenciar uma `Serie`. |
| Organização em pacotes | Separação entre modelos e classes de cálculo. |

## 🛠️ Tecnologias

- **Java** — linguagem utilizada em toda a aplicação.
- **IntelliJ IDEA** — o repositório inclui arquivos de configuração da IDE.
- **Git e GitHub** — versionamento e hospedagem do código.

O projeto utiliza a biblioteca padrão do Java, sem dependências externas e sem configuração de Maven ou Gradle.

## 📂 Organização do código

| Local em `src/` | Responsabilidade |
| --- | --- |
| `Principal.java` | Ponto de entrada e demonstração dos recursos. |
| `br/com/alura/screenmatch/modelos/Titulo.java` | Dados comuns, ficha técnica e avaliações. |
| `br/com/alura/screenmatch/modelos/Filme.java` | Modelo de filme, diretor e classificação. |
| `br/com/alura/screenmatch/modelos/Serie.java` | Modelo de série e cálculo da duração total. |
| `br/com/alura/screenmatch/modelos/Episodio.java` | Modelo de episódio e classificação por visualizações. |
| `br/com/alura/screenmatch/calculos/CalculadoraDeTempo.java` | Acúmulo da duração dos títulos. |
| `br/com/alura/screenmatch/calculos/Classificavel.java` | Interface com o método `getClassificacao()`. |
| `br/com/alura/screenmatch/calculos/FiltroRecomendacao.java` | Exibição de recomendações conforme a classificação. |

## 🚀 Como executar

### Pré-requisitos

- **JDK instalado**, com os comandos `java` e `javac` disponíveis no terminal.
- **Git** para clonar o repositório.
- **IntelliJ IDEA**, caso prefira executar pela IDE.

> A configuração do IntelliJ presente no repositório aponta para o **JDK 25**. Use essa versão para reproduzir a configuração do projeto; isso não significa que o código exija recursos exclusivos dela.

### 1. Clone o repositório

```bash
git clone https://github.com/Borsato21/ScreenMatch.git
cd ScreenMatch
```

### 2. Execute pelo IntelliJ IDEA

1. Abra a pasta `ScreenMatch` na IDE.
2. Em **File → Project Structure → Project**, configure o SDK do projeto.
3. Abra `src/Principal.java`.
4. Execute o método `main` pelo botão de execução ao lado da classe.
5. Acompanhe os resultados no console.

### Alternativa: execute pelo terminal

Na pasta raiz do projeto, compile e execute:

```bash
javac -encoding UTF-8 -d out -sourcepath src src/Principal.java
java -cp out Principal
```

O primeiro comando compila a classe principal e as classes necessárias para a pasta `out`. O segundo inicia a demonstração.

## 🔎 O que a demonstração calcula?

Com os valores definidos em `Principal.java`:

| Cálculo | Resultado |
| --- | --- |
| Média das notas `8`, `5` e `10` | Aproximadamente `7,67` |
| Duração de Lost: `10 × 10 × 50` | `5.000 minutos` |
| Duração conjunta: `180 + 220 + 5.000` | `5.400 minutos`, equivalentes a `90 horas` |
| Classificação do filme avaliado | `3` |
| Classificação do episódio com `300` visualizações | `4` |

Os dados dos títulos são exemplos de estudo definidos no código, e não um catálogo com informações oficiais das obras.

### Regras de recomendação

A classificação dos filmes é calculada com `(int) pegaMedia() / 2`. Para episódios, mais de `100` visualizações gera classificação `4`; nos demais casos, a classificação é `2`.

| Classificação | Mensagem exibida |
| --- | --- |
| Maior ou igual a `4` | Está entre os preferidos do momento |
| Maior ou igual a `2` e menor que `4` | Muito bem avaliado no momento! |
| Menor que `2` | Coloque na sua lista para assistir depois |

## 🌱 Possíveis próximos passos

Ideias para evoluir o projeto — ainda não implementadas:

- [ ] Criar um menu para cadastrar e consultar títulos pelo console.
- [ ] Organizar o catálogo com coleções, como `ArrayList`.
- [ ] Validar notas e tratar títulos sem avaliações.
- [ ] Ajustar a ficha técnica para apresentar a duração calculada das séries.
- [ ] Adicionar testes automatizados para as regras de cálculo.
- [ ] Explorar persistência de dados e consulta a uma API de filmes.

## 👨‍💻 Autor

Desenvolvido por **Vítor Borsato**.

[![GitHub](https://img.shields.io/badge/GitHub-Borsato21-181717?style=for-the-badge&logo=github)](https://github.com/Borsato21)

---

<div align="center">

<sub>🎬 Um projeto para transformar conceitos de Java em prática.</sub>

</div>
