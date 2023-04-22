package androidx.mediarouter.app;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public final class k {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z10 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i10 = typedValue.type;
        if (i10 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i10 != 6) {
            return -2;
        } else {
            int i11 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i11, i11);
        }
        return (int) fraction;
    }

    public static int b(Context context) {
        if (context.getResources().getBoolean(R.bool.is_tablet)) {
            return a(context);
        }
        return -1;
    }
}
