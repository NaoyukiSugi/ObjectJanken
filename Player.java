/**
 * class that shows player of janken
 */
public class Player{
  //じゃんけんの手を表す定数
  public static final int STONE = 0;  //グー
  public static final int SCISSORS = 1; //チョキ
  public static final int PAPER = 2;  //パー

  /**
   * name of player
   */
  private String name_;

  /**
   * how many times player won
   */
  private int winCount_ = 0;

  /**
   * hold our a hand
   * @return a kind of hand
   */
  public int showHand(){
    int hand = 0;

    double randomNum = Math.random() * 3;
    if(randomNum < 1){
      hand = STONE;
    }else if(randomNum < 2){
      hand = SCISSORS;
    }else if(randomNum < 3){
      hand = PAPER;
    }

    return hand;
  }
  /**
   * listen to outcome from judge
   * @param result true: win, false: lose
   */
  public void notifyResult(boolean result){
    if(result == true){
      winCount_++;
    }
  }

  /**
   * answer how many times won
   * @return return how many times won
   */
  public int getWinCount(){
    return winCount_;
  }

  /**
   * answer my name
   * @return return my name
   */
  public String getName(){
    return name_;
  }

  /**
   * constracter of player class
   * @param  name player name
   */
  public Player(String name){
    name_ = name;
  }
}