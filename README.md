# Lista de Logs

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://java.com)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Ativo-brightgreen.svg)](https://github.com/GabrielGit10110/data-structures-java)

Uma implementação em Java de uma lista circular para armazenamento e gerenciamento de logs em formato string.

## 📋 Descrição

Este projeto implementa uma lista circular duplamente encadeada para armazenar logs. A lista começa vazia e cresce até atingir um número máximo de elementos definido por `MAX_ELEMENTS`. Quando esse limite é alcançado, os novos logs começam a sobrescrever os mais antigos, mantendo sempre uma amostra dos logs mais recentes.

## ✨ Funcionalidades

- **Lista Circular**: Armazena logs em uma estrutura circular duplamente encadeada
- **Limite Configurável**: Define um número máximo de elementos (`MAX_ELEMENTS`)
- **Sobrescrita Automática**: Quando o limite é atingido, novos logs sobrescrevem os mais antigos
- **Leitura Segura**: Bloqueia adições durante a leitura dos logs
- **Saída Invertida**: Exibe os logs na ordem inversa da chegada (mais recentes primeiro)

## 🏗️ Estrutura do Projeto

```
├───.settings
├───bin
│   ├───controller
│   ├───model
│   │   ├───estrutura
│   │   └───negocio
│   └───view
└───src
    ├───controller
    │   └───TestList.java
    ├───model
    │   ├───estrutura
    │   │   └───LogNode.java
    │   └───negocio
    └───view
        └───LogList.java
```

## 📁 Classes

### LogNode
- **Localização**: `model/estrutura/LogNode.java`
- **Função**: Representa um nó da lista circular contendo:
  - String do log
  - Referências para o próximo e anterior nó

### LogList
- **Localização**: `controller/LogList.java`
- **Função**: Implementa a lógica da lista circular com métodos para:
  - Adicionar logs (`addLogs`)
  - Ler logs (`readLogs`)
  - Gerenciar o estado de bloqueio durante leitura

### TestList
- **Localização**: `controller/TestList.java`
- **Função**: Classe de testes para demonstrar o funcionamento da lista

### Main
- **Localização**: `view/LogList.java`
- **Função**: Ponto de entrada da aplicação

## 🚀 Como Usar

### Adicionando Logs
```java
LogList logList = new LogList(5); // MAX_ELEMENTS = 5
logList.addLogs("Log message 1");
logList.addLogs("Log message 2");
// ... continua adicionando
```

### Lendo Logs
```java
String logs = logList.readLogs();
System.out.println(logs);
```

## ⚙️ Características Técnicas

- **Thread-Safe**: Bloqueia adições durante a leitura
- **Eficiente**: O(1) para inserções após atingir a capacidade máxima
- **Ordenação Inversa**: Exibe logs do mais recente para o mais antigo
- **Circularidade**: Utiliza estrutura circular para otimização de memória

## 🎯 Exemplo de Uso

Ideal para sistemas que precisam manter uma amostra limitada dos logs mais recentes em ambientes com alto volume de registros.

---

## 📚 Documentação

A documentação completa da API com Javadoc está disponível em:  
🔗 **[GitHub Pages - DataStructures Documentation](https://gabrielgit10110.github.io/ListaDeLogs/)**

## 📝 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 👨‍💻 Autor

**Gabriel** - [GabrielGit10110](https://github.com/GabrielGit10110)

- GitHub: [@GabrielGit10110](https://github.com/GabrielGit10110)

## 🌟 Agradecimentos

- Inspirado nas minhas aulas de estruturas de dados da faculdade
- Comunidade Java por boas práticas

---

**⭐ Não esqueça de dar uma estrela no repositório se achou útil!**

---

<div align="center">
  
Feito com ❤️ e ☕ por Gabriel

[⬆ Voltar ao topo](#-estruturas-de-dados-em-java)

</div>
