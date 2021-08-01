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
    
    //オセロを描写する
    int i = 0;
    System.out.println(" |0 |1 |2 |3 |4 |5 |6 |7 |");
    System.out.println("――――――――――――――");

    for(String[] sarr :board){

      System.out.print(i + " |");
      for (String s : sarr) {

      System.out.println(s);
      System.out.println("|");

      //空いている座標があるか、各駒数の集計
      if(s.equals(EMPTY)){
        existempty = true;
      }else if(s.equals(BLACK)){
        cnt_black++;
      }else if(s.equals(WHITE)){
        cnt_white++;
      }
    }

    System.out.println();
    System.out.println("――――――――――――――");

    i++;
  }

    System.out.println(BLACK + ":" + cnt_black);
    System.out.println(WHITE + ":" + cnt_white);
    System.out.println("――――――――――――――");

    if(existempty){
      System.out.println(stone + "のターンです！");
    }else{
      System.out.println(stone + "ゲーム終了！");
      game = false;
    }
  }

  static public void setStone(int x, int y){

    //番外の座標を指定した場合
    if(board[y][x].equals(EMPTY)){
      board[y][x] = stone;

      //ひっくり返す処理
      turnStone(x,y);

      //次打つ駒の設定
      String next_rev_stone = stone;
      stone = rev_stone;
      rev_stone = new_rev_stone;
    }
  }
}