# Rock Paper Scissors

An interactive Rock Paper Scissors game built in Java with a graphical user interface. Play against the computer across multiple rounds with custom artwork, live score tracking, and a replay option.

## Features

- Graphical user interface with custom illustrations for each game state
- Three classic choices: Rock, Paper, and Scissors
- Live scoreboard tracking player and computer wins
- Animated outcome screens (rock crushes scissors, paper wraps rock, scissors cut paper)
- Play again functionality for continuous gameplay
- Final scoreboard displayed at the end of the session

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any operating system that supports Java (Windows, macOS, Linux)

## How to Run

1. Clone the repository:
   ```
   git clone https://github.com/KooshalPoudel/Rock_Paper_Scissor.git
   ```

2. Navigate to the project folder:
   ```
   cd Rock_Paper_Scissor
   ```

3. Compile the Java file:
   ```
   javac M3_Lab4.java
   ```

4. Run the program:
   ```
   java M3_Lab4
   ```

## How to Play

1. Launch the program to see the intro screen.
2. Read through the instructions.
3. Choose Rock, Paper, or Scissors each round.
4. Watch the outcome animation to see if you won, lost, or tied.
5. The scoreboard updates after each round.
6. Choose to play again or end the session to view your final score.

## Game Rules

- **Rock** crushes **Scissors**
- **Scissors** cut **Paper**
- **Paper** wraps **Rock**
- Matching choices result in a tie

## Project Structure

```
Rock_Paper_Scissor/
├── M3_Lab4.java              # Main Java source file
├── intro.png                 # Intro screen graphic
├── instructionIcon.png       # Instructions icon
├── RPS.png                   # Rock Paper Scissors banner
├── rockCrushScissor.png      # Rock wins outcome
├── paperWrapsRock.png        # Paper wins outcome
├── scissorCutPaper.png       # Scissors wins outcome
├── noHardFeelings.png        # Tie outcome
├── playAgain.png             # Replay prompt
├── finalScoreBoardIcon.png   # Final scoreboard graphic
└── endingIcon.png            # Ending screen
```

## Author

**Kushal Poudel**