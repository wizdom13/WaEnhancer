package com.wmods.wppenhacer.ui.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.wmods.wppenhacer.R;
import com.wmods.wppenhacer.ui.fragments.base.BasePreFragment;

public class GeneralFragment extends BasePreFragment {


    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        super.onCreatePreferences(savedInstanceState, rootKey);
        setPreferencesFromResource(R.xml.fragment_general, rootKey);
    }

}