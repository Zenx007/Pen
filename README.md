# Pen Project in Java

This is a simple Java project that simulates the behavior of a pen. The `Caneta` class has attributes such as model, color, tip size, ink level, and state (capped or uncapped), as well as methods to scribble, cap, and uncap the pen.

## 📋 Code Description

The `Caneta` class contains the following attributes and methods:

### Attributes:
- `modelo`: String that defines the pen model.
- `cor`: String that defines the pen color.
- `ponta`: Float that defines the tip size of the pen.
- `carga`: Integer that defines the ink level of the pen.
- `tampada`: Boolean that indicates whether the pen is capped or not.

### Methods:
- `estado()`: Displays the current state of the pen (color, tip size, ink level, and whether it is capped).
- `rabiscar()`: Checks if the pen is capped. If it is, it displays an error message. Otherwise, it displays "Scribbling".
- `tampar()`: Caps the pen.
- `destampar()`: Uncaps the pen.

## 🚀 How to Run the Project

1. Make sure you have the Java Development Kit (JDK) installed on your machine.
2. Copy the `Caneta` class code into a file named `Caneta.java`.
3. Compile the code using the command:
   ```bash
   javac Caneta.java
