package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final h<?, ?> f5640k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final k5.b f5641a;

    /* renamed from: b  reason: collision with root package name */
    public final Registry f5642b;

    /* renamed from: c  reason: collision with root package name */
    public final cb.e f5643c;
    public final b.a d;

    /* renamed from: e  reason: collision with root package name */
    public final List<z5.e<Object>> f5644e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, h<?, ?>> f5645f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.load.engine.f f5646g;

    /* renamed from: h  reason: collision with root package name */
    public final e f5647h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5648i;

    /* renamed from: j  reason: collision with root package name */
    public z5.f f5649j;

    public d(Context context, k5.b bVar, Registry registry, cb.e eVar, b.a aVar, Map<Class<?>, h<?, ?>> map, List<z5.e<Object>> list, com.bumptech.glide.load.engine.f fVar, e eVar2, int i10) {
        super(context.getApplicationContext());
        this.f5641a = bVar;
        this.f5642b = registry;
        this.f5643c = eVar;
        this.d = aVar;
        this.f5644e = list;
        this.f5645f = map;
        this.f5646g = fVar;
        this.f5647h = eVar2;
        this.f5648i = i10;
    }
}
