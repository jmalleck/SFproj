package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.TimerTask;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    Sprite doc;
    private TimerTask time;
    private String clock;
    BitmapFont font;
	String seconds;

	@Override
	public void create () {
        font = new BitmapFont();
		batch = new SpriteBatch();
		img = new Texture("drmario2.jpg");
        doc = new Sprite(img);
        doc.setPosition(Gdx.graphics.getWidth()/2 - img.getWidth()/2,
                        Gdx.graphics.getHeight()/2 - img.getHeight()/2);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(doc, doc.getX(), doc.getY());
        clock = "time: " + time;
        font.setColor(1.0f, 1.0f, 1.0f, 1.0f);
        font.draw(batch, clock, 25, 100);
		batch.end();
    }
}
