package uc;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class h extends DialogFragment {

    /* renamed from: c  reason: collision with root package name */
    public Intent f15844c;

    /* renamed from: f  reason: collision with root package name */
    public final DialogInterface.OnClickListener f15845f = new a();

    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                h.this.getActivity().startActivity(h.this.f15844c);
            } catch (ActivityNotFoundException unused) {
                new i().show(h.this.getActivity().getFragmentManager(), "InstallCardboardDialog");
            }
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15844c = (Intent) getArguments().getParcelable("intent");
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(uc.a.a("DIALOG_TITLE")).setMessage(uc.a.a("DIALOG_MESSAGE_SETUP")).setPositiveButton(uc.a.a("SETUP_BUTTON"), this.f15845f).setNegativeButton(uc.a.a("CANCEL_BUTTON"), (DialogInterface.OnClickListener) null);
        return builder.create();
    }
}
