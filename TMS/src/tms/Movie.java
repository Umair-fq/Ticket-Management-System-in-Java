/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;

/**
 *
 * @author raoaw
 */
public class Movie {

    public Movie(String movieid, String title, String genere, String tickets, String price, String starttime, String runtime) {
        this.movieid = movieid;
        this.title = title;
        this.genere = genere;
        this.tickets = tickets;
        this.price = price;
        this.starttime = starttime;
        this.runtime = runtime;
    }
    
    private String movieid;
    private String title;
    private String genere;
    private String tickets;
    private String price;
    private String starttime;
    private String runtime;

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
  
   
}
