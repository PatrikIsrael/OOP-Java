# OOP-Java
# 💻 Fundamentos de OOP com Java

[![Licença MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)

Repositório de estudos sobre Programação Orientada a Objetos (OOP) utilizando Java. Contém exemplos práticos, anotações teóricas e implementações de padrões de projeto.

## 🧠 Conteúdo Abordado

### Princípios Básicos
- [x] Encapsulamento
- [x] Herança
- [x] Polimorfismo
- [x] Abstração

### Tópicos Intermediários
- [x] Interfaces
- [x] Generics
- [x] Lambdas e Streams
- [x] Collections API

### Padrões de Projeto
- [ ] Singleton
- [ ] Factory Method
- [ ] Strategy
- [ ] Observer

### Projeto Sistema Biblioteca 
## 📚 Sistema de Biblioteca (Exemplo Prático)

### Estrutura do Projeto

src/
├── dados/
│ └── DadosMockados.java
└── entidades/
├── Livro.java
├── Usuario.java
└── Biblioteca.java

### Funcionalidades Implementadas
- ✔️ Cadastro automático de livros e usuários
- ✔️ Sistema de empréstimo e devolução
- ✔️ Consulta de disponibilidade
- ✔️ Listagem completa com filtros
- ✔️ Validações de negócio

### Como Executar
```bash
git clone https://github.com/seu-usuario/OOP-Java.git
cd OOP-Java
javac -d bin src/entidades/*.java src/dados/*.java
java -cp bin entidades.Main

