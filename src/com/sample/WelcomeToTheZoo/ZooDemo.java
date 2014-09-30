package com.sample.WelcomeToTheZoo;

/**
 * Created by BFineRocks on 9/29/14.
 */
public class ZooDemo {

    public static ZooKeeper aZooKeeper;

    public static void main(String[] args) {
        aZooKeeper = new ZooKeeper();

        aZooKeeper.welcome();
        aZooKeeper.zooOptions();
    }


}
