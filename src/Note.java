import java.util.Vector;

/**
 * Created by Frédéric on 06/12/2014.
 */
public class Note {

    import java.io.*;
    import java.util.Vector;

    private String nom;
    private int octave;

    private Vector<onde> ondes;

    private float duree;

//constructeurs

    //constructeur complet
    Note (String nom, int octave,Vector ondes,float duree){
        this.nom = nom;
        this.octave = octave;
        this.ondes=ondes;
        this.duree = duree;
    }

    //constructeur avec notes vides
    Note (String nom, int octave,float duree){
        this.nom = nom;
        this.octave = octave;
        this.duree = duree;
    }
    //constructeur sans durée
    Note (String nom, int octave){
        this.nom = nom;
        this.octave = octave;
    }

//getters setters
    public String getNom(){
        return this.nom;
    }
    public int getOctave(){
        return this.octave;
    }
    public Vector getOndes(){
        return this.ondes;
    }
    public float getDuree(){
        return this.duree;
    }

    public String setNom(String nom){
        this.nom = nom;
        return this.nom;
    }
    public int setOctave(int octave){
        this.octave=octave;
        return this.octave;
    }
    public Vector setOndes (Vector ondes){
        this.ondes=ondes;
        return this.ondes;
    }
    public float setDuree(float duree){
        this.duree=duree;
        return this.duree;
    }






}
