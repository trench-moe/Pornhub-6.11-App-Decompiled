package p0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import n0.c;
import n0.x;

/* loaded from: classes2.dex */
public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f13776a;

    public d(View view) {
        this.f13776a = view;
    }

    public boolean a(f fVar, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                fVar.f13777a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.f13777a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(fVar.f13777a.getDescription(), new ClipData.Item(fVar.f13777a.a()));
        c.b aVar = Build.VERSION.SDK_INT >= 31 ? new c.a(clipData, 2) : new c.C0218c(clipData, 2);
        aVar.b(fVar.f13777a.c());
        aVar.a(bundle);
        return x.q(this.f13776a, aVar.build()) == null;
    }
}
