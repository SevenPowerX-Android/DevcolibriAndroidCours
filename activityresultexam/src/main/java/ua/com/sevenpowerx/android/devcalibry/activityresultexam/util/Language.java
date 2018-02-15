package ua.com.sevenpowerx.android.devcalibry.activityresultexam.util;

/**
 * Created by Лавринюк Андрей User notebook acer  on 15.02.2018.
 */

public enum Language {
    ENGLISH("Английский"),
    RUSSIAN("Руский"),
    UKRAINE("Украинский");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
