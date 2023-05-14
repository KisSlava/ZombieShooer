package com.zombieshooter;

import static com.zombieshooter.MyGG.SCR_HEIGHT;
import static com.zombieshooter.MyGG.SCR_WIDTH;


public class Stars extends SpaceObject {
    public Stars(float x, float y) {
        super(x, y, SCR_WIDTH, SCR_HEIGHT);
        vy = -2;
    }

    @Override
    void move() {
        super.move();
        if(outOfScreen()) {
            y = SCR_HEIGHT*3/2;
        }
    }
}
