package class22;
/*
Create a class File that will have the following behaviors: open, edit, close. Edit
and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will
 provide specific implementation of open behaviour: Example:
 to open .java file we need notepad++ or sublime text, to open
  .doc file we need Microsoft word to be installed etc.
 */
public abstract class File {
  private  String name;
    private double size;

    public File(String name, double size){
        this.name=name;
        this.size=size;
    }
abstract void open();
    void edit(){
        System.out.println("You can eidt");
    }

    void close(){
        System.out.println("You can close");
    }

    void prntInfo(){
        System.out.println(name+" "+size);
    }
}

class JavaFile extends File{
    public JavaFile(String name, double size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
    void edit(){
        System.out.println("You can eidt JavaFile");
    }

    void close(){
        System.out.println("You can close JavaFile");
    }
}

class WordFile extends File{
    public WordFile(String name, double size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
    void edit(){
        System.out.println("You can eidt WordFile");
    }

    void close(){
        System.out.println("You can close WordFile");
    }
}

class pdfFile extends File{
    public pdfFile(String name, double size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println("to open.pdfFile we need we need something");
    }
    void edit(){
        System.out.println("You can not eidt pdf");
    }

    void close(){
        System.out.println("You can close pdffile");
    }

    public static void main(String[] args) {
        File[] files={new JavaFile("Animal",5.6),
                new WordFile("Dog", 9.9),
                new pdfFile("Cat",8.9)};

        /*for(File file: File){
            file.prntInfo();
        }*/
    }
}

