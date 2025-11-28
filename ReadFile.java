import java.io.File;
import java.util.Scanner;
class ReadFile {
  public static void main(String[] args) throws Exception {
    File f = new File("myfile.txt");
    Scanner sc = new Scanner(f);
    while (sc.hasNextLine())
      System.out.println(sc.nextLine());
    sc.close();
  }
}
