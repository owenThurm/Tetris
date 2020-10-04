/**
 * Represents a Tetris piece.
 */
public enum PieceType {
  L("L"), Square("Square"), Single("Single"), Rod("Rod");

  private final String rep;

  private PieceType(String rep) {
    this.rep = rep;
  }

  @Override
  public String toString() {
    return this.rep;
  }



}
