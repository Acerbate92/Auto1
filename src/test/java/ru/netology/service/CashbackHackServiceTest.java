package ru.netology.service;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }
}