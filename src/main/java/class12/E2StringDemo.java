package class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String userName="Admin";
        String password="pass123";
        /*Break down your project into smaller tasks
        Use comments to help you remember what your code is doing
        Test your code often to make sure it's working as intended
        Don't be afraid to ask for help when you need it
        Use version control, like Git, to keep track of changes in your code

        These are just a few tips, but there are many more out there!*/
        if (userName.length()>8 && password.length()>8){
            System.out.println("Sign up successful");
        }else {
            System.out.println("userName and password can't be more then 8 characters ");
        }
    }
}
