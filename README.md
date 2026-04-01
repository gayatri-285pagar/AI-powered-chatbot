# 🤖 AI-Powered Chatbot

A full-stack AI chatbot built using Java Spring Boot with a modern interactive UI.
This application allows users to chat with an AI model and get instant responses.

---

## 🚀 Features

* 💬 Real-time chat interface (WhatsApp-style UI)
* 🤖 AI-powered responses using OpenAI API
* 🌐 REST API backend using Spring Boot
* 🎨 Clean and responsive frontend (HTML, CSS, JavaScript)
* ⚡ Fast and lightweight application
* 🔐 Secure API key handling (not exposed in code)

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* REST APIs

### Frontend

* HTML
* CSS
* JavaScript

### Tools & Platforms

* Git & GitHub
* IntelliJ IDEA
* Postman (for API testing)

---

## 📂 Project Structure

```
AI-powered-chatbot/
│
├── src/main/java/com/example/AI_powered/chatbot/
│   ├── controller/       # REST Controllers
│   ├── service/          # Business Logic
│   ├── model/            # Request & Response Models
│
├── src/main/resources/
│   ├── static/           # Frontend (HTML, CSS, JS)
│   ├── application.properties
│
├── pom.xml               # Maven dependencies
└── README.md
```

---

## ⚙️ How to Run Locally

### 1️⃣ Clone the repository

```
git clone https://github.com/gayatri-285pagar/AI-powered-chatbot.git
cd AI-powered-chatbot
```

---

### 2️⃣ Add your OpenAI API Key

Open:

```
src/main/resources/application.properties
```

Add:

```
openai.api.key=YOUR_API_KEY
```

⚠️ Do NOT push your real API key to GitHub

---

### 3️⃣ Run the application

Using IntelliJ:

* Open project
* Run `AiPoweredChatbotApplication.java`

OR using terminal:

```
mvn spring-boot:run
```

---

### 4️⃣ Open in browser

```
http://localhost:8080
```

---

## 📸 Screenshots (Optional)

*Add your UI screenshots here*

---

## 🔒 Security Note

* API keys are not stored in the repository
* Use environment variables or local configuration for sensitive data

---

## 🚀 Future Enhancements

* 💾 Save chat history using database (MySQL)
* 🔐 User authentication (Login/Register)
* 🌐 Deploy application online
* 🎨 UI improvements (Dark mode, animations)
* 🧠 Context-aware AI conversations

---

## 🙌 Acknowledgements

* OpenAI API for AI capabilities
* Spring Boot for backend framework

---

## 👩‍💻 Author

**Gayatri Pagar**
GitHub: https://github.com/gayatri-285pagar

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and share it!
