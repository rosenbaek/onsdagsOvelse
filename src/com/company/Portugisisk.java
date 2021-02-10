package com.company;

public class Portugisisk implements Dialog {

    private String s = "portuguise";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "pressione q para parar ";
    }

    @Override
    public String selectedLanguage() {
        return "o idioma selecionado é: ";
    }
}
