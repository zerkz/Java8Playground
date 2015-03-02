package com.zdware.ipvalidator;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class IPValidator {

    private static final Predicate<String> ipPredicate =
            Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$").asPredicate();

    /**
     * Validates an IPv4 address represented in the dotted decimal format (given in the example.
     * @param ip - An IPv4 dotted decimal address. (ex. 127.0.0.1)
     * @return true if valid, false if invalid.
     * NOTE: IPv4 addresses can come in octlet, hexadecimal, and decimal formats. This method does not support those formats.
     */
    public static boolean validateIP(String ip) {
        return ipPredicate.test(ip);
    }
}