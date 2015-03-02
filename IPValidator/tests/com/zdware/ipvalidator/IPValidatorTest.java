package com.zdware.ipvalidator;

import junit.framework.TestCase;
import org.junit.Test;

public class IPValidatorTest extends TestCase {

    @Test
    public void testHome() throws Exception {
        TestCase.assertTrue("127.0.0.1 is a valid IPv4 dotted decimal address.", IPValidator.validateIP("127.0.0.1"));
    }

    @Test
    public void testWords() throws Exception {
        TestCase.assertFalse("thesearewords is a invalid IPv4 dotted decimal address.", IPValidator.validateIP("thesearewords"));
    }

    @Test
    public void testDecimals() throws Exception {
        TestCase.assertFalse("12331231 is a invalid IPv4 dotted decimal address.", IPValidator.validateIP("12331231"));
    }

    @Test
    public void testGoogleDNS() throws Exception {
        TestCase.assertTrue("8.8.8.8 is a valid IPv4 dotted decimal address.", IPValidator.validateIP("8.8.8.8"));
    }

    @Test
    public void testOver32Bit() throws Exception {
        TestCase.assertFalse("257.257.900.102 is a invalid IPv4 dotted decimal address.", IPValidator.validateIP("257.257.900.102"));
    }

    @Test
    public void testZeros() throws Exception {
        TestCase.assertTrue("0.0.0.0 is a valid IPv4 dotted decimal address.", IPValidator.validateIP("0.0.0.0"));
    }
}