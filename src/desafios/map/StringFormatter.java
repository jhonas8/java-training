<<<<<<< HEAD
package desafios.map;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public interface StringFormatter {

    static @NotNull String reverse(@NotNull String str) {
        StringBuilder finalString= new StringBuilder();

        for(int i=(str.length()-1); i>=0;i--) {
            finalString.append(str.charAt(i));
        }
        System.out.println(finalString);
        return finalString.toString();
    }
}
=======
package desafios.map;


import java.util.ArrayList;

public interface StringFormatter {

    static String reverse(String str) {
        StringBuilder finalString = new StringBuilder();

        for(int i=(str.length()-1); i>=0;i--) {
            finalString.append(str.charAt(i));
        }

        return finalString.toString();
    }
}
>>>>>>> remotes/origin/main
