package com.demo.immutable;

public final class MyImmutable {

    private final byte[] value;
    public MyImmutable () {
        this.value = new byte[0];
    }
    public MyImmutable (MyImmutable original) {
        this.value = original.value;
    }
    public MyImmutable toMyImmutable() {
        return this;
    }
}

class ImmutableDemo {
    public static void main(String[] args) {
        MyImmutable x = new MyImmutable();
        System.out.println(x.hashCode());
        MyImmutable x1 = new MyImmutable();
        System.out.println(x1.hashCode());
    }
}