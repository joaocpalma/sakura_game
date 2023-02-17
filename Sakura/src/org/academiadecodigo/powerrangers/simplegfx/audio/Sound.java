package org.academiadecodigo.powerrangers.simplegfx.audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

    public class Sound {

        Clip clip;
        URL soundURL[] = new URL[15];

        public Sound() {

            soundURL[0] = getClass().getResource("/sounds/StartMenu.wav");
            soundURL[1] = getClass().getResource("/sounds/.wav");
            soundURL[2] = getClass().getResource("/sounds/.wav");
            soundURL[3] = getClass().getResource("/sounds/.wav");
            soundURL[4] = getClass().getResource("/sounds/.wav");
            soundURL[5] = getClass().getResource("/sounds/SimplyTheBest.wav");
            soundURL[6] = getClass().getResource("/sounds/.wav");
            soundURL[7] = getClass().getResource("/sounds/SeeYouAgain.wav");
            soundURL[8] = getClass().getResource("/sounds/DarkHallway.wav");
            soundURL[9] = getClass().getResource("/sounds/.wav");
            soundURL[10] = getClass().getResource("/sounds/.wav");
            soundURL[11] = getClass().getResource("/sounds/LoseGoofy.wav");



        }

        public void setFile(int i) {
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundURL[i]);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            } catch (Exception e) {
            }
        }

        public void playMusic(int i) {

            setFile(i);
            play(i);
            loop();
        }

        public void playSE(int i) {

            setFile(i);
            play(i);
        }

        public void stopMusic() {

            stop();
        }


        public void play(int i) {
            clip.start();
        }

        public void stop() {
            clip.stop();
        }

        public void loop() {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }
