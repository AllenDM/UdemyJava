package com.allenmoody;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

      byte newByte = 100;
      short newShort = 2000;
      int newInt = 300000;
      long newLong = 50000L + (10L * (newByte + newShort + newInt));
      System.out.println(newLong);
    }
}
