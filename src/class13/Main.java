package class13;

public class Main {

    String censorLetter(String word, char achar){
        System.out.println(word.replace("e","*"));
        //System.out.println(achar.replace('t',"*"));
        return word;
    }

    public static void main(String[] args){
        Main obj=new Main();
        String word="computer science";
        char achar='*';
        obj.censorLetter(word,achar);

    }

}


