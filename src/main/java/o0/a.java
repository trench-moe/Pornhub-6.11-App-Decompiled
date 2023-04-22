package o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class a extends ClickableSpan {

    /* renamed from: c  reason: collision with root package name */
    public final int f13476c;

    /* renamed from: f  reason: collision with root package name */
    public final b f13477f;

    /* renamed from: j  reason: collision with root package name */
    public final int f13478j;

    public a(int i10, b bVar, int i11) {
        this.f13476c = i10;
        this.f13477f = bVar;
        this.f13478j = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f13476c);
        b bVar = this.f13477f;
        bVar.f13479a.performAction(this.f13478j, bundle);
    }
}
