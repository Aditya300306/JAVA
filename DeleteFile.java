import java.io.File;
class DeleteFile {
  public static void main(String[] args) {
    File f = new File("myfile.txt");
    if (f.delete())
      System.out.println("File deleted");
    else
      System.out.println("Delete failed");
  }
}
