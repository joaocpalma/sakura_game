package org.academiadecodigo.powerrangers.simplegfx.audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;

    public class Sound {
        Clip clip;
        URL mySoundList[] = new URL[10];

        public Sound() {

            mySoundList[0] = getClass().getResource("/start_music.WAV");
            mySoundList[1] = getClass().getResource("/PitcherPerfectTheme_Loopable.wav");
            mySoundList[2] = getClass().getResource("/DarkCavern.wav");
            mySoundList[3] = getClass().getResource("/falling.wav");
            mySoundList[4] = getClass().getResource("/flower.wav");
            mySoundList[5] = getClass().getResource("/jump.wav");


        }

        public void setFile(int i) {
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(mySoundList[i]);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            } catch (Exception e) {
            }
        }

        public void playMusic(int music) {

            setFile(music);
            play(music);
            loop();
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
