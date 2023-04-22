package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    public static final e.a<?> f5691b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f5692a = new HashMap();

    /* loaded from: classes.dex */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f5693a;

        public b(Object obj) {
            this.f5693a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f5693a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }
}
