package com.sip.gestibank.ui.carte;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CarteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CarteViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}