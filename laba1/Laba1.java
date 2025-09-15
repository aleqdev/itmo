import java.util.Arrays;
import java.util.Random;

public class Laba1 {
  static short[] w = new short[19];
  static double[] x = new double[19];
  static double[][] l = new double[19][];

  public static void main(String[] args) {
    Random random = new Random();
    
    //short[] w = new short[19];
    //double[] x = new double[19];

    for (short i = 1; i <= 19; i++) {
      w[i-1] = i;
      x[i-1] = -3.0 + (7.0 - (-3.0)) * random.nextDouble();
    }

    //System.out.println(Arrays.toString(w));
    //System.out.println(Arrays.toString(x));

    for (var i = 0; i < 19; i++) {
      l[i] = new double[19];
      for (var j = 0; j < 19; j++) {
        l[i][j] = lElement(i, j);
      }
    }

    printMatrix();
  }

  static void printMatrix() {
    for (var i = 0; i < 19; i++) {
      for (var j = 0; j < 19; j++) {
        System.out.printf("%.4f ", l[i][j]);
      }
      System.out.println();
    }
  }

  static double lElement(int i, int j) {
    switch (w[i]) {
      case 14:
	return Math.atan(Math.cos(Math.asin(Math.sin(x[j]))));
      case 1:
      case 2:
      case 4:
      case 5:
      case 7:
      case 9:
      case 10:
      case 11:
      case 12:
	return Math.sin(Math.pow(Math.PI * (Math.cbrt(x[j]) + 1.0), 3.0));
      default:
	return Math.pow(
          (1.0 / 3.0) / (0.25 - Math.cbrt(Math.cos(Math.log(Math.abs(x[j]))))),
          2
        );
    }
  }
}
