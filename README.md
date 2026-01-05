# 💬 SocketChat – Real-Time Chat Application

SocketChat is a real-time web-based chat application developed using **Spring Boot WebSocket**.  
It allows **two or more users** to chat simultaneously by opening the same hosted link.

The frontend is built using **HTML, CSS, and JavaScript** and is served from Spring Boot’s `static` resources.  
The application is **Dockerized** and deployed on **Render**.

---

## 🚀 Features

- 🔴 Real-time messaging using WebSocket
- 👥 Multiple users can chat simultaneously
- 🌐 Simple and responsive UI (HTML, CSS, JS)
- 🐳 Dockerized for easy deployment
- ☁️ Hosted on Render
- ⚡ Lightweight and fast once loaded

---
## 🧠 How It Works
- WebSocket establishes a persistent connection between client and server
- Messages are broadcast to all connected users
- Frontend communicates using WebSocket API in JavaScript
- Spring Boot handles message routing and session management
  
---
## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring WebSocket

### Frontend
- HTML
- CSS
- JavaScript

### DevOps / Deployment
- Docker
- Render Cloud Platform

---

## 🌍 Live Demo

🔗 **Deployed URL: **  
https://socket-chat-pwla.onrender.com 
> _(Render may take **10–15 minutes** to start if the app is idle)_  


⚠️ **Note:** Render spins down inactive services, so the **first load may be slow**.

---

## 🐳 Docker Setup

### Build Docker Image
```bash
docker build -t socketchat 
```

### Run Container
```bash
docker run -p 8080:8080 socketchat 
```

---

## ▶️ How to Run Locally

### Clone the repository
```bash
git clone https://github.com/your-username/SocketChat.git
```

### Navigate to the project
```bash
cd SocketChat
```

### Run Spring Boot application
```bash
mvn spring-boot:run
```

### Open browser
```bash
http://localhost:8080
```
