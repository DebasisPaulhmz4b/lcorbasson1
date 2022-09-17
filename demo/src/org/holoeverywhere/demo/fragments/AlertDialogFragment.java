
package org.holoeverywhere.demo.fragments;

import org.holoeverywhere.app.AlertDialog;
import org.holoeverywhere.app.Dialog;
import org.holoeverywhere.demo.R;
import org.holoeverywhere.sherlock.SDialogFragment;

import android.os.Bundle;

public class AlertDialogFragment extends SDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("AlertDialog");
        builder.setIcon(R.drawable.alert_dialog);
        builder.setMessage("Is fully-working port of AlertDialog from Android Jelly Bean\n"
                + "Yes, I know it's a long text. At the same time check that part.");
        builder.setPositiveButton("Positive", null);
        builder.setNegativeButton("Negative", null);
        builder.setNeutralButton("Neutral", null);
        return builder.create();
    }
}
