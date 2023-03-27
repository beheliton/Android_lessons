package ru.mirea.hairzamanovrafaelrustemovich.dialog;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog dialog = new ProgressDialog(requireContext());
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Title");
        dialog.setMessage("Message");
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }
}