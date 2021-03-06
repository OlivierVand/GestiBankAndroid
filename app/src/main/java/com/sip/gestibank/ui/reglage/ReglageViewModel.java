package com.sip.gestibank.ui.reglage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReglageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReglageViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}