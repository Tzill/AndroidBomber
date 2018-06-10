package com.geekbrains.game;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Shadow {
    private transient TextureRegion shadowTexture;
    private Vector2 position;
    private static final Shadow ourInstance = new Shadow();

    public static Shadow getInstance() {
        return ourInstance;
    }

    private Shadow() { }

    public void init(GameScreen gs){
        this.shadowTexture = Assets.getInstance().getAtlas().findRegion("shadow");
        position = gs.getPlayer().getPosition();
    }

    public void render(SpriteBatch batch) {
        batch.draw(shadowTexture, position.x - 1280 , position.y - 720);
    }

    public void update(Vector2 position) {
        this.position = position;
    }
}
