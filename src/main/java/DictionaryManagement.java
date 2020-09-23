import sun.java2d.opengl.WGLSurfaceData;

import java.util.*;

public class DictionaryManagement {

    /**
     *
     */
    public static void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        int numWord = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numWord; i++) {
            String engWord = sc.nextLine();
            String vieWord = sc.nextLine();
            Word word = new Word(engWord, vieWord);
            Dictionary.words.add(word);
        }
//        sc.close();
    }

}
