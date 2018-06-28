package masterung.androidthai.in.th.srrufriend.fragment;

import android.icu.text.Replaceable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import masterung.androidthai.in.th.srrufriend.R;

public class MaigFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Register Controller

        TextView textVieW = getView().findViewById(R.id.txtNewRegister);
        textVieW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Replaceable Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMaintFragment,new RegisterFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

    } // Main Method

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container, false);
        return view;
    }
} // Main Class
