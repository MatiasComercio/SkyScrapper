package ar.edu.itba.sia;

import ar.edu.itba.sia.game.ArrayVisibility;
import ar.edu.itba.sia.game.SkyscraperBoardImpl;
import ar.edu.itba.sia.game.SkyscraperProblem;
import ar.edu.itba.sia.game.SkyscraperState;
import ar.edu.itba.sia.game.Visibility;
import ar.edu.itba.sia.gps.api.GPSProblem;
import ar.edu.itba.sia.gps.strategy.SearchStrategy;

public class Matrix4HardData {

  private static final int SIZE = 4;

  private static final Visibility visibility = new ArrayVisibility.Builder(
      SIZE,
      new int[]{0, 3, 0, 0},
      new int[]{2, 0, 0, 0},
      new int[]{0, 0, 0, 0},
      new int[]{2, 0, 0, 2}
  ).build();

  private static final GPSProblem problem = new SkyscraperProblem(
      new SkyscraperBoardImpl(new int[][]{
          {0, 0, 0, 2},
          {1, 0, 0, 0},
          {0, 0, 0, 0},
          {0, 0, 0, 0}
      }, visibility),
      Main.getRules(SIZE)
  );

  private static final SkyscraperState solvedState = new SkyscraperState(
      new SkyscraperBoardImpl(new int[][]{
          {3, 1, 4, 2},
          {1, 3, 2, 4},
          {4, 2, 3, 1},
          {2, 4, 1, 3}
      }, visibility)
  );
  private static final Object[] data = new Object[]{SIZE + "x" + SIZE, problem, solvedState};

  public static Object[] getData() {
    return data;
  }
}