package com.citi.design.patterns.singleton;

public class VoiceRecognizer extends Device implements Cloneable {

    private static VoiceRecognizer instance;

    private VoiceRecognizer() throws InstantiationException {
        if (instance != null)
            throw new InstantiationException("object already present");
    }

    public static VoiceRecognizer getInstance() throws InstantiationException {
        if (instance == null) {
            synchronized (VoiceRecognizer.class) {
                if (instance == null) {
                    instance = new VoiceRecognizer();
                }
            }
        }
        return instance;
    }

    public void recognize() {
        System.out.println("Voice recognizer " + this.hashCode());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning is not supported");
    }

    public Object readResolve() {
        if (instance == null) {
            instance = this;
        }
        return instance;
    }
}
