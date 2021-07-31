public class Board{

  //ゲーム実行フラグ
  static boolean gama = true;

  //オセロ版に対応した多次元配列
  static String[] [] board = new String[8][8];

  static final String EMPTY = "";
  static final String BLACK = "●";
  static final String WHITE = "◯";

  static String stone;
  static String rev_stone;

  //オセロ版の要素を全てクリアする
  for (int i = 0; i < 8; i++){
    for (int j = 0; j < 8; j++){
      board[i][j] = EMPTY;
    }
  }
}