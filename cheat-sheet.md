# Programming Problems Cheat Sheet

## UTSI

1. **Understand** the problem
2. Write **Tests**
3. **Solve** the problem
4. **Implement** the solution

### Understand The Problem

- Do not do not dare go **near** the code until you properly **understand** the problem
- Go through the problem statement **bit by bit** and ask yourself questions. If you don't know the answer to the questions **find out**. Keeping asking questions until you absolutely **cannot ask any more**. e.g:
  - What are the **inputs** and **outputs**
  - What **type** of data are they, and what do they **represent**
  - What do individual terms mean **precisely**
  - Anything else

### Write Tests

- Write an empty function that your tests can call with just enough code so that it will compile but **do not implement it yet**
- If you have not been provided with tests, write unit tests to cover
  - Any actual sample inputs/outputs you have been given
  - Any unusual cases ("corner cases") you can think of. Code should always be written on the assumption that it will be used by **stupid people** in the future who will not use it properly
    - Common corner cases: empty collections, enormous collections, negative numbers, null references
- Tests should be written without **any knowledge at all** of what the solution is going to be: as soon as you start to say to yourself "But I'm going to need to use an ArrayList to do x" or "I probably don't need to test y because I'm going to be looping through z" **slap yourself in the face**.

### Solve The Problem

- Use a pen and paper or a whiteboard (if provided) and draw the inputs and outputs using **sample inputs**
- Remember to try not to think too much about code yet. Your focus is just on what **steps** you will have to implement
- If the input data is a list of some kind, you are probably going to be doing some kind of **iteration**
- If it is possible, split the problem into **sub-problems**, then break those problems into **sub-problems**.
- Once you can no longer split it any further, work out how to solve the smallest of the sub-problems and then work **upwards**
- It's often useful to start by trying to solve the problem with tiny inputs and then seeing if your solution works for larger inputs.
- Solve the problem using a diagram or psuedocode first
- Walk through the logic if your solution using **sample inputs**. Follow every step through and confirm that your solution works

### Implement The Solution

- Where you have identified **sub-problems** write empty functions
- In the parent function, write some code that describes the main part of your algorithm, **pretending the empty functions work**
- Once you are happy that it makes sense, implement the **sub-problem** functions individually
- Consider writing tests for your sub problem functions to help you complete them faster
- As soon as you get to a point where you think it might be working, run all of your tests
- If they don't all pass, make **small changes** and run them again
- Trust the IDE/Compiler, because they are almost always right. In **almost all cases** Your code should be free of squiggley lines and the compiler should not output any warnings

## If you are stuck or it doesn't work

- **Don't panic**
- *In my view*, it is perfectly fine to Google **how do I do x**, even in an interview (unless you have been told otherwise) so long as you are not actually looking for the answer to the actual solution itself.
- Good debugging skills will make you stand out as a **good candidate** in job interviews, so getting it wrong is actually a **good thing**
- If a debugger is available **use it**. Debuggers are magical tools which will make your life easier
- If a debugger is not available, insert logging statements into your code so you can understand what code paths are being taken and what values are being stored
- **Rubber Duck Coding**: force yourself to explain what your code is doing line-by-line to a rubber duck. Be detailed, use an actual sample input and describe what values the variables are holding as you work through the program
- If it helps you understand what your code is doing, get out a pen and paper and draw out what is happening to your data
