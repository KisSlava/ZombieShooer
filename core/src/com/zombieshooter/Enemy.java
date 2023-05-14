package com.zombieshooter;

import static com.zombieshooter.MyGG.SCR_HEIGHT;
import static com.zombieshooter.MyGG.SCR_WIDTH;

import com.badlogic.gdx.math.MathUtils;

public class Enemy extends SpaceObject{
    public Enemy() {
        super(0, 0, 100, 100);
        x = MathUtils.random(width/2, SCR_WIDTH-width/2);
        y = MathUtils.random(SCR_HEIGHT+height, SCR_HEIGHT*2);
        vy = MathUtils.random(-6f, -3);
    }

    @Override
    boolean outOfScreen() {return y < -height/2;
    }
}
