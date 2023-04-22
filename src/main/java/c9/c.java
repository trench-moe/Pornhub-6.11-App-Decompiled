package c9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: c  reason: collision with root package name */
    public Dialog f3865c;

    /* renamed from: f  reason: collision with root package name */
    public DialogInterface.OnCancelListener f3866f;

    /* renamed from: j  reason: collision with root package name */
    public Dialog f3867j;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3866f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f3865c;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f3867j == null) {
                Activity activity = getActivity();
                Objects.requireNonNull(activity, "null reference");
                this.f3867j = new AlertDialog.Builder(activity).create();
            }
            return this.f3867j;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
