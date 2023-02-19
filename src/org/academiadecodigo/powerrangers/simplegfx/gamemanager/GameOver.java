package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameOver {
    private boolean isGameOver = false;
    private boolean isGameOver2 = false;

    private Picture gameOver;

    public GameOver() {
        gameOver = new Picture(0, 0, Game.prefix +"Game Over.jpg"); // mudar imagem
        gameOver.draw();


        // arranca com o som

    }

    public void deleteGameOver() {
        gameOver.delete();
        isGameOver = true;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public void setGameOver2(boolean gameOver2) {
        isGameOver2 = gameOver2;
    }

    public boolean isGameOver2() {
        return isGameOver2;
    }

    public boolean isGameOver() {
        return isGameOver;
    }
}
