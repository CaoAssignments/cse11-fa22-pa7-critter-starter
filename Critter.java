/*
 * Name: CSE 11 TAs and Tutors
 * PID: N/A
 * Email: N/A
 * References: N/A
 * 
 * Contains enums and abstract class that defines a Critter object
 * DO NOT MODIFY THIS FILE
 */

import java.awt.Color;
import java.util.Random;

/**
 * an abstract class defining all the possible methods
 * that can be called on a Critter.
 */
public abstract class Critter {
    protected int level = 0;
    protected String displayName;
    protected Random random = new Random(System.currentTimeMillis());
    protected CritterInfo info;

    /**
     * Called when an object of Critter is created.
     * 
     * @param name the display name of this critter.
     */
    public Critter(String name) {
        this.displayName = name;
    }

    /**
     * Returns the level of this Critter.
     * 
     * @return level.
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Updates the level of the critter by num.
     * 
     * @param num the amount of increments.
     */
    protected void incrementLevel(int num) {
        level = level + num;
    }

    /**
     * Returns the display name of this critter.
     * 
     * @return display name.
     */
    @Override
    public final String toString() {
        return this.displayName;
    }

    /**
     * called when you win a fight against another animal.
     */
    public void win() {}

    /**
     * called when you lose a fight against another animal, and die.
     */
    public void lose() {}

    /**
     * called when your animal is put to sleep for eating too much food.
     */
    public void sleep() {}

    /**
     * called when your animal wakes up from sleeping.
     */
    public void wakeup() {}

    /**
     * called to move in a certain direction.
     * 
     * @return the direction
     */
    abstract public Direction getMove();

    /**
     * Returns whether the critter wants to eat the encountered food or not.
     * 
     * @return not to eat by default
     */
    public boolean eat(){
        return false; 
    }

    /**
     * called when the game world is reset.
     */
    public void reset() {}

    /**
     * called when your critter mates with another critter.
     */
    public void mate() {}

    /**
     * called when your critter is done mating with another critter.
     */
    public void mateEnd() {
    }

    /**
     * called when getting the color of your critter.
     * 
     * @return black color
     */
    public Color getColor() {
        return Color.BLACK;
    }

    /**
     * Returns the type of attack that the fighting critter uses. 
     * 
     * @param opponent the encountered critter
     * @return forfeit by default
     */
    public Attack getAttack(String opponent){
        return Attack.FORFEIT;
    }

    /**
     * Sets the CritterInfo to be the given value.
     * 
     * @param info the updated critter info.
     */    
    public void setCritterInfo(CritterInfo info) {
        this.info = info;
    }

    /**
     * defines all possible directions that a Critter can move.
     */
    enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST,
        CENTER
    }

    /**
     * defines all possible attacks that a Critter can fight.
     */
    enum Attack {
        POUNCE,
        ROAR,
        SCRATCH,
        FORFEIT
    }
}