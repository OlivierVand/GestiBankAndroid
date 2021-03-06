package com.sip.gestibank.ui.virement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sip.gestibank.R;

public class VirementFragment extends Fragment {


    private VirementViewModel virementViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        virementViewModel = new ViewModelProvider(this).get(VirementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_virement, container, false);

        return root;
        //  }
    }
}