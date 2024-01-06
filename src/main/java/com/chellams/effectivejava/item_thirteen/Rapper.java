package com.chellams.effectivejava.item_thirteen;

public class Rapper implements LyricistSinger {
    @Override
    public void writeLyrics() {
        System.out.println("Writing lyrics");
    }

    @Override
    public void sing() {
        System.out.println("Singing");
    }
}
