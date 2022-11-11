package uk.ac.tees.W9581934.Admin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import uk.ac.tees.W9581934.R;
import uk.ac.tees.W9581934.databinding.FragmentAdminHomeBinding;


public class AdminHomeFragment extends Fragment {

    FragmentAdminHomeBinding binding=FragmentAdminHomeBinding.inflate(getLayoutInflater());



    public AdminHomeFragment() {
        // Required empty public constructor
    }


    public static AdminHomeFragment newInstance(String param1, String param2) {
        AdminHomeFragment fragment = new AdminHomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_home, container, false);

    }
}