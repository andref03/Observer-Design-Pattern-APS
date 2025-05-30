# Observer Design Pattern em Java

![Observer Pattern](https://github.com/user-attachments/assets/f78d2f0d-0832-4cb2-8f3f-334ccf53faaf)

> Exemplo didático de implementação do padrão Observer (publicação/assinatura) para notificação de eventos.

## 📖 Descrição
Este projeto demonstra como usar o padrão de projeto Observer em Java. Um `Editor` dispara eventos que são tratados por ouvintes (`NotificadorSMS`, `NotificadorEmail`, `NotificadorApp`). O `EventManager` gerencia o registro, remoção e notificação dos listeners.

## 🚀 Funcionalidades
- Registro e remoção dinâmica de listeners para diferentes tipos de eventos.
- Disparo de notificações simuladas, apresentando mensagens no console.
- Testes de uso em cenários variados (LinkedIn, Instagram, Twitter e eventos sem ouvintes).

## ⚙️ Pré-requisitos
- Java 17 ou superior instalado.
- Maven instalado (para compilação e execução via plugin).

## 🛠️ Como Rodar
1. Abra o terminal na raiz do projeto  
2. Compile e execute com Maven:
   ```bash
   mvn clean compile exec:java
   ```
   ou gere o jar e execute:
   ```bash
   mvn clean package
   java -jar target/notificacao-1.0-SNAPSHOT.jar
   ```

## 🎲 Como Usar
- O aplicativo já contém testes em `Testes.java`, invocados automaticamente no `Main`.  
- Saída esperada: console exibindo sequências de notificações simuladas.

## 🗂️ Estrutura de Arquivos
```
Observer-Design-Pattern-APS/
 ├ pom.xml
 ├ README.md
 └ src/
     └ main/
         └ java/
             └ br/edu/ifnmg/notificacao/
                 ├ Editor.java
                 ├ EventManager.java
                 ├ Main.java
                 ├ NotificacaoListener.java
                 ├ NotificadorApp.java
                 ├ NotificadorEmail.java
                 ├ NotificadorSMS.java
                 └ Testes.java
```
