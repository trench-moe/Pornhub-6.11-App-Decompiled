package com.app.pornhub.view.performerdetails;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.z;
import c4.j;
import c4.l;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import f3.h;
import t3.p;

/* loaded from: classes.dex */
public class b extends d4.a implements j.b {
    public static final /* synthetic */ int D0 = 0;
    public a A0;
    public h B0;
    public l C0;

    /* renamed from: z0  reason: collision with root package name */
    public z.b f5425z0;

    @Override // d4.a
    public void K0() {
        if (this.C0.a() != 0) {
            this.A0.d(this.C0.a());
        }
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

    @Override // c4.j.b
    public void a(VideoMetaData videoMetaData) {
        I0(p.c(q(), videoMetaData, UsersConfig.isPremiumAllowed(this.B0.a())));
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        a aVar = (a) new z(s0(), this.f5425z0).a(a.class);
        this.A0 = aVar;
        aVar.f5413g.f(K(), new g4.p(this, 7));
        this.A0.f5414h.f(s0(), new h4.h(this, 5));
    }
}
