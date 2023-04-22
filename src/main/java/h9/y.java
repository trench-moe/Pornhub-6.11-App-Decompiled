package h9;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class y extends z {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f10391c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e9.f f10392f;

    public y(Intent intent, e9.f fVar) {
        this.f10391c = intent;
        this.f10392f = fVar;
    }

    @Override // h9.z
    public final void a() {
        Intent intent = this.f10391c;
        if (intent != null) {
            this.f10392f.startActivityForResult(intent, 2);
        }
    }
}
