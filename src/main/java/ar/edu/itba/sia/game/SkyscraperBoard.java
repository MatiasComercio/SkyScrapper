package ar.edu.itba.sia.game;

public class SkyscraperBoard implements Integer2DBoard, Visibility {

  private final ArrayVisibility visibility;
  private final int[][] matrix;

  public SkyscraperBoard(final int n, final ArrayVisibility visibility) {
    this.visibility = visibility;
    this.matrix = new int[n][n];
  }

  @Override
  public int getValue(final int row, final int column) {
    return matrix[row][column];
  }

  @Override
  public void setValue(final int row, final int column, final int value) {
    matrix[row][column] = value;
  }

  @Override
  public boolean isEmpty(final int row, final int column) {
    return matrix[row][column] == 0;
  }

  @Override
  public int getVisibility(final Border border, final int position) {
    return visibility.getVisibility(border, position);
  }
}