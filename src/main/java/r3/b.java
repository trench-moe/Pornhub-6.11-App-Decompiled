package r3;

import com.app.pornhub.domain.model.video.VideoContentType;
import com.appsflyer.oaid.BuildConfig;
import ea.h;
import i6.f;
import io.realm.RealmFieldType;
import io.realm.e;
import io.realm.x;
import java.util.Locale;
import k8.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mc.a;
import qb.q;
import r6.i;
import t6.a;
import vb.r;
import w6.m0;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements x.c, a.InterfaceC0268a, m.a, a.InterfaceC0215a, f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14629c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14630f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14631j;

    public /* synthetic */ b(Object obj, Object obj2, int i10) {
        this.f14629c = i10;
        this.f14630f = obj;
        this.f14631j = obj2;
    }

    @Override // mc.a.InterfaceC0215a
    public void b(mc.b bVar) {
        int i10 = q.f14482c;
        ((a.InterfaceC0215a) this.f14630f).b(bVar);
        ((a.InterfaceC0215a) this.f14631j).b(bVar);
    }

    @Override // io.realm.x.c
    public void d(e eVar) {
        VideoContentType videoContentType;
        String oldFieldName = (String) this.f14630f;
        String newFieldName = (String) this.f14631j;
        Intrinsics.checkNotNullParameter(oldFieldName, "$oldFieldName");
        Intrinsics.checkNotNullParameter(newFieldName, "$newFieldName");
        eVar.f10858a.d.e();
        long o10 = eVar.f10858a.f10983c.o(oldFieldName);
        try {
            boolean i10 = eVar.f10858a.f10983c.i(o10);
            if (i10) {
                videoContentType = VideoContentType.PREMIUM;
            } else if (i10) {
                throw new NoWhenBranchMatchedException();
            } else {
                videoContentType = VideoContentType.FREE;
            }
            short code = videoContentType.getCode();
            eVar.f10858a.d.e();
            eVar.x(newFieldName);
            eVar.f10858a.f10983c.l(eVar.f10858a.f10983c.o(newFieldName), code);
        } catch (IllegalArgumentException e10) {
            RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
            RealmFieldType w10 = eVar.f10858a.f10983c.w(o10);
            if (w10 == realmFieldType) {
                throw e10;
            }
            RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
            String str = "n";
            String str2 = (realmFieldType == realmFieldType2 || realmFieldType == RealmFieldType.OBJECT) ? "n" : BuildConfig.FLAVOR;
            if (w10 != realmFieldType2 && w10 != RealmFieldType.OBJECT) {
                str = BuildConfig.FLAVOR;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "'%s' is not a%s '%s', but a%s '%s'.", oldFieldName, str2, realmFieldType, str, w10));
        }
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        ((i) this.f14630f).f14704c.p((Iterable) this.f14631j);
        return null;
    }

    @Override // i6.f
    public void g(Exception exc) {
        h hVar = (h) this.f14630f;
        r rVar = (r) this.f14631j;
        yb.a aVar = bc.a.f3637b;
        if (exc != null) {
            hVar.a(exc);
        } else {
            hVar.b(rVar);
        }
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f14629c) {
            case 2:
                ((c0) obj).U((c0.a) this.f14630f, (o7.a) this.f14631j);
                return;
            default:
                ((c0) obj).H((c0.a) this.f14630f, (m0) this.f14631j);
                return;
        }
    }
}
