package com.oocl.zach.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.abs;
import static java.lang.Math.max;

/**
 * Created by SHAZA on 6/5/2017.
 */
public class TennisScore {
    public static String GetTennisScore(int server_score, int receiver_score) {
        String[] score_array = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        String[] condition_array = new String[]{"All", "Deuce", "Advanced", "Win"};
        String[] ahead_side_array = new String[]{"Server","Receiver"};
        String result = "";
        if (server_score < 3 && receiver_score < 3) {
            if (server_score == receiver_score) {
                result = score_array[server_score] + " " + condition_array[0];
                return result;
            } else {
                result = score_array[server_score] + " " + score_array[receiver_score];
                return result;
            }
        } else {
            if (server_score == receiver_score) {
                result = condition_array[1];
                return result;
            } else if (max(server_score, receiver_score) == 3) {
                result = score_array[server_score] + " " + score_array[receiver_score];
                return result;
            } else if (abs(server_score - receiver_score) == 1) {
                if(server_score>receiver_score){
                    result = ahead_side_array[0]+" "+condition_array[2];
                    return result;
                }else{
                    result = ahead_side_array[1]+" "+condition_array[2];
                    return result;
                }
            }else if(abs(server_score - receiver_score) >= 2){
                if(server_score>receiver_score){
                    result = ahead_side_array[0]+" "+condition_array[3];
                    return result;
                }else{
                    result = ahead_side_array[1]+" "+condition_array[3];
                    return result;
                }
            }
        }
        return null;
    }
}
