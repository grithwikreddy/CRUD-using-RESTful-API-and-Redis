# Chat Application with Spring Boot and Redis

## Overview
This project is a Spring Boot-based RESTful API that implements a message storage application using Redis as the primary database. The application provides chat message storage and retrieval while ensuring high performance through Redis caching. It supports multiple message-related functionalities, including message history retrieval and updating stored messages.

## Features
- **RESTful API** for managing messages.
- **Spring Boot & Redis** for efficient data storage and retrieval.
- **Session Scope Controller** for managing user interactions.

## Tech Stack
- **Backend**: Spring Boot
- **Database**: Redis
- **Tools**: Spring Data Redis, REST API. Postman

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- Java 17+
- Redis Server
- Maven
- Postman

### Steps to Run the Project
1. **Clone the Repository**
   ```sh
   git clone https://github.com/grithwikreddy/CRUD-using-RESTful-API-and-Redis.git
   cd CRUD-using-RESTful-API-and-Redis
   ```

2. **Run Redis Server**
   ```sh
   redis-server
   ```

3. **Build and Run the Application**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints
| Method | Endpoint            | Description                     |
|--------|--------------------|---------------------------------|
| GET    | /api/history       | Get chat message history       |
| POST   | /api/storeMessage  | Store a chat message           |
| PUT    | /api/change/{id}   | Modify a stored message        |

