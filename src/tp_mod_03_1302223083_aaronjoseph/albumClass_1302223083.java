/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_mod_03_1302223083_aaronjoseph;

/**
 *
 * @author Aaron
 */
public class albumClass_1302223083 {
    // attributes class album
    public String title;
    public int year;
    public songClass_1302223083[] songs = {};
    
    // define methods
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setSongs(songClass_1302223083[] songs){
        this.songs = songs;
    }
    
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }   
    
    // menambah lagu
    public void addSong(songClass_1302223083 song){
        songClass_1302223083[] newSongs = new songClass_1302223083[songs.length + 1];
        for (int i = 0; i < songs.length; i++){
            newSongs[i] = songs[i];
        }
        
        newSongs[songs.length] = song;
        songs = newSongs;
    }
   
    public void displayInfo(){
        System.out.println("-- Album info --");
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("-- Song List --");
        
        for (int i = 0; i < songs.length; i++){
            System.out.println((i + 1) + ". " + "Title : " + songs[i].getTitle() + "\n" + "Artist :");
            for (int j = 0; j < songs[i].getArtist().length; j++){
                System.out.println(" (" + (j + 1) + ")" + songs[i].getArtist()[j]);
            }
            System.out.println("Duration: " + songs[i].getDuration());
        }
    }

}
