# Animal Shelter (Data Structures)

This project implements an Animal Shelter system that supports adopting animals using FIFO rules.

## Rules
- The shelter holds only **Dogs** and **Cats**
- Adoption is **first-in, first-out**
- You can adopt:
  - the **oldest animal overall** (`dequeueAny`)
  - the **oldest dog** (`dequeueDog`)
  - the **oldest cat** (`dequeueCat`)
- Users cannot choose a specific animal, only by type or oldest overall.

## How it works
Each animal gets an increasing `order` number when it arrives.  
The smallest `order` is the oldest.

Two queues are used:
- `Queue<Dog> dogs`
- `Queue<Cat> cats`

## How to run
From the project root:

```bash
mvn clean compile
java -cp target/classes com.keyin.Main
