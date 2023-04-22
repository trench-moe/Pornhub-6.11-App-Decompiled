package t9;

import android.widget.TextView;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class m extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final TextView f15299b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f15300c;

    public m(TextView textView, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.f15300c = arrayList;
        this.f15299b = textView;
        arrayList.addAll(list);
    }

    @Override // y8.a
    public final void b() {
        u8.j jVar;
        w8.g gVar = this.f18545a;
        if (gVar == null || !gVar.j()) {
            return;
        }
        u8.o g10 = gVar.g();
        Objects.requireNonNull(g10, "null reference");
        MediaInfo mediaInfo = g10.f15736c;
        if (mediaInfo == null || (jVar = mediaInfo.f6797m) == null) {
            return;
        }
        for (String str : this.f15300c) {
            if (jVar.p0(str)) {
                this.f15299b.setText(jVar.q0(str));
                return;
            }
        }
        this.f15299b.setText(BuildConfig.FLAVOR);
    }
}
