package com.IhsanA_10120077_IF2.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.IhsanA_10120077_IF2.view.activity.MainActivity;
import com.IhsanA_10120077_IF2.R;

/**
 * NAMA    : Mohammad Noor Ihsan Akbar
 * NIM     : 10120077
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */
public class ProfileFragment extends Fragment {

    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar().hide();
    }
}

/**
 * NAMA    : Mohammad Noor Ihsan Akbar
 * NIM     : 10120077
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */