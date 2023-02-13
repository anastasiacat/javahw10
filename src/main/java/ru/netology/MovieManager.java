package ru.netology;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addNewMovie(String movie) {
        String[] tmp = new String[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int sizeOfArray = Math.min(movies.length, limit);
        String[] tmp = new String[sizeOfArray];

        int tmpIndex = 0;
        for (int i = movies.length - 1; i >= movies.length - sizeOfArray; i--) {
            tmp[tmpIndex++] = movies[i];
        }
        return tmp;
    }
}
