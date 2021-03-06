package com.sip.gestibank.ui.assurance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AssuranceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AssuranceViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}