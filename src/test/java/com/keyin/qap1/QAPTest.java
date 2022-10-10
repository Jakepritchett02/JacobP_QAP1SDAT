package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QAPTest {

    @Test
    public void QAPexampleTest(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.findsquenceInWord("find", "is_find_in_this_char_sequence?"));

        Assertions.assertFalse(qapExample.findsquenceInWord("Hello_World", "is_find_in_this_char_sequence?"));

    }
}
