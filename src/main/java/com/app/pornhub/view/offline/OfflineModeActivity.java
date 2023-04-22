package com.app.pornhub.view.offline;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Base64;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityOfflineModeBinding;
import com.app.pornhub.domain.util.PornhubConsts;
import t3.d;
import t3.e;
import v3.b;
import x4.j;

/* loaded from: classes.dex */
public class OfflineModeActivity extends b {
    public static final /* synthetic */ int L = 0;
    public ActivityOfflineModeBinding K;

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        long j10;
        super.onCreate(bundle);
        this.K = ActivityOfflineModeBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_offline_mode);
        byte[] bArr = null;
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("macola", null);
        if (string != null) {
            bArr = e.e(this, Base64.decode(string, 0));
        }
        if (bArr != null) {
            d.f15109a.put(bArr, 0, bArr.length);
            d.f15109a.flip();
            j10 = d.f15109a.getLong();
            d.f15109a.clear();
        } else {
            j10 = 0;
        }
        int i10 = (j10 > (System.currentTimeMillis() - PornhubConsts.f4911a) ? 1 : (j10 == (System.currentTimeMillis() - PornhubConsts.f4911a) ? 0 : -1));
        if (i10 == i10) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(u());
            aVar.i(R.id.expandablePanelContentContainer, new x4.e(), x4.e.A0);
            aVar.d();
        } else {
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(u());
            aVar2.i(R.id.expandablePanelContentContainer, new j(), j.f17944p0);
            aVar2.d();
        }
        A(this.K.f4433b);
        y().n(false);
        this.K.f4433b.setTitle(getString(R.string.offline_videos));
    }
}
