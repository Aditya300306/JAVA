import java.io.FileWriter;
class WriteFile {
  public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("myfile.txt");
    fw.write("Hello World!");
    fw.close();
  }
}
