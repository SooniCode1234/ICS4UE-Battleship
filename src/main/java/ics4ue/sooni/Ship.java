package ics4ue.sooni;

public class Ship {
  private int row;
  private int column;
  private int length;
  private int direction;

  // Direction constants
  public static final int UNSET = -1;
  public static final int HORIZONTAL = 0;
  public static final int VERTICAL = 1;

  // Constructor. Create a ship and set the length.
  public Ship(int length) {
    this.length = length;

    // Set the direction to unset.
    direction = UNSET;

    // Set the row and column to unset.
    row = UNSET;
    column = UNSET;

  }

  // Has the location been initialized
  public boolean isLocationSet() {
    return row != UNSET && column != UNSET;
  }

  // Has the direction been initialized
  public boolean isDirectionSet() {
    return direction != UNSET;
  }

  // Set the location of the ship
  public void setLocation(int row, int col) {
    this.row = row;
    this.column = col;
  }

  // Set the direction of the ship
  public void setDirection(int direction) {
    this.direction = direction;
  }

  // Getter for the row value
  public int getRow() {
    return row;
  }

  // Getter for the column value
  public int getCol() {
    return column;
  }

  // Getter for the length of the ship
  public int getLength() {
    return length;
  }

  // Getter for the direction
  public int getDirection() {
    return direction;
  }

  // Helper method to get a string value from the direction
  private String directionToString() {
    if (direction == HORIZONTAL) {
      return "horizontal";
    } else if (direction == VERTICAL) {
      return "vertical";
    } else {
      return "unset";
    }
  }

  // Helper method to get a (row, col) string value from the location
  private String locationToString() {
    return "(" + row + ", " + column + ")";
  }

  // toString value for this Ship
  public String toString() {
    if (isDirectionSet() && isLocationSet()) {
      return directionToString() + " ship of length " + length + " at " + locationToString();
    } else {
      return "unset direction ship of length " + length + " at (unset location)";
    }
  }
}
