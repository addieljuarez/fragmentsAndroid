package work.addiel.fragmentsandroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link segundoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link segundoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class segundoFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_segundo, container, false);
    }

}
