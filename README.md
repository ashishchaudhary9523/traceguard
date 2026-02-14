# TraceGuard

> A modular Java toolkit for traceability, monitoring, and automation  
> Built with a core trace engine, demo application, and Spring Boot support.

---

## 🚀 Overview

**TraceGuard** is a Java-based framework designed to help developers instrument, monitor, and extend applications with trace-oriented components.

It includes:

- 📦 **Core library** (`tresless-core`) — foundational logic and APIs  
- 🧪 **Demo application** (`tresless-demo-app`) — example usage implementation  
- 🌱 **Spring Boot starter** (`tresless-spring-boot-starter`) — easy Spring Boot integration  

The modular structure allows you to use TraceGuard in standalone Java applications or integrate seamlessly into Spring Boot projects.

---

## 🚨 New Version Available

⚡ This project has evolved into a newer and improved version:

👉 **Traceless Starter**  
https://github.com/ashishchaudhary9523/traceless-starter

### Why a New Version?

- Cleaner architecture
- Improved Spring Boot auto-configuration
- Better modular separation
- More production-ready structure
- Enhanced developer experience

If you are starting fresh, it is recommended to use **Traceless Starter** instead of this repository.

This repository remains available for reference and legacy experimentation.

---

## 📁 Repository Structure

```
traceguard/
├── tresless-core
├── tresless-demo-app
├── tresless-spring-boot-starter
├── pom.xml
└── README.md
```

---

## 🧠 Features

✔ Modular architecture  
✔ Lightweight tracing utilities  
✔ Spring Boot auto-configuration support  
✔ Clean Maven multi-module structure  
✔ Beginner-friendly and extensible  

---

## 🛠 Tech Stack

- Java 17+
- Maven
- Spring Boot (for starter module)

---

## 📦 Getting Started

### 1️⃣ Prerequisites

Make sure you have:

- Java 17 or higher
- Maven 3.6+

Check versions:

```bash
java -version
mvn -version
```

---

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/ashishchaudhary9523/traceguard.git
cd traceguard
```

---

### 3️⃣ Build the Project

```bash
mvn clean install
```

This will build all modules.

---

## 🧩 Using the Core Module

Add dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>tresless-core</artifactId>
    <version>0.1.0</version>
</dependency>
```

Example usage:

```java
public class Application {
    public static void main(String[] args) {
        System.out.println("TraceGuard Core Initialized");
    }
}
```

---

## 🌱 Spring Boot Integration

Add the starter dependency:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>tresless-spring-boot-starter</artifactId>
    <version>0.1.0</version>
</dependency>
```

Spring Boot will auto-configure TraceGuard components.

---

## 🧪 Running the Demo App

```bash
cd tresless-demo-app
mvn spring-boot:run
```

Open:

```
http://localhost:8080
```

---

## 📈 Future Improvements

- Add logging integration
- Add distributed tracing support
- Publish to Maven Central
- Add unit & integration tests

---

## 🤝 Contributing

1. Fork the repository
2. Create a new feature branch
3. Commit changes
4. Open a Pull Request

---

## 📄 License

No license specified yet.  
Consider adding MIT or Apache 2.0 for open-source usage.

---

## 👨‍💻 Author

Ashish Chaudhary  
GitHub: https://github.com/ashishchaudhary9523

---

⭐ If you find this project useful, consider giving it a star!
