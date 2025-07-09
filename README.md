# GWT Customer Management Application

A web-based customer management system built with Google Web Toolkit (GWT), Spring Framework, and JPA/Hibernate for data persistence.

## Overview

This application provides a user-friendly interface for managing customer information including personal details and multiple addresses (home and work). It demonstrates modern web development practices using GWT for the frontend and Spring Framework for backend services.

## Technology Stack

### Frontend
- **GWT 2.5.1** - Google Web Toolkit for rich web application development
- **UiBinder** - Declarative UI construction
- **GWT RPC** - Remote procedure calls for client-server communication

### Backend
- **Spring Framework 3.2** - Dependency injection and application context
- **Spring Data JPA** - Data access layer
- **Hibernate** - ORM framework with MySQL dialect
- **Apache Commons DBCP** - Database connection pooling

### Database
- **MySQL** - Primary database for data persistence

### Build & Deployment
- **Google App Engine** - Cloud deployment platform
- **Maven/Ant** - Build automation (inferred from structure)

## Project Structure

```
Customer/
├── src/
│   └── au/com/blogspot/ojitha/
│       ├── client/           # GWT client-side code
│       │   ├── ui/          # User interface components
│       │   └── services/    # RPC service interfaces
│       ├── server/          # Server-side implementation
│       │   ├── domain/      # JPA entities
│       │   ├── repository/  # Data access repositories
│       │   ├── service/     # Business logic services
│       │   └── jpa/         # JPA implementations
│       └── shared/          # DTOs shared between client and server
└── war/                     # Web application resources
    ├── WEB-INF/
    │   └── spring/          # Spring configuration
    └── Customer.html        # Main HTML page
```

## Features

- **Customer Management**: Add and manage customer information
- **Address Management**: Support for multiple address types (Home, Work)
- **State Selection**: Dropdown selection for states/regions
- **Form Validation**: Client-side input validation
- **Responsive UI**: Clean, user-friendly interface using GWT Clean theme

## Prerequisites

- Java 7 or higher
- MySQL 5.x or higher
- GWT SDK 2.5.1
- Maven or Ant (for building)
- Application server (Tomcat, Jetty, or Google App Engine)

## Database Setup

1. Create a MySQL database named `payroll`
2. Update database configuration in `/war/WEB-INF/spring/jdbc.properties`:
   ```properties
   jdbc.driverClassName=com.mysql.jdbc.Driver
   jdbc.url=jdbc:mysql://localhost:3306/payroll
   jdbc.username=your_username
   jdbc.password=your_password
   ```

3. Configure Hibernate auto-DDL by uncommenting the "hibernate.hbm2ddl.auto" property in app-context.xml to create tables automatically

## Installation & Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd GWTCustomer
   ```

2. **Configure Database**
   - Ensure MySQL is running
   - Create the `payroll` database
   - Update `jdbc.properties` with your database credentials

3. **Build the Application**
   ```bash
   # If using Maven
   mvn clean compile
   
   # If using Ant
   ant build
   ```

4. **Deploy to Application Server**
   - Deploy the `war` directory to your application server
   - Or use Google App Engine for cloud deployment

## Running the Application

1. Start your MySQL database server
2. Deploy the application to your web server
3. Access the application at: `http://localhost:8080/Customer.html`

## Usage

### Adding a Customer

1. Navigate to the main application page
2. Fill in the customer details:
   - First Name
   - Last Name
3. Optionally add addresses:
   - Check "Home Address" or "Work Address" checkboxes
   - Fill in street information
   - Select appropriate state from dropdown
4. Click "Add" to save the customer

## API Endpoints

The application exposes the following RPC services:

- `/customer/customerService` - Customer management operations
- `/customer/stateService` - State/region data service
- `/customer/greet` - Greeting service (demo)

## Configuration Files

### Spring Configuration
- `app-context.xml` - Main Spring application context
- `jdbc.properties` - Database connection properties

### GWT Configuration
- `Customer.gwt.xml` - GWT module configuration
- `web.xml` - Web application deployment descriptor

### Google App Engine
- `appengine-web.xml` - App Engine deployment configuration

## Development

### Key Classes

#### Client Side
- `Customer.java` - Main entry point
- `AddCustomer.java` - Customer form UI component
- `AddressUI.java` - Address input component

#### Server Side
- `CustomerServiceImpl.java` - Customer service implementation
- `StateServiceImpl.java` - State service implementation
- `Cust.java` - Customer entity
- `Address.java` - Address entity

#### Shared
- `CustomerDto.java` - Customer data transfer object
- `AddressDto.java` - Address data transfer object
- `StateDto.java` - State data transfer object

### Building for Development

1. Use GWT Development Mode for rapid development:
   ```bash
   # Start GWT development server
   gwt:run
   ```

2. The application will be available at the development server URL

## Deployment

### Google App Engine Deployment

1. Configure your App Engine application ID in `appengine-web.xml`
2. Deploy using App Engine SDK:
   ```bash
   appcfg.sh update war/
   ```

### Traditional Web Server Deployment

1. Build the WAR file
2. Deploy to Tomcat, Jetty, or similar servlet container

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## License

This project is available under the MIT License.

## Author

Created by Ojitha - [Blog](http://ojitha.blogspot.com)

## Support

For issues and questions, please create an issue in the project repository.