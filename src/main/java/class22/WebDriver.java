package class22;

public abstract class WebDriver {
    abstract void openBrowser();

  abstract   void loadUr(String url);

  abstract   void performTesting();

   abstract void closeBrowser();

}

class ChromeDriver extends WebDriver{
    @Override
    void openBrowser(){
        System.out.println("opening Google Chrome ");
    }

    @Override
    void loadUr(String url) {

    }

    @Override
    void performTesting() {

    }

    @Override
    void closeBrowser() {

    }


}