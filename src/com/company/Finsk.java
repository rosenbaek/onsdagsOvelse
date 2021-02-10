package com.company;

public class Finsk implements Dialog
{

        private String s = "Finnish";

        @Override
        public String getLanguage() {
            return s;
        }

        @Override
        public String quit() {
            return "lopeta painamalla q";
        }

        @Override
        public String selectedLanguage() {
            return "valittu kieli on: ";
        }
}
