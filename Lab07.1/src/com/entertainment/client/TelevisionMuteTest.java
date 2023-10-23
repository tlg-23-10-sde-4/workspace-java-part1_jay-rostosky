package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);  // toString() automatically called

        tv.mute();  // mute it
        System.out.println(tv);

        tv.mute();  // unmute it -> volume should be back to 32
        System.out.println(tv);

        tv.mute();  // mute it again
        tv.setVolume(50);  // should automatically unmute, and volume is now 50
        System.out.println(tv);
    }
}