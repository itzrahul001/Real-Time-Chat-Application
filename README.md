![Screenshot 2025-01-25 184610](https://github.com/user-attachments/assets/f6f29b5a-8e42-4f17-aedc-7d62b74d1915)

Project Description: Simple Real-Time Chat Application
This project is a Simple Real-Time Chat Application built using modern web technologies, designed to demonstrate real-time communication over WebSockets. The application allows users to exchange messages instantly through a responsive chat interface.

Key Features
Real-Time Messaging:

Messages are sent and received in real-time using the WebSocket protocol.
All connected users see the updated chat instantly.
Spring Boot Backend:

A robust backend powered by Spring Boot.
Implements WebSocket communication using Spring WebSocket and Spring Messaging.
STOMP Protocol:

Used for client-server messaging, enabling the chat functionality.
Supports topics (/topic) for broadcasting messages and application prefixes (/app) for handling client requests.
Frontend with Thymeleaf:

A simple UI powered by Thymeleaf, seamlessly integrated with the Spring Boot backend.
Modern UI Design:

Responsive and clean interface built using Bootstrap 5 for styling.
User-friendly design with input fields and a dynamic chat area.
JavaScript for Interactivity:

Implements WebSocket communication on the client-side using SockJS and STOMP.js.
Dynamically updates the chat window with new messages without page reloads.
Technologies Used
Backend:

Spring Boot for rapid application development.
Spring WebSocket for WebSocket configuration.
Spring Messaging for handling STOMP messages.
Frontend:

Thymeleaf for server-side rendering of HTML templates.
JavaScript for client-side interactivity.
SockJS and STOMP.js for WebSocket communication.
Bootstrap 5 for responsive and modern UI design.
Protocols:

WebSocket Protocol for full-duplex communication between client and server.
STOMP Protocol for message exchange over WebSockets.
How It Works
The user accesses the chat interface through a web browser.
When a message is typed and sent, the frontend sends the message via WebSocket to the server.
The backend receives the message and broadcasts it to all subscribers of a specific topic (/topic/messages).
All connected users receive the message instantly, which updates their chat window dynamically.
