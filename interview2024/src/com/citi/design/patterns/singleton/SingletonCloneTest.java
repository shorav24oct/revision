package com.citi.design.patterns.singleton;

public class SingletonCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException, InstantiationException {

        VoiceRecognizer voiceRecognizer1 = VoiceRecognizer.getInstance();
        voiceRecognizer1.recognize();

        VoiceRecognizer voiceRecognizer2 = (VoiceRecognizer) voiceRecognizer1.clone();
        voiceRecognizer2.recognize();
    }
}
