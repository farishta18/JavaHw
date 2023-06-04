package class23;

public interface WebDriver{

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{
  @Override
   public void openBrowser(){
      System.out.println("The browser is open");
   }
    @Override
   public void closeBrowser(){
        System.out.println("The browser is close");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("The browser is maximize");
    }
    @Override
    public void findElement(){
        System.out.println("The browser is finding the elements");
    }
}
/*
Create a WebDriver Interface that will have the
following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */