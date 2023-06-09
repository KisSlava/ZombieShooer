package com.zombieshooter;

import static com.zombieshooter.MyGG.SCR_HEIGHT;
import static com.zombieshooter.MyGG.SCR_WIDTH;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class ScreenAbout implements Screen {
    MyGG gg;
    Texture imgBG;
    TextButton btnBack;
    String textAbout =  "Эта супр-игра создана\n" +
                        "в IT-школе Samsung\n" +
                        "на java под Android.\n\n" +
                        "Цель игры - сбивать\n" +
                        "самолётики.";

    public ScreenAbout(MyGG myGG) {
        gg = myGG;
        imgBG = new Texture("bg/cosmos05.jpg");
        btnBack = new TextButton(gg.fontLarge, "НАЗАД", 100);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // обработка касаний экрана
        if(Gdx.input.justTouched()) {
            gg.touch.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            gg.camera.unproject(gg.touch);

            if(btnBack.hit(gg.touch.x, gg.touch.y)) {
                gg.setScreen(gg.screenIntro);
            }
        }

        // события

        // отрисовка всей графики
        gg.camera.update();
        gg.batch.setProjectionMatrix(gg.camera.combined);
        gg.batch.begin();
        gg.batch.draw(imgBG, 0, 0, SCR_WIDTH, SCR_HEIGHT);
        gg.font.draw(gg.batch, textAbout, 100, 1100);
        btnBack.font.draw(gg.batch, btnBack.text, btnBack.x, btnBack.y);
        gg.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        imgBG.dispose();
    }
}
