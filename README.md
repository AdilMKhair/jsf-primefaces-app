# JSF PrimeFaces Application

A simple Java JSF application using PrimeFaces components.

## Project Structure

```
jsf-primefaces-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/jsf/
│   │   │       └── UserBean.java        # Managed Bean
│   │   └── webapp/
│   │       ├── WEB-INF/
│   │       │   └── web.xml               # Web Configuration
│   │       ├── css/
│   │       │   └── style.css             # Styles
│   │       └── index.xhtml               # Main Page
└── pom.xml                               # Maven Configuration
```

## Prerequisites

- Java 11 or higher
- Maven 3.6+

## Running the Application

1. Clone the repository:
```bash
git clone https://github.com/AdilMKhair/jsf-primefaces-app.git
cd jsf-primefaces-app
```

2. Run with Maven and Jetty:
```bash
mvn jetty:run
```

3. Open your browser and navigate to:
```
http://localhost:8080
```

## Features

- JSF 3.0 with Jakarta EE
- PrimeFaces UI components
- Simple form with validation
- CDI Bean management
- Responsive design with CSS

## Technologies Used

- Java 11
- Jakarta Faces (JSF) 3.0
- PrimeFaces 14.0
- Maven
- Jetty Server
