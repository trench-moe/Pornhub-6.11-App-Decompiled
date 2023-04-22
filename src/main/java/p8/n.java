package p8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class n implements y {

    /* renamed from: f  reason: collision with root package name */
    public static final Uri f13852f;

    /* renamed from: c  reason: collision with root package name */
    public final LogPrinter f13853c = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f13852f = builder.build();
    }

    @Override // p8.y
    public final void a(o oVar) {
        ArrayList arrayList = new ArrayList(oVar.f13862j.values());
        Collections.sort(arrayList, new m());
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String obj = ((q) arrayList.get(i10)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(obj);
            }
        }
        this.f13853c.println(sb2.toString());
    }

    @Override // p8.y
    public final Uri zzb() {
        return f13852f;
    }
}
