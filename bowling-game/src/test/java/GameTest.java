import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author mfigueiredo
 */
public class GameTest {


  private Game game;

  @BeforeEach
  void setUp() {
    game = new Game();
  }

  @Test void
  game_no_pins_get_hit() {
    rollMany(0, 20);

    Assertions.assertEquals(0, game.score() );
  }

  @Test void
  game_just_1_pin_get_hit() {
    rollMany(1, 20);

    Assertions.assertEquals(20, game.score() );
  }

  @Test void
  game_with_1_spare() {
    rollSpare();
    game.roll(3);
    rollMany(0, 17);

    Assertions.assertEquals(16, game.score() );
  }

  @Test void
  game_with_1_strike() {
    game.roll(10);
    game.roll(3);
    game.roll(4);
    rollMany(0, 16);

    Assertions.assertEquals(24, game.score() );
  }

  private void rollSpare() {
    game.roll(5);
    game.roll(5);
  }

  /*  @Test void
  game_just_spares() {
    rollMany(5);

    int normalScoreAmount = 100;
    int totalBonusAmount = 10 * 9;
    Assertions.assertEquals(
            normalScoreAmount + totalBonusAmount, game.score() );
  }*/

  private void rollMany(int pins, int times) {
    for (int i = 0; i < times; i++) {
      game.roll(pins);
    }
  }
}
