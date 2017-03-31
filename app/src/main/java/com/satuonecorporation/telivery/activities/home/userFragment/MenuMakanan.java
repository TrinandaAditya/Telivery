package com.satuonecorporation.telivery.activities.home.userFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.satuonecorporation.telivery.R;


/**
 * Created by Voltric on 3/31/2017.
 */

public class MenuMakanan extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.menu_makanan, container, false);
        return myView;
    }
}
