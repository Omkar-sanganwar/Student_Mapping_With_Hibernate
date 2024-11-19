# Student_Mapping-With_Hibernate

## Overview  
This project demonstrates how to perform **One-to-One Mapping** between two entities, `Student` and `Address`, using **Hibernate ORM**. It includes basic CRUD operations to save and retrieve student details along with their associated address.

---

## Features  
- **One-to-One Mapping**: Links `Student` with `Address` using `@OneToOne` annotation.  
- **Hibernate Integration**: Leverages Hibernate for ORM (Object Relational Mapping).  
- **MySQL Database**: Stores and retrieves data from a MySQL database.  
- **Auto-Creation of Tables**: Hibernate automatically generates the required database schema.  

---

## Technologies Used  
- **Java** (JDK 8+)  
- **Hibernate** (Version 5.6.15)  
- **MySQL** (Version 8.x)  
- **Maven** (Dependency Management)  

---

## Prerequisites  
Ensure you have the following installed and configured:  
1. **Java Development Kit (JDK 8 or higher)**  
2. **Apache Maven**  
3. **MySQL Server**  
4. **Hibernate Dependencies** (Handled via Maven)  

---

## Setup Instructions  

### Clone the Repository  
```bash
git clone https://github.com/yourusername/Student_Mapping-With_Hibernate.git
cd Student_Mapping-With_Hibernate
