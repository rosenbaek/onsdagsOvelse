package com.company;

import java.util.HashMap;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public Sprog() {


        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("eng", new English());
        dialoger.put("sw", new Svensk());
        dialoger.put("po", new Portugisisk());

    }
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
}
