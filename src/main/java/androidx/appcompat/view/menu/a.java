package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.i;

/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: c  reason: collision with root package name */
    public Context f606c;

    /* renamed from: f  reason: collision with root package name */
    public Context f607f;

    /* renamed from: j  reason: collision with root package name */
    public e f608j;

    /* renamed from: m  reason: collision with root package name */
    public LayoutInflater f609m;
    public i.a n;

    /* renamed from: t  reason: collision with root package name */
    public int f610t;

    /* renamed from: u  reason: collision with root package name */
    public int f611u;

    /* renamed from: w  reason: collision with root package name */
    public j f612w;
    public int y;

    public a(Context context, int i10, int i11) {
        this.f606c = context;
        this.f609m = LayoutInflater.from(context);
        this.f610t = i10;
        this.f611u = i11;
    }

    @Override // androidx.appcompat.view.menu.i
    public int a() {
        return this.y;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(i.a aVar) {
        this.n = aVar;
    }
}
