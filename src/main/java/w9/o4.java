package w9;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class o4 {

    /* renamed from: a  reason: collision with root package name */
    public static final p.a f17265a = new p.a();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (o4.class) {
            p.a aVar = f17265a;
            uri = (Uri) aVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
