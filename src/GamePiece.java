/**
 * An implementation of IGamePiece that supports four piece types.
 */
public class GamePiece implements IGamePiece {

  private PieceType type;
  private int orientation;

  /**
   * Constructs a GamePiece of the given {@param PieceType}.
   * @param type
   */
  public GamePiece(PieceType type) {
    this.type = type;
    this.orientation = 0;
  }

  @Override
  public void rotate() {
    this.orientation = (this.orientation + 90) % 360;
  }
}