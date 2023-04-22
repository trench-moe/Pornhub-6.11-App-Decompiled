package h9;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class x extends z {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f10385c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f10386f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f10387j;

    public x(Intent intent, Activity activity, int i10) {
        this.f10385c = intent;
        this.f10386f = activity;
        this.f10387j = i10;
    }

    @Override // h9.z
    public final void a() {
        Intent intent = this.f10385c;
        if (intent != null) {
            this.f10386f.startActivityForResult(intent, this.f10387j);
        }
    }
}
