/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;

/**
 *
 * @author raoaw
 */
public class Record {
    private String name;
    private String email;
    private MovieBooking movie;

    public Record(String name, String email, MovieBooking movie) {
        this.name = name;
        this.email = email;
        this.movie = movie;
    }

    public MovieBooking getMovie() {
        return movie;
    }

    public void setMovie(MovieBooking movie) {
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
