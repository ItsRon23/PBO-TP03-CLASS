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
public class TP_MOD_03_1302223083_AARONJOSEPH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        albumClass_1302223083 album = new albumClass_1302223083();
        album.setTitle("Kayaknya HIts");
        album.setYear(2023);
        
        songClass_1302223083 song1 = new songClass_1302223083();
        song1.setTitle("Hello World");
        song1.setArtist(new String[] {"Alan Walker", "Torine"});
        song1.setDuration(171);
        
        songClass_1302223083 song2 = new songClass_1302223083();
        song2.setTitle("Film Favorit");
        song2.setArtist(new String[] {"Shiela on 7"});
        song2.setDuration(226);
        
        album.addSong(song1);
        album.addSong(song2);
        
        album.displayInfo();
    }
    
}
