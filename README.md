# Smart Training Platform – Batch & Trainer Allocation Engine

This is a containerized Spring Boot application built for the Java Trainer Machine Test.

---

## 🧪 Objective

Build a smart training system with:

- Trainer-to-batch allocation using custom logic
- Batch recommendation to students
- REST APIs for core operations
- Docker + Render deployment

---

## ⚙️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- H2/MySQL
- Docker
- Render (Deployment)

---

## 📁 Folder Structure

/src/main/java/com/aditya/trainingplatform
│
├── controller/
├── service/
├── repository/
├── model/
├── dto/
├── exception/
├── util/

## 📘 Teaching Explanations

### 1. What is Dependency Injection and how is it used in your app?

Dependency Injection (DI) allows Spring to provide required objects to classes.  
For example, `StudentService` gets `StudentRepository` injected using `@Autowired`, making the app modular and testable.

---

### 2. How would you explain the trainer assignment logic to students?

We assign the most suitable trainer to a batch using a greedy algorithm based on:
- Subject expertise match
- Availability (no date clash with other batches)
- Highest rating
- Least current workload

This ensures optimal trainer utilization.

### 3. Why did you choose your architecture and flow?

We follow layered architecture:
- **Model** – Entity classes  
- **Repository** – Database access  
- **Service** – Business logic  
- **Controller** – REST APIs  

It ensures clean separation and scalability.

## 🧪 Sample API Calls

### ✅ Add Student

POST /students
Content-Type: application/json

{
"name": "Aditya",
"email": "aditya@email.com",
"phone": "9999999999",
"dateOfBirth": "2002-03-19",
"previousCourses": ["Java", "Python"],
"appliedSubject": "Spring Boot"


### ✅ Add Trainer

POST /trainers
{
"name": "Rohini",
"subjectExpertise": ["Java", "Spring Boot"],
"rating": 4.7,
"yearsOfExperience": 6,
"availabilityPeriods": ["2025-06-25 to 2025-07-10"]
}



### ✅ Add Batch

POST /batches
{
"title": "Spring Boot June Batch",
"subject": "Spring Boot",
"maxCapacity": 30,
"startDate": "2025-07-01",
"endDate": "2025-07-20"
}





## ✅ Final Steps

1. Save this into your project root as `README.md`
2. Run:

```bash
git add README.md
git commit -m "Added full README with teaching explanation and deployment steps"
git push
Say “done, next step” once pushed, and I’ll walk you through:

🔁 Batch list by subject + 🧠 Smart trainer assignment logic

Let’s keep building! 💻🔥
