# Command Line Arguments

The arguments array that is passed into the main function simply represents all strings of characters separated by spaces that are passed on the command line when the program is run. So if you run the following:

```bash
java liam.bootcamp.App foo bar
```

your args array will look like this:

```java
String[] args = {"foo", "bar"}
```

It is quite common for programs to separate arguments passed in on the command line into "positional" arguments and "named" arguments. E.g - running the program as follows:

```java
java liam.bootcamp.App foo --baz bar bosh --biz bop bash
```

would be passed into the program as the following array

```java
String[] args = {"foo", "--baz", "bar", "bosh", "--biz", "bop", "bash"}
```

but would actually represent the following **named** arguments:

* "baz" with the value of "bar"
* "biz" with the value of "bop"

and the following **positional** arguments

* foo (position 0)
* bosh (position 1)
* bash (position 2)

## Task

Write a program that, given a series of arguments passed in on the command line prints out first the **positional** arguments and then the **named** arguments. So for example, given the input provided above, the program should output the following:

```bash
java liam.bootcamp.App foo --baz bar bosh --biz bop bash
Positional argument values: foo, bosh, bash
Named argument values:
baz = "bar"
biz = "bop"
```

## Note

Instead of writing just a function here, I'm asking you to write an actual command line program. You will want to do as little work as possible in the actual main function, rather do most of the work in functions you write to solve the problem which you can then unit test.
