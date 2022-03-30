package jurnal.sorting;

public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    // constructor
    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }
    // untuk mencetak variabel yang diinginkan
    public double getRating() {

        return rating;
    }
    public String getName() {

        return name;
    }
    public int getYear() {

        return year;
    }


    @Override
    public int compareTo(Movie o) { // membandingkan film dengan menggunakan perbandingan tahun

        return this.getYear() - o.getYear();
    }
}
