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

  static public void initialize(){

  //オセロ版の要素を全てクリアする
    for (int i = 0; i < 8; i++){
      for (int j = 0; j < 8; j++){
        board[i][j] = EMPTY;
      }
    }

    //初期状態の配置
    board[3][3] = BLACK;
    board[3][4] = WHITE;
    board[4][3] = WHITE;
    board[4][4] = BLACK;

    //次打つ駒の色を指定
    stone = BLACK;
    rev_stone = WHITE;

    //ゲーム実行中フラグ
    game = true;
  }

  static public void showBoard(){

    //まだ空いている座標はあるか
    boolean existempty = false;

    //黒い駒の数集計用
    int cnt_black = 0;

    //白い駒の数集計用
    int cnt_white = 0;
    
  }
}