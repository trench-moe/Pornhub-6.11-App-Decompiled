package c3;

import b3.e;
import b3.i;
import b3.k;
import b3.o;
import f3.m;
import f3.q;
import java.util.Objects;
import k3.f;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes.dex */
public final class c implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3726a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3727b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f3726a = i10;
        this.f3727b = obj;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f3726a) {
            case 0:
                return new b((b3.a) ((ie.a) this.f3727b).get());
            case 1:
                return new d3.c((b3.b) ((ie.a) this.f3727b).get());
            case 2:
                return new m((e) ((ie.a) this.f3727b).get());
            case 3:
                return new q((e) ((ie.a) this.f3727b).get());
            case 4:
                return new j3.c((k) ((ie.a) this.f3727b).get());
            case 5:
                return new k3.b((i) ((ie.a) this.f3727b).get());
            case 6:
                return new f((i) ((ie.a) this.f3727b).get());
            case 7:
                return new o3.e((o) ((ie.a) this.f3727b).get());
            default:
                Objects.requireNonNull((a0.b) this.f3727b);
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1);
                HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.NONE;
                Intrinsics.checkNotNullParameter(level, "<set-?>");
                httpLoggingInterceptor.f13720b = level;
                return httpLoggingInterceptor;
        }
    }
}
