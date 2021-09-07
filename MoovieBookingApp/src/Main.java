import com.theater.moviemanagement.entity.Movie;
import com.theater.moviemanagement.entity.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie("Khoon Bhari Maang");
		User user = new User(1, "Shubhra");
		user.bookMovieTicket(movie, 15);
		user.bookMovieTicket(movie, 15);
		user.bookMovieTicket(movie, 15);
	}

}
