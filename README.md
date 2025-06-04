# Spring Boot + HTML Registration & Login System

A full-stack web application that provides user registration and authentication functionality using Spring Boot backend and HTML/CSS/JavaScript frontend.

![Screenshot 2025-06-05 011026](https://github.com/user-attachments/assets/cfcae5c3-0f6d-4907-9cb4-98aad213c155)


## 🚀 Features

- **User Registration**: Complete signup form with user details
- **User Authentication**: Secure login system
- **Responsive Design**: Clean and modern UI with CSS styling
- **Database Integration**: MySQL database for user data persistence
- **RESTful API**: Backend API endpoints for registration and login
- **Cross-Origin Support**: CORS enabled for frontend-backend communication

## 🛠️ Tech Stack

### Backend
- **Spring Boot 3.3.3**
- **Spring Data JPA**
- **MySQL Database**
- **Maven**
- **Lombok**

### Frontend
- **HTML5**
- **CSS3**
- **Vanilla JavaScript**
- **Responsive Design**

## 📋 Prerequisites

- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.6 or higher
- Modern web browser

## 🔧 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/rKrishan99/springboot-html-css-registration-form.git
cd springboot-html-css-registration-form
```

### 2. Database Setup
1. Create a MySQL database:
```sql
CREATE DATABASE `exam-practice-auth-data`;
```

2. Update database credentials in `backend/demoApp/src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/exam-practice-auth-data?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your_password
```

### 3. Backend Setup
```bash
cd backend/demoApp
./mvnw clean install
./mvnw spring-boot:run
```

The backend server will start on `http://localhost:8080`

### 4. Frontend Setup
1. Navigate to the frontend directory:
```bash
cd frontend/app
```

2. Open `indexRegister.html` in your web browser to start with registration
3. Or open `indexLogin.html` for the login page

## 📚 API Endpoints

### Authentication Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| POST | `/api/signup` | User registration | User object |
| POST | `/api/signin` | User authentication | LoginRequest object |

### Request/Response Examples

#### Registration Request
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "1234567890",
  "gender": "male",
  "birthday": "1990-01-01",
  "password": "password123"
}
```

#### Login Request
```json
{
  "email": "john@example.com",
  "password": "password123"
}
```

## 🏗️ Project Structure

```
springboot-html-css-registration-form/
├── backend/
│   └── demoApp/
│       ├── src/main/java/org/example/demoapp/
│       │   ├── controller/UserController.java
│       │   ├── entity/User.java
│       │   ├── entity/LoginRequest.java
│       │   ├── repository/UserRepository.java
│       │   ├── service/UserService.java
│       │   └── DemoAppApplication.java
│       ├── src/main/resources/
│       │   └── application.properties
│       └── pom.xml
└── frontend/
    └── app/
        ├── indexRegister.html
        ├── indexLogin.html
        ├── styels.css
        ├── scriptRegister.js
        └── scriptLogin.js
```

## 🎨 Features Overview

### User Registration Form
- Full name input
- Email validation
- Phone number
- Gender selection (radio buttons)
- Birthday date picker
- Password field
- Form validation and submission

### User Login Form
- Email/username input
- Password field
- Authentication validation
- Success/error feedback

### Responsive Design
- Mobile-friendly interface
- Clean and modern styling
- Smooth transitions and hover effects
- Consistent color scheme

## 🔒 Security Features

- Password validation
- Email uniqueness checking
- CORS protection configured
- Input sanitization
- Error handling for invalid credentials

## 🚦 Usage

1. **Registration**: 
   - Navigate to the registration page
   - Fill in all required fields
   - Submit the form
   - Receive confirmation of successful registration

2. **Login**:
   - Navigate to the login page
   - Enter your email and password
   - Submit the form
   - Receive authentication confirmation

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📧 Contact

Your Name - your.email@example.com

Project Link: https://github.com/rKrishan99/springboot-html-css-registration-form.git

## 🙏 Acknowledgments

- Spring Boot Community
- MySQL Documentation
- Frontend design inspiration from modern web practices
