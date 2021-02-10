package com.company;

public class Russisk implements Dialog{

    private String s = "russian";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "нажмите q, чтобы остановить  ";
    }

    @Override
    public String selectedLanguage() {
        return "выбранный язык:  ";
    }
}
