# Stickfish

Stickfish is a game engine for the hand game "Chopsticks," inspired by the design principles of chess engines like Stockfish. This project is a simple terminal based game that includes capabilites for grading move accuracy and creating optimal play lines.

## Features

*   **Core Game Logic:** Implements the fundamental rules of Chopsticks, including:
    *   Attacking and distributing fingers.
    *   Managing player hands and finger counts.
    *   Detecting and handling a "lost hand" scenario.
    *   Displaying the current game state.
    *   Saving and loading game states to files.
*   **Bot Opponents:** Features various Bot players with different skill levels:
    *   **Random Player:** Makes moves randomly.
    *   **Optimal Player (Elo Rated):** A Bot designed to play with high proficiency, potentially using an Elo rating system to track and improve its performance.
*   **Game Engine Capabilities:**
    *   Ranks moves based on their strategic value.
    *   Tracks the game tree for analysis.
    *   Supports switching between different lines of play.
    *   Predicts and evaluates the best possible lines of play.
    *   Displays the current advantage in the game.

## Project Structure

The project is organized into several Java classes:

*   **`UI.java`**: Handles user interaction, including input prompts for game actions and managing the game's start and quit states.
*   **`Players.java`**: Defines the `Player` class and its subclasses (`Human`, `RandomBot`, accuracy bots). It manages player hands, attacks, and statistics.
    *   **`Class Hand`**: A nested class within `Players.java` that stores finger values, player name, and methods for managing finger counts.
*   **`stickMatch.java`**: Orchestrates the gameplay, initializing players, managing turns, and interacting with the `ScoreKeeper`.
*   **`ScoreKeeper.java`**: Maintains a record of past moves in a 2D ArrayList, allowing for game history analysis.
*   **`SticksEngine.java`**: The core engine responsible for Computer decision-making, move ranking, and game tree management.

## Getting Started
> its totally incomplete right now so you'll have a lot more work to do if you want to run it now.

1.  Clone the repository.
2.  Compile the Java code.
3.  Run the main game application. "StickMatch.java"


## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for any bugs or feature requests.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
