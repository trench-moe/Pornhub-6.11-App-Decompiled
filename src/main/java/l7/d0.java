package l7;

import com.appsflyer.oaid.BuildConfig;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public interface d0 {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12395a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f12396b;

        public a(String str, int i10, byte[] bArr) {
            this.f12395a = str;
            this.f12396b = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f12397a;

        /* renamed from: b  reason: collision with root package name */
        public final List<a> f12398b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12399c;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f12397a = str;
            this.f12398b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f12399c = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        d0 a(int i10, b bVar);
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12400a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12401b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12402c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public String f12403e;

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(i10);
                sb2.append("/");
                str = sb2.toString();
            } else {
                str = BuildConfig.FLAVOR;
            }
            this.f12400a = str;
            this.f12401b = i11;
            this.f12402c = i12;
            this.d = IntCompanionObject.MIN_VALUE;
            this.f12403e = BuildConfig.FLAVOR;
        }

        public void a() {
            int i10 = this.d;
            int i11 = i10 == Integer.MIN_VALUE ? this.f12401b : i10 + this.f12402c;
            this.d = i11;
            String str = this.f12400a;
            this.f12403e = android.support.v4.media.b.e(a0.a.e(str, 11), str, i11);
        }

        public String b() {
            if (this.d != Integer.MIN_VALUE) {
                return this.f12403e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public int c() {
            int i10 = this.d;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a(k8.a0 a0Var, c7.j jVar, d dVar);

    void b(k8.t tVar, int i10);

    void c();
}
