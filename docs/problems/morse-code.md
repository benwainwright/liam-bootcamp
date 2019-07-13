# Morse Code

[Morse code](https://en.wikipedia.org/wiki/Morse_code) is a character encoding scheme where letters are encoded as a series of dots and dashes.

## Problem Statement

Write a command line program that can convert **from** letters, numbers and spaces **to** Morse code **and back again**. The program's first argument should indicate whether you are converting **from** or **to** Morse code. Note:

- A "dot" is represented as "."
- A "dash" is represented as "-"
- Each character is separated by a single space
- Each word is separated by three spaces
- Your code should be case *insensitive*
- Your code needs to handle only the letters from a-z, spaces, and the numbers from 0-9
- If the input contains anything else, that is an error

## Examples

```bash
% java liam.bootcamp.App to_morse "Ben is my favourite person"
-... . -.   .. ...   -- -.--   ..-. .- ...- --- ..- .-. .. - .
```

```bash
% java liam.bootcamp.App from_morse "..- -. .. -.-. --- .-. -. ...   .- .-. .   .--. .-. . - - -.--"
Unicorns are pretty
```

## Error Handling and other expectations

Your program should print *sensible* error messages to the console when the input does not make sense. I'll leave it up to you to decide what that means, but I'll be looking for you to handle *all* reasonable error cases. As always, I'm expecting you to follow the guidelines laid out [in my guideline document](../what-im-looking-for.md)

