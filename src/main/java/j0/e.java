package j0;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f11100a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11101b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11102c;
    public final List<List<byte[]>> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11103e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f11100a = str;
        Objects.requireNonNull(str2);
        this.f11101b = str2;
        this.f11102c = str3;
        Objects.requireNonNull(list);
        this.d = list;
        this.f11103e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder m10 = a1.a.m("FontRequest {mProviderAuthority: ");
        m10.append(this.f11100a);
        m10.append(", mProviderPackage: ");
        m10.append(this.f11101b);
        m10.append(", mQuery: ");
        m10.append(this.f11102c);
        m10.append(", mCertificates:");
        sb2.append(m10.toString());
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        return android.support.v4.media.b.m(sb2, "}", "mCertificatesArray: 0");
    }
}
