package optional;

import java.util.Optional;

/**
 * OptionalString
 */
public class OptionalString {

    public static void main(String[] args) {
        Optional<String> optionalVal = Optional.of("Testing Optional");
        if (optionalVal.isPresent()) {
            String val = optionalVal.get();
            System.out.println(val);
        }
        else {
            System.out.println("String is null");
        }

        Optional<String> emptyString = Optional.empty();
        String res = emptyString.orElse("Substitute");
        System.out.println(res);

        String temp = "Test Opt";
        Optional<String> str = Optional.ofNullable(temp);
        String s = str.orElseGet(() -> "Default Value");
        System.out.println(s);

        String temp1 = null;
        Optional<String> str1 = Optional.ofNullable(temp1);
        String s1 = str1.orElseGet(() -> "Default Value2");
        System.out.println(s1);

    }
}