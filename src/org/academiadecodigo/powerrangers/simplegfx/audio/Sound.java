package org.academiadecodigo.powerrangers.simplegfx.audio;

import org.academiadecodigo.powerrangers.simplegfx.gamemanager.Game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;

    public class Sound {
        Clip clip;
        URL[] mySoundList = new URL[10];
        File[] soundList = new File[100];



        public Sound() {

            soundList[0] = new File(Game.prefix+ "start_music.wav");
            soundList[1] = new File(Game.prefix+ "PitcherPerfectTheme_Loopable.wav");
            soundList[2] = new File(Game.prefix+ "DarkCavern.wav");
            soundList[3] = new File(Game.prefix+ "falling.wav");
            soundList[4] = new File(Game.prefix+ "flower.wav");
            soundList[5] = new File(Game.prefix+ "jump.wav");


        }

        public void setFile(int i) {
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundList[i]);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public void playMusic(int music) {

            setFile(music);
            play(music);
            //loop();
        }

        public void playSE(int music) {

            setFile(music);
            play(music);
        }

        public void stopMusic() {

            stop();
        }


        public void play(int music) {
            clip.start();
        }

        public void stop() {
            clip.stop();
        }

        public void loop() {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }
