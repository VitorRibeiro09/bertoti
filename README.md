<div align="center">

#  Projeto BERTOTI — Engenharia de Software  

📘 **Baseado no livro:**  
**_Software Engineering at Google_ (O’Reilly)**  

</div>

---

## 🧠 Atividades 1 a 4 — Conceitos de Engenharia de Software  

A **engenharia de software** compartilha os mesmos princípios das demais engenharias: é preciso **planejar, projetar, analisar e executar**.  
Porém, diferentemente das outras, ela é **intangível** — o produto final é apenas a **ponta do iceberg**.

Há **inúmeras maneiras** de construir um software: diversas linguagens, bancos de dados, frameworks e arquiteturas podem ser combinados de infinitas formas.  
Por isso, projetar um sistema eficiente exige **boas decisões arquiteturais**, priorizando **escalabilidade, manutenção e fluidez**.

Como em toda engenharia, o desenvolvimento de software envolve **trade-offs** — decisões onde se ganha de um lado e se perde de outro.  
Raramente há soluções perfeitas, apenas **equilíbrios estratégicos**.

### ⚖️ Exemplos de Trade-offs

| Aspecto | Opção 1 | Opção 2 |
|----------|----------|----------|
| Escalabilidade | Alta | Simplicidade |
| Banco de Dados | SQL | NoSQL |
| Armazenamento | Custo menor | Desempenho maior |

---

## 💻 Programa de Controle de Estoque  

Um sistema simples de **gerenciamento de estoque** desenvolvido em **Java**, aplicando conceitos de orientação a objetos.

### 🧩 Classes Principais  

#### 📦 Classe `Estoque`  
<img src="https://github.com/user-attachments/assets/f3a88a49-7901-4500-809c-7d401418d8c7" width="450"/>

#### 🛒 Classe `Produto`  
<img src="https://github.com/user-attachments/assets/675143e4-44b9-4465-a058-3a24ce4ccb8b" width="350"/>

#### 🧪 Classe `Teste`  
<img src="https://github.com/user-attachments/assets/72e235a0-e3a8-4c72-93b3-b294797e2c8f" width="500"/>

---

## 🧩 Atividade 5 — Diagrama UML  

<img width="794" height="351" alt="image" src="https://github.com/user-attachments/assets/910c2d8f-7132-4669-9499-11c4c8d964f9" />

---

## 🎨 Atividade 7 — Interface Gráfica (JavaFX)  

O sistema foi aprimorado com uma **interface JavaFX**, estruturada com o padrão **MVC (Model-View-Controller)** e conectada ao banco de dados.

#### 🚀 Launcher  
<img src="https://github.com/user-attachments/assets/b6c59b1c-110e-42ec-9c9a-2e6b4e04177e" width="900"/>

#### 🪟 Carregador da Tela (FXML Loader)  
<img src="https://github.com/user-attachments/assets/2c425b46-8f2a-461b-974d-326f577f105f" width="900"/>

#### 🎮 Controller da Interface  
<img src="https://github.com/user-attachments/assets/641c1485-c69a-4da2-ba5f-67caf01a6952" width="900"/>
<img src="https://github.com/user-attachments/assets/e56e9d53-430b-4f8e-a229-fc1c54a73a61" width="900"/>

---

## 🗄️ Banco de Dados  

O projeto utiliza um **banco de dados relacional (SQL)** para persistência das informações do estoque.  

<img src="https://github.com/user-attachments/assets/e9b656e2-8ffd-4a86-b8ba-27e9eae5b8f2" width="900"/>
<img src="https://github.com/user-attachments/assets/66fc8d35-e263-4506-bc47-a300dabfcdde" width="900"/>
<img src="https://github.com/user-attachments/assets/de48f593-3864-4e47-925f-f498f07a922b" width="900"/>
<img src="https://github.com/user-attachments/assets/f68fd2d1-f0b3-46be-a9f2-2dcb65e555df" width="900"/>

---

## 🤖 Atividade 8 — Integração com Ollama (IA Local)  

Exploração do uso do **Ollama**, uma ferramenta de **inteligência artificial local**, para apoiar o aprendizado e gerar ideias sobre engenharia de software.  

<img src="https://github.com/user-attachments/assets/e1f79052-1f7b-4c27-b8e8-473436ff82f3" width="900"/>

---

## ⚙️ Como Executar o Projeto  

### 💻 Requisitos  

- ☕ **Java 17+**  
- 🧱 **JavaFX SDK**  
- 🗄️ **MySQL** (ou outro banco relacional configurado no código)  
- 🧰 **IDE:** IntelliJ IDEA / Eclipse / VS Code  

### ▶️ Passo a Passo  

```bash
# Clone o repositório
git clone https://github.com/SEU-USUARIO/bertoti.git
cd bertoti

# Configure o banco de dados conforme mostrado nas imagens

# Execute o projeto
# (Rode a classe Launcher.java dentro da IDE)
