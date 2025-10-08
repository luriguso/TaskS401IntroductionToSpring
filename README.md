# Sprint 4 - Task S4.01: Introduction to Spring

This repository contains the consolidated projects for **Task S4.01: Introduction to Spring**.
It combines the work from three separate repositories, each covering a specific part of the task:

| Level | Project | Description |
|-------|---------|-------------|
| Level 1 | [S04T01N01 - Maven](./Level1_Maven) | Spring Boot project using Maven. Implements a simple REST API with two endpoints (`HelloWorld` and `HelloWorld2`) to greet the user. Runs on port 9000. |
| Level 2 | [S04T01N02 - Gradle](./Level2_Gradle) | Spring Boot project using Gradle. Implements the same REST API structure as Level 1 but runs on port 9001. |
| Level 3 | [S04T01N03 - Postman](./Level3_Postman) | Postman environments to test Level 1 and Level 2 projects. Includes exported JSON files for Maven and Gradle environments, and screenshots of successful requests. |

---

## 📌 Project Overview

### Level 1 - Spring + Maven
- REST API endpoints: 
- `GET /HelloWorld?name=YourName` → greeting with query parameter. 
- `GET /HelloWorld2/{name}` → greeting with path variable.
- Default parameter: `"UNKNOWN"` if no name is provided.
- Server port: `9000`.
- See [Level1_Maven README](./Level1_Maven/README.md) for full instructions.

### Level 2 - Spring + Gradle
- Same endpoints and behavior as Level 1, but built with Gradle.
- Server port: `9001`.
- See [Level2_Gradle README](./Level2_Gradle/README.md) for full instructions.

### Level 3 - Postman Testing
- Two environments: 
- **Maven environment:** `server=http://localhost`, `port=9000`. 
- **Gradle environment:** `server=http://localhost`, `port=9001`.
- Tasks: 
- Export environments to JSON. 
- Take screenshots of requests using the environment variables.
- See [Level3_Postman README](./Level3_Postman/README_Level3_Postman.md) for detailed instructions.

---

## 📂 Repository Structure

```
Sprint4FinalDelivery/
│
├── Level1_Maven/ → Maven project (REST API)
├── Level2_Gradle/ → Gradle project (REST API)
├── Level3_Postman/ → Postman screenshots
└── README.md 
```

---

## 🚀 How to Run

1. Open **Level1_Maven** in Eclipse, build with Maven, run on port 9000.
2. Open **Level2_Gradle** in Eclipse, build with Gradle, run on port 9001.
3. Open **Level3_Postman**, import the environments, and execute requests using the configured variables.

---

## 📌 Notes

- Each project has its own README with detailed instructions and setup.
- The final repository is meant as a **consolidated delivery** of all three levels for grading purposes.
- Make sure both Level 1 and Level 2 projects are running before testing with Postman.

---

## 📚 References

- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Maven Documentation](https://maven.apache.org/)
- [Gradle Documentation](https://gradle.org/)
- [Postman Learning Center](https://learning.postman.com/)