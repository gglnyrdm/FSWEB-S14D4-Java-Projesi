package com.workintech.abstraction.main;

import com.workintech.abstraction.rgb.Monster;
import com.workintech.abstraction.rgb.Troll;
import com.workintech.abstraction.rgb.Werewolf;

public class Console {
    public static void main(String[] args) {
        Monster troll = new Troll("troll", 500,40);
        System.out.println(troll.attack());

        Monster wereWolf = new Werewolf("wolf", 400,50);
        System.out.println(wereWolf.attack());
    }
}
