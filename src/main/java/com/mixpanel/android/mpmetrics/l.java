package com.mixpanel.android.mpmetrics;

import com.mixpanel.android.mpmetrics.k;

/* loaded from: classes.dex */
public class l extends k.e {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k.e eVar, String str) {
        super(null);
        this.f8291b = str;
    }

    @Override // com.mixpanel.android.mpmetrics.k.e, com.mixpanel.android.mpmetrics.k.d
    public void a(String str) {
        throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
    }

    @Override // com.mixpanel.android.mpmetrics.k.e
    public String c() {
        return this.f8291b;
    }
}
