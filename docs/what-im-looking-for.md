# What I'm looking for

This document sets out what I will be looking for when I do code reviews. It might feel pedantic, but if you follow these rules you will produce *high quality code* that is really easy to read and maintain. Some of it will also be looked for by employers in interviews.

1. Clean build and test run
2. Does it do what was asked
3. Consistent style
4. Self Documenting Code
5. No magic numbers
6. Short Functions that do one thing
7. Comprehensive, readable testing
8. Comment WHY not WHAT
9. Appropriate error handling
10. No temporary code

## Clean build and test run

* When I check out the code, I should be able to build your code and run any tests you have written **without any errors or warning**.
* If I've asked you to build an application, it should be clear to me how to run the application once it has been buil

## Does it do what was asked

* Does the solution you have submitted match the specification?
* Have you covered all the example cases provided
* Do all your tests pass

## Consistent Style

* For code style, you should follow the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html). This [can be automated](https://github.com/google/google-java-format) - but you will have to work out how to set that up yourself.

## Self Documenting Code

This means in general it should be **blindingly obvious** what a thing (functions, classes, packages, variables etc.) does or is for from its name without looking at the implementation. More specifically this means:

* "goo" is no longer an acceptable package name :wink:
* Abbreviations are never acceptable unless it is widely understood (e.g. "DNS")
* Numbering variables or parameters (e.g. `int foo1; int foo2`) are *rarely* acceptable. If you find yourself doing this, it is often a sign that you need to consider a collection type

## No Magic Numbers

Hard-coded numbers are referred to as "magic numbers" by programmers. They should be avoided because:

* If you have to change them, you will have to change them in every code location you have used them
* You can't tell from reading them what they represent

In Java, you should define magic numbers as "class constants". The same rule applies to hardcoded strings

```java
// This is bad
public class App {
  public static void main(String[] args) {
    for(int i = 0; i < 52; i++) {
      // some code
    }
  }
}

// This is good
public class App {

  public static final int CARD_DECK_SIZE = 52;

  public static void main(String[] args) {
    for(int i = 0; i < CARD_DECK_SIZE; i++) {
      // some code
    }
  }
}

```

## (almost) always Handle Return Values

* In almost all cases, ignoring the return value from a function is a bug or an oversight.
* If you write a function that is non void and you call it, you should be doing something with the value it returns unless there is a very good reason.

## Short Functions that do one thing

* Functions should be relatively short - as a rule of thumb, if you have to scroll, it is probably too much code
* Functions should do (roughly) one thing only. If you find yourself using "and" in the function name because you are trying to make it "self documenting" (see above), consider whether you need two functions instead of one.

## Comprehensive, readable tests

* All **public** functions should be unit tested (with the exception of getters and setters). Make sure you cover at minimum:

  * Each sample input/output provided in the specification
  * A few different input/output pairs
  * All corner cases you can think of

* Test names should describe the inputs and expected outputs; for example:

```java
// This is BAD
@Test
public void testMyCrazyMethodFunctionality() {
  // test code
}

// This is good
@Test
public void testMyCrazyMethodReturnsTrueWhenPassedAListOfEvenNumbers() {
  // test code
}
```

## Comment WHY not WHAT

* avoid comments that describe **what** the code is doing.
* Modern clean code practises suggest you use comments to describe **why** you are doing something unexpected. However, this is unlikely to come up at all in this kind of problem solving; but might in your final year project.

If you feel like you write a comment, consider whether you could improve the situation by just naming something better.

## Appropriate error handling

* Functions should handle unexpected inputs by throwing a sensible exception with a useful error message. "Error" is not a useful error message.
* Command line applications should not expose implementation details to the user (so no stack traces), but should provide a useful eror message which tells them what went wrong and what can be done to fix the problem.

## No Temporary Code

* Code that is "commented out" should not be committed. If you want to get a previous version of something back, you can use version control
* Debugging code (such as console logging you added to see why something wasn't working) should not be committed
* `// TODO` items never get done. Trust me; if you think something should be done, but want to do it later; write a test that fails unless you do it; this will force you to complete it.
