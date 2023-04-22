package x3;

import c4.j;
import c4.l;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import f3.h;
import f3.o;
import io.reactivex.disposables.Disposable;
import t3.p;
import u1.f;
import x2.m;

/* loaded from: classes2.dex */
public class d extends d4.a implements j.b {
    public static final /* synthetic */ int E0 = 0;
    public h A0;
    public o B0;
    public l C0;
    public Disposable D0;

    /* renamed from: z0  reason: collision with root package name */
    public f f17917z0;

    @Override // d4.a
    public void K0() {
        this.D0 = this.f17917z0.b(this.f2019u.getString("itemId"), this.C0.a(), this.f2019u.getString("order")).subscribe(new x2.c(this, 7), new m(this, 5));
    }

    @Override // d4.a
    public c4.a L0() {
        return this.C0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_video_to_display);
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.C0 = new l(this);
        this.f8761q0 = true;
    }

    @Override // d4.a
    public void W0() {
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        Disposable disposable = this.D0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // c4.j.b
    public void a(VideoMetaData videoMetaData) {
        I0(p.c(q(), videoMetaData, UsersConfig.isPremiumAllowed(this.A0.a())));
    }
}
