package com.oocl.zach.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SHAZA on 6/5/2017.
 */
public class TennisScoreTest {

    @Test
    public void GIVEN_same_less_then_three_WHEN_get_score_THEN_get_score_all() {
        assertEquals("Love All",TennisScore.GetTennisScore(0,0));
        assertEquals("Thirty All",TennisScore.GetTennisScore(2,2));

    }

    @Test
    public void GIVEN_different_less_then_three_WHEN_get_score_THEN_get_score() {
        assertEquals("Fifteen Love",TennisScore.GetTennisScore(1,0));
    }

    @Test
    public void GIVEN_same_greater_then_or_equal_to_three_WHEN_get_score_THEN_get_score_deuce() {
        assertEquals("Deuce",TennisScore.GetTennisScore(3,3));
        assertEquals("Deuce",TennisScore.GetTennisScore(4,4));

    }

    @Test
    public void GIVEN_different_greater_then_or_equal_to_three_and_max_is_three_WHEN_get_score_THEN_get_score_advanced() {
        assertEquals("Forty Fifteen",TennisScore.GetTennisScore(3,1));
        assertEquals("Thirty Forty",TennisScore.GetTennisScore(2,3));

    }

    @Test
    public void GIVEN_different_greater_then_or_equal_to_three_WHEN_get_score_THEN_get_score_advanced() {
        assertEquals("Server Advanced",TennisScore.GetTennisScore(4,3));
        assertEquals("Receiver Advanced",TennisScore.GetTennisScore(3,4));

    }

    @Test
    public void GIVEN_different_greater_then_or_equal_to_three_WHEN_get_score_THEN_get_score_win() {
        assertEquals("Receiver Win",TennisScore.GetTennisScore(2,4));
        assertEquals("Server Win",TennisScore.GetTennisScore(4,1));

    }
}