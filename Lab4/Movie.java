public class Movie {
    String movieTitle;
    String Genre;
    float Duration;
    float Rating;

    void show(Movie mov){
        System.out.println(mov.movieTitle);
    }

    public static void main(String arg[]){
        int n = 3;
        Movie[] movie = new Movie[n];

        for(int i=0 ; i<n;i++){
            movie[i].movieTitle = "g ";
        }
        for(int i=0 ; i<n;i++){
            movie[i].show(movie[i]);
        }

    }
}
