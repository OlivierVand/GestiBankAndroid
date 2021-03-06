package com.sip.gestibank.ui.assurance;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sip.gestibank.R;


public class AssuranceFragment extends Fragment {

    private AssuranceViewModel assuranceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        assuranceViewModel = new ViewModelProvider(this).get(AssuranceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_assurance, container, false);

        return root;
        //  }
    }
}