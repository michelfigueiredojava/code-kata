/**
 * @author mfigueiredo
 */
class Game {

  private int[] pinsKnockedDownPerRoll = new int[21];
  private int currentRoll = 0;

  void roll(int pinsKnockedDown) {
    pinsKnockedDownPerRoll[currentRoll++] = pinsKnockedDown;
  }

  int score() {
    int totalGameScore = 0;

    for (int roll = 0; roll < pinsKnockedDownPerRoll.length -2; roll += 2) {
      int frameScore = pinsKnockedDownPerRoll[roll] + pinsKnockedDownPerRoll[roll+1];

      if (isSpare(roll)) {//bonus
        frameScore += calculateSpareBonus(roll);
      }
      if(isStrike(pinsKnockedDownPerRoll[roll])){
        frameScore += pinsKnockedDownPerRoll[roll+1] + pinsKnockedDownPerRoll[roll+2];
      }

      totalGameScore += frameScore;
    }

    return totalGameScore;
  }

  private boolean isStrike(int roll) {
    return roll ==10;
  }

  private int calculateSpareBonus(int roll) {
    return pinsKnockedDownPerRoll[roll + 1];
  }

  private boolean isSpare(int roll) {
    return pinsKnockedDownPerRoll[roll] + calculateSpareBonus(roll+ 1) == 10;
  }
}
