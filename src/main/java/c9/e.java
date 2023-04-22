package c9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3872c = new Object();
    public static final e d = new e();

    @Override // c9.f
    public Intent a(Context context, int i10, String str) {
        return super.a(context, i10, str);
    }

    @Override // c9.f
    public int c(Context context, int i10) {
        return super.c(context, i10);
    }

    public int d(Context context) {
        return c(context, f.f3876a);
    }

    public boolean e(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog f10 = f(activity, i10, new h9.x(super.a(activity, i10, "d"), activity, i11), onCancelListener);
        if (f10 == null) {
            return false;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog f(Context context, int i10, h9.z zVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(h9.w.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(17039370) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, zVar);
        }
        String c10 = h9.w.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final void g(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.o) {
                androidx.fragment.app.y u2 = ((androidx.fragment.app.o) activity).u();
                j jVar = new j();
                h9.o.i(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                jVar.D0 = dialog;
                if (onCancelListener != null) {
                    jVar.E0 = onCancelListener;
                }
                jVar.Q0(u2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        h9.o.i(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        cVar.f3865c = dialog;
        if (onCancelListener != null) {
            cVar.f3866f = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    @android.annotation.TargetApi(20)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.content.Context r12, int r13, java.lang.String r14, android.app.PendingIntent r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.e.h(android.content.Context, int, java.lang.String, android.app.PendingIntent):void");
    }

    public final boolean i(Activity activity, e9.f fVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog f10 = f(activity, i10, new h9.y(super.a(activity, i10, "d"), fVar), onCancelListener);
        if (f10 == null) {
            return false;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
