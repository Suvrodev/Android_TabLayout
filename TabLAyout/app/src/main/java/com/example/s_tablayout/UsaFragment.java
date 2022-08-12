package com.example.s_tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;


public class UsaFragment extends Fragment {

    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_usa, container, false);

        textView=view.findViewById(R.id.tv_id);

        getParentFragmentManager().setFragmentResultListener("okk", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String data=result.getString("strr");
                textView.setText(data);
                Toast.makeText(getContext(),data,Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}