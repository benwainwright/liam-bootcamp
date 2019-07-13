# Morse Code

Morse code is a character encoding scheme where letters are encoded as a series of dots and dashes.

## Problem Statement

Write a command line program that can convert **from** letters, numbers and spaces **to** Morse code **and back again**. The program's first argument should indicate whether you are converting **from** or **to** Morse code. Note:

- a "dot" is represented as "."
- a "dash" is represented as "-"
- each character is separated by a single space
- each word is separated by three spaces

## Examples

```bash
% java liam.bootcamp.App to_morse "Ben is my favourite person"
-... . -.   .. ...   -- -.--   ..-. .- ...- --- ..- .-. .. - .
```

```bash
% java liam.bootcamp.App from_morse "..- -. .. -.-. --- .-. -. ...   .- .-. .   .--. .-. . - - -.--"
Unicorns are pretty
```

## Error Handling

Your program should print *sensible* error messages to the console when the input does not make sense. I'll leave it up to you to decide what that means, but I'll be looking for you to handle *all* reasonable error cases.
