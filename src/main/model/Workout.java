package model;

//represents a workout with a name, athlete comment, coach comment, and a list of exercises
//each exercise must have a unique name

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private String name;
    private String athleteComment;
    private String coachComment;
    private ArrayList<Exercise> exercises;

    public Workout() {
        this.name = "";
        this.athleteComment = "";
        this.coachComment = "";
        this.exercises = new ArrayList<>();
    }

    public Workout(String name) {
        this.name = name;
        this.athleteComment = "";
        this.coachComment = "";
        this.exercises = new ArrayList<>();
    }

    public Workout(String name, String coachComment) {
        this.name = name;
        this.athleteComment = "";
        this.coachComment = coachComment;
        this.exercises = new ArrayList<>();
    }

    //MODIFIES: this
    //EFFECTS: sets name of workout
    public void setName(String name) {
        this.name = name;
    }

    //MODIFIES: this
    //EFFECTS: sets athlete comment for workout
    public void setAthleteComment(String comment) {
        this.athleteComment = comment;
    }

    //MODIFIES: this
    //EFFECTS: sets coach comment of workout
    public void setCoachComment(String comment) {
        this.coachComment = comment;
    }

    //EFFECTS: returns name of workout
    public String getName() {
        return this.name;
    }

    //EFFECTS: returns athlete comment of workout
    public String getAthleteComment() {
        return this.athleteComment;
    }

    //EFFECTS: returns coach comment of workout
    public String getCoachComment() {
        return this.coachComment;
    }

    //EFFECTS: returns the list of exercises
    public List<Exercise> getExercises() {
        return this.exercises;
    }

    //MODIFIES: this
    //EFFECTS: add exercise with given name, sets, and reps to end of workout
    public void addExercise(String name, int sets, int reps, int weight) {
        Exercise exercise = new Exercise(name, sets, reps, weight);
        exercises.add(exercise);
    }

    //MODIFIES: this
    //EFFECTS: remove exercise from workout and return true, otherwise return false
    public boolean removeExercise(String name) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name)) {
                exercises.remove(exercise);
                return true;
            }
        }
        return false;
    }

    //EFFECTS: return the position of the exercise in the list, return -1 if exercise is not in list
    public int findExercise(String name) {
        int i = 0;
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name)) {
                i++;
                return i;
            }
            i++;
        }
        return -1;
    }

}