package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.monteirodev.popularmovies.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    private ArrayAdapter mMoviesAdapter;

    public MoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movies, container, false);


        // Create some dummy data for the ListView.  Here's a sample weekly forecast
        String[] data = {
                "Batman v Superman: Dawn of Justice",
                "The Legend of Tarzan",
                "Star Trek Beyond",
                "Independence Day: Resurgence",
                "Interstellar",
                "Ice Age: Collision Course"
        };
        List<String> moviesData = new ArrayList<String>(Arrays.asList(data));

        mMoviesAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_movie,
                R.id.movie_title_textView,
                moviesData);
        ListView mListView = (ListView) rootView.findViewById(R.id.list_view);
        mListView.setAdapter(mMoviesAdapter);


        return rootView;
    }

}
