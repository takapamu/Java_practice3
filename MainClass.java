import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JFrame;

public class MainClass extends JFrame {
  private final static int WINDOW_SIZE = 300;
  private final static int MOLE_SIZE = 50;
  private final static int GAME_END_COUNT = 20;

  private int score = 0;
  private int counter = 0;
  private int mole_x;
  private int mole_y;
  private boolean mole_hit = false;

  public static void main(String[] args){
    new MainClass();
  }

  public MainClass(){
    setSize(WINDOW_SIZE,WINDOW_SIZE);
  }

  //リスナー
  GameMouseAdapter adapter = new GameMouseAdapter();
  addMouseListener(adapter);

  setVisible(true);

  Timer t = new Timer();
  t.schedule(new GameTimeTask(), 1000l, 1000l);
}
