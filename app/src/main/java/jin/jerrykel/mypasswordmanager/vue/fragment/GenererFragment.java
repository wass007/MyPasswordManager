package jin.jerrykel.mypasswordmanager.vue.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;

import jin.jerrykel.mypasswordmanager.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GenererFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GenererFragment extends Fragment {

    //FOR DESIGN
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static String pageTitle="Generer";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public static GenererFragment newInstance() {
        return (new GenererFragment());
    }

    public static String getStringTile() {
        return pageTitle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_generer, container, false);
    }
    public GenererFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GenererFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GenererFragment newInstance(String param1, String param2) {
        GenererFragment fragment = new GenererFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


}