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
public class songClass_1302223083 {
    // attribute class songs
    public String title;
    public String[] artist;
    int duration;
    
    // define methods
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String[] artist){
        this.artist = artist;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    public String getTitle(){
        return title;
    }
    public String[] getArtist(){
        return artist;
    }
    
    // merubah duration dari bentuk 1 int jadi bentuk MM:SS
    public String getDuration(){
        int Min = duration / 60;
        int Sec = duration % 60;
        
        String Duration = String.format("%02d:%02d", Min, Sec);
        return Duration;
    }
}
