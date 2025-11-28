import java.io.File;
class CreateFile {
  public static void main(String[] args) throws Exception {
    File f = new File("myfile.txt");
    if (f.createNewFile()) System.out.println("File created");
    else System.out.println("File exists");
  }
}
