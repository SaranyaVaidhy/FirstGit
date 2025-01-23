package org.junitsample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({junit3.class,ClassA.class,ClassB.class})

public class Exsuit {
//to run multiple class at time-Suit
}
