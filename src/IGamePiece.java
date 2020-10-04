/**
 * Represents a Tetris Game Piece made of GameBoard blocks.
 *
 * <p>Supports: </p>
 * <ul>
 *   <li> Four piece types: 2x2 square, 2x2 square with one block missing, single block,
 *   and a 1x3 rod </li>
 *   <li> Rotation </li>
 * </ul>
 */
public interface IGamePiece {

  /**
   * Rotates the game piece 90 degrees clockwise.
   */
  public void rotate();



}
