package me.chongfeng.spring.ioc.annotation.autowire.instrument;
public class Violin implements Instrument {
    public Violin() {}

    public void play() {
        System.out.println("弹奏小提琴");
    }
}
