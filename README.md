# Word Guesser Game

A simple Java console-based word guessing game where the player has 5 attempts to guess a secret word.

## Features

* Console-based gameplay
* 5 guessing attempts
* Instant feedback after each guess
* Displays a win message when the correct word is guessed
* Reveals the secret word if all attempts are used

## How the Game Works

1. The game starts with a hidden secret word.
2. The player enters a guess.
3. If the guess is correct, the player wins.
4. If the guess is incorrect, one attempt is deducted.
5. The game continues until:

   * The player guesses the word correctly, or
   * All attempts are exhausted.

## Secret Word

```text
solo
```

## Requirements

* Java JDK 8 or later
* Any Java IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

## Compilation

Open a terminal in the project folder and run:

```bash
javac WordGuesserGame.java
```

## Running the Program

After compiling, run:

```bash
java WordGuesserGame
```

## Example Gameplay

```text
Welcome to the Word Guesser Game!

You have 5 attempts remaining to guess the secret word: _ _ _ _
hello
Try again.

You have 4 attempts remaining to guess the secret word: _ _ _ _
solo
Congrats! You guessed the word.
```

## Project Structure

```text
WordGuesserGame/
│
└── WordGuesserGame.java
```

## Concepts Used

* Variables
* User Input (`Scanner`)
* Conditional Statements (`if-else`)
* Loops (`while`)
* String Comparison (`equals()`)
* Basic Game Logic

## Future Improvements

* Randomly select words from a list
* Add difficulty levels
* Display guessed letters
* Show hints to the player
* Track player score
* Allow multiple rounds
* Make word comparison case-insensitive

## Author

Bhargav Patel

## License

This project is free to use for learning and educational purposes.
