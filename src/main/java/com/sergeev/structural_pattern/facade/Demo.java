package main.java.com.sergeev.structural_pattern.facade;

import main.java.com.sergeev.structural_pattern.facade.example_facade.VideoConversionFacade;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.mp4", "ogg");
    }
}
