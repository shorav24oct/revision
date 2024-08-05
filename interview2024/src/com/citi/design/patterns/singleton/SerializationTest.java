package com.citi.design.patterns.singleton;

import java.io.*;
import java.nio.file.Files;

public class SerializationTest {
    private static final String file = "d://voiceRecognizer.ser";

    public static void main(String[] args) {
        /*
         * VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
         *
         * serialize(voiceRecognizer, file);
         */

        VoiceRecognizer voiceRecognizer1 = deSerialize(file);
        voiceRecognizer1.recognize();

        VoiceRecognizer voiceRecognizer2 = deSerialize(file);
        voiceRecognizer2.recognize();

    }

    public static void serialize(VoiceRecognizer voiceRecognizer, String file) {
        try (ObjectOutputStream stream = new ObjectOutputStream(Files.newOutputStream(new File(file).toPath()))) {
            stream.writeObject(voiceRecognizer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static VoiceRecognizer deSerialize(String file) {
        VoiceRecognizer voiceRecognizer = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(new File(file).toPath()))) {
            voiceRecognizer = (VoiceRecognizer) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return voiceRecognizer;
    }
}
