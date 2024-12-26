package org.DesignPatterns.BuilderDesignPattern;

public class PhoneFactory {
    String processor;
    String harddisc;
    String os;

    public String getOs() {
        return this.os;
    }

    public String getProcessor() {
        return this.processor;
    }

    public String getHarddisc() {
        return this.harddisc;
    }

    public PhoneFactory setOs(String os) {
        this.os = os;
        return this;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public PhoneFactory setHarddisc(String harddisc) {
        this.harddisc = harddisc;
        return this;
    }

    @Override
    public String toString() {
        return "PhoneFactory{" +
                "processor='" + processor + '\'' +
                ", harddisc='" + harddisc + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
