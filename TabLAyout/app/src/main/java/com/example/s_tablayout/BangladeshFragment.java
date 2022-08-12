package com.example.s_tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class BangladeshFragment extends Fragment {


    Button Send;
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_bangladesh, container, false);


        Send=view.findViewById(R.id.send_id);
        editText=view.findViewById(R.id.edit_text_id);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text=editText.getText().toString();
                Toast.makeText(getContext(),Text,Toast.LENGTH_SHORT).show();

                Bundle bundle=new Bundle();
                bundle.putString("strr",Text);

                getParentFragmentManager().setFragmentResult("okk",bundle);
            }
        });

        return view;
    }
}