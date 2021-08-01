import java.util.Scanner;

public class Othello {
  public static void main(String[] args){

    Board.initialize();
    Board.showBoard();

    //コンソールからの入力を受け取る
    Scanner s = new Scanner(System.in);

    //ゲーム実行中フラグがtrueのあいだループする
    while(Board.game){

      System.out.println("駒を置くx座標を入力してください: ");
      int x = s.nextInt();

      System.out.println("駒を置くy座標を入力してください: ");
      int y = s.nextInt();

      Board.setStone(x, y);
    }
    s.close();
  }
}
