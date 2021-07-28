import java.util.*;
public class bingo {

    public static void main(String[] args) {
        //ボール用のInteger型ArrayList
        ArrayList<Integer> ball = new ArrayList<Integer>();
        //キーボード入力用オブジェクト
        Scanner scn = new Scanner(System.in);
        //キーボード入力用変数
        String input = "";
        //ボールの名前(BINGO)
        String moji;
        //ボールの番号
        int b;

        //１～７５番のボールを用意する
        for (int x = 1;x < 76;x++) {
            ball.add(x);
        }

        //最大、75回繰り返し
        for (int x = 1;x < 76;x++) {

            //回数表示
            System.out.print(x + "回目：");

            //入力待ち、"END"なら、繰り返し終了
            input = scn.nextLine().toUpperCase();
            if (input.equals("END")) {break;}

            //残っているボールから、一つをランダムに選択
            b = (int)(Math.random() * ball.size());

            //ボールの番号から、名前を選択
            if (ball.get(b) > 60) {
                moji = "Ｏ";
            } else if (ball.get(b) > 45) {
                moji = "Ｇ";
            } else if (ball.get(b) > 30) {
                moji = "Ｎ";
            } else if (ball.get(b) > 15) {
                moji = "Ｉ";
            } else {
                moji = "Ｂ";
            }

            //結果表示
            System.out.println(moji + "の" + ball.get(b));

            //ボールをArrayListから削除
            ball.remove(b);
        }
    }
}