 class Math_toRadians {
 public static void main(String[] args) {
    double angdeg = 30;

    System.out.println(Math.PI / (180 / angdeg));
    System.out.println(Math.toRadians(angdeg));

    double angrad = Math.toRadians(angdeg);

    System.out.println(180 * angrad / Math.PI);
    System.out.println(Math.toDegrees(angrad));
  }
}
