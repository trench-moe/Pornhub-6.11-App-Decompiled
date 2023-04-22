package q2;

import android.net.Uri;
import com.app.pornhub.data.util.JNI;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;

/* loaded from: classes2.dex */
public final class z implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14315a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<String> f14316b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<JNI> f14317c;

    public z(a0.b bVar, ie.a<String> aVar, ie.a<JNI> aVar2) {
        this.f14315a = bVar;
        this.f14316b = aVar;
        this.f14317c = aVar2;
    }

    @Override // ie.a
    public Object get() {
        a0.b bVar = this.f14315a;
        String pattern = this.f14316b.get();
        JNI jni = this.f14317c.get();
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(pattern, "targetUrl");
        Intrinsics.checkNotNullParameter(jni, "jni");
        String[] b10 = jni.b();
        String host = Uri.parse(pattern).getHost();
        if (host != null) {
            pattern = host;
        }
        ArrayList arrayList = new ArrayList();
        String[] pins = {Intrinsics.stringPlus("sha256/", b10[0])};
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(pins, "pins");
        for (int i10 = 0; i10 < 1; i10++) {
            arrayList.add(new CertificatePinner.b(pattern, pins[i10]));
        }
        String[] pins2 = {Intrinsics.stringPlus("sha256/", b10[1])};
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(pins2, "pins");
        for (int i11 = 0; i11 < 1; i11++) {
            arrayList.add(new CertificatePinner.b(pattern, pins2[i11]));
        }
        return new CertificatePinner(CollectionsKt.toSet(arrayList), null, 2);
    }
}
