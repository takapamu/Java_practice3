class Math_ceil {
  public static void main(String[] args){
    // Math.cellは切り上げ

    System.out.println("Math.ceil(1.34) = " + Math.ceil(1.34));
    System.out.println("Math.ceil(-0.23) = " + Math.ceil(-0.23));
    System.out.println("Math.ceil(3.89) = " + Math.ceil(-3.89));

    System.out.println("-- --");
    // Math.floorは切り捨て
    System.out.println("Math.floor(1.34) = " + Math.floor(1.34));
    System.out.println("Math.floor(-0.23) = " + Math.floor(-0.23));
    System.out.println("Math.floor(-3.89) = " + Math.floor(-3.89));

    System.out.println("-- --");

    System.out.println("Math.round(4.49) = " + Math.round(4.49));
    System.out.println("Math.round(4.5) = " + Math.round(4.5));
  }
}
