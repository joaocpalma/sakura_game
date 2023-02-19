package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Mcs;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Moob;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import java.util.LinkedList;


public class Background {

        //propriedades
        private Hero hero;
        private LinkedList<Mcs> mc;
        public LinkedList<Flower> flower;
        private LinkedList<Moob> moob;
        private Rectangle background;

        //construtor
        public Background() {

            background = new Rectangle(0, 0, 1030, 1000);
            flower = new LinkedList<>();
            //moob = new LinkedList<>();
           // mc = new LinkedList<>();

        }

        public void init(){

            background.draw();
            setFlowers();
            //setMoobs();
            //setMcs();

        }
        public void setFlowers() {
            flower.add(new Flower(60,640,Game.prefix +"flower.png"));


        }




    }



