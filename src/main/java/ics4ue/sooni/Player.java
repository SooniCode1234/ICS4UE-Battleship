package ics4ue.sooni;

public class Player {
  private Ship[] ships;
  private Grid playerGrid;
  private Grid computerGrid;
  private int numShips;

  // These are the lengths of all of the ships.
  private static final int[] SHIP_LENGTHS = { 2, 3, 3, 4, 5 };

  public Player() {
    // Create an array of ships.
    ships = new Ship[SHIP_LENGTHS.length];

    // Create the player's grid.
    playerGrid = new Grid();

    // Create the computer's grid.
    computerGrid = new Grid();
  }

  // This will set a ship’s row, column and direction and add it to the current
  // player’s grid.
  public void chooseShipLocation(Ship s, int row, int col, int direction) {
    if (numShips < SHIP_LENGTHS.length) {
      s.setLocation(row, col);
      s.setDirection(direction);
      playerGrid.addShip(s);
      numShips++;
    }
  }

  // Print your ships on the grid
  public void printMyShips() {
    playerGrid.printShips();
  }

  // Print opponent guesses
  public void printOpponentGuesses() {
    computerGrid.printStatus();
  }

  // Print your guesses
  public void printMyGuesses() {
    playerGrid.printStatus();
  }

  // Record a guess from the opponent
  public void recordOpponentGuess(int row, int col) {
    if (playerGrid.hasShip(row, col)) {
      computerGrid.markHit(row, col);
    } else {
      computerGrid.markMiss(row, col);
    }
  }
}
