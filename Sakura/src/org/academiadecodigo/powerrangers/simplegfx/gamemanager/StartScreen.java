package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StartScreen {

    private boolean isGameStarted = false;
    private boolean isGameStarted2 = false;

    private Picture gameStart;

    public StartScreen() {
      gameStart = new Picture(20, 20, "Sakura/media/Cover/Sakura_Game_-_Cover_+_Start__Frame_1_.jpg"); // mudar imagem
      gameStart.draw();


        // arranca com o som

    }

    public void deleteStartScreen() {
        gameStart.delete();
        isGameStarted = true;
    }

    public void setGameStarted(boolean gameStarted) {
        isGameStarted = gameStarted;
    }

    public void setGameStarted2(boolean gameStarted2) {
        isGameStarted2 = gameStarted2;
    }

    public boolean isGameStarted2() {
        return isGameStarted2;
    }

    public boolean isGameStarted() {
        return isGameStarted;
    }
}
