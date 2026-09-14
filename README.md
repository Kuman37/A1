# Anime Series Builder Pattern
## 1. Project Overview
This project implements the Builder creational design pattern to construct complex `AnimeSeries` objects. It prevents the "Telescoping Constructor" anti-pattern by separating configuration (genre, studio, duration, color palette) from the final immutable object.

## 2. Folder Structure
* `src/AnimeSeries.java` - The complex product
* `src/AnimeBuilder.java` - Builder interface with fluent API
* `src/ShonenActionBuilder.java` - Concrete builder
* `src/DarkFantasyBuilder.java` - Concrete builder
* `src/AnimeDirector.java` - Orchestrator for reusable configurations
* `src/Main.java` - Client demo
* `README.md` - Documentation

## 3. How to Build Configurations
**A. Director (Standard Archetypes)**
Use `AnimeDirector` to instantly generate predefined setups (e.g., standard action or dark fantasy)

**B. Manual Chaining (Custom Archetypes)**
Chain methods directly to create specific configurations. For example, building a custom series with a specific aesthetic:
```java
AnimeSeries customAnime = new ShonenActionBuilder()
        .setTitle("Kuma's Roar: The Iron Bear")
        .setGenre("Mecha / Action")
        .setPrimaryColorPalette("60% Black, 30% White, 10% Red")
        .setEpisodeDurationMinutes(37)
        .setStudio("Ursus Animation")
        .build();
```
## 4. How to Run

    1. Open the project in IntelliJ IDEA

    2. Set Project SDK to Java JDK 17

    3. Navigate to src/Main.java.

    4. Run Main.main() to execute the demo and view the constructed objects in the console
## 5. Clean Code Principles Applied

    1. Meaningful Names: Used episodeDurationMinutes instead of vague terms like time or length

    2. Small Methods: Builder setters perform exactly one assignment and return the instance

    3. No Duplicated Logic: The AnimeDirector centralizes common build sequences so the client doesn't repeat code

    4. Validated Construction: The build() method verifies state and throws an IllegalStateException if the setup is invalid

    5. No Magic Strings/Numbers: Configurations are clearly assigned via explicit method names rather than passing ambiguous arguments into a large constructor
