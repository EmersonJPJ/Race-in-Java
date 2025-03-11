# 🐢🐇 Turtle and Hare Race - A Multi-Threaded Java Game

Welcome to the **Turtle and Hare Race** project! This is an exciting and interactive Java application that simulates a race between a turtle and a hare using **multithreading**. The race is controlled by two threads, one for the turtle and one for the hare, where each one progresses at different speeds and can have unique behaviors, such as the hare randomly taking breaks.

## 🎮 Overview

The game simulates a race between a turtle and a hare using two graphical components, each controlled by separate threads. As the race progresses, each contestant (the turtle and the hare) moves along a progress bar. The first to reach the end of the bar wins the race.

### Key Features:
- **Turtle vs. Hare Race:** The turtle moves steadily while the hare has a chance of taking naps.
- **Multithreading:** Each character runs on a separate thread, allowing them to move asynchronously and simulate race dynamics.
- **Graphical Representation:** The race is represented by animated GIFs for the turtle and the hare.
- **GUI with Progress Bars:** The race is visually tracked using progress bars that show the progress of both contestants.
- **Race Logic:** The hare has a random chance to "sleep" for a moment, simulating its tendency to nap during the race.

## 🛠️ Technologies Used

- **Java:** The game is developed using Java, making use of **Swing** for the graphical user interface (GUI) and **JProgressBar** for tracking the progress.
- **Multithreading:** We use Java threads to control the movement of the turtle and hare asynchronously, allowing for real-time updates and actions.

## 🚀 How to Run

### Prerequisites:
- Java 8 or later is required to run this project.

### Running the Project:
1. Download the repository to your local machine.
2. Navigate to the `src` folder and compile the Java files:
   ```bash
   javac carrerahilo/*.java
    ```
3.Run the Carrera.java file to start the game:
    ```bash
    java carrerahilo.Carrera
    ```
You will be greeted with a graphical interface where you can see the race between the turtle and the hare. Press the "Start" button to begin the race!

## 💡 How Multithreading Works

In this project, we use **multithreading** to handle the movements of the turtle and the hare separately. Here's how it works:

1. **Separate Threads for Each Contestant:**
   - Each contestant (turtle and hare) is run on a separate thread, allowing both to operate concurrently.

2. **Turtle Movement:**
   - The turtle moves forward at a steady pace, updating the progress bar every few milliseconds.

3. **Hare's Random Breaks:**
   - The hare, on the other hand, has a random chance of taking a break, represented by a pause in its thread. 
   - This behavior is controlled by the `azar` and `posDormir` variables, which simulate the hare "sleeping" during the race.

4. **Real-Time Simulation:**
   - This use of threads allows the game to simulate the race in real-time, with both characters moving independently but on the same race track.


## ✨ Contact  

Feel free to reach out for any questions or suggestions!  

- 📧 **Email**: emerson04vade@gmail.com  
- 💻 **GitHub**: EmersonJPJ 
