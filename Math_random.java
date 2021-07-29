class Math_random {
  public static void main(String[] args){
    for(int i = 0; i < 10; i++){
      System.out.println((int)Math.ceil(Math.random() * 5) + 5);
    }
  }
}
