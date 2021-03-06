package com.sip.gestibank.ui.virement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VirementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VirementViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}