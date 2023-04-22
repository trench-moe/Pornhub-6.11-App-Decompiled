package ld;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jd.j;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;

/* loaded from: classes2.dex */
public final class a<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KFunction<T> f12780a;

    /* renamed from: b  reason: collision with root package name */
    public final List<C0203a<T, Object>> f12781b;

    /* renamed from: c  reason: collision with root package name */
    public final List<C0203a<T, Object>> f12782c;
    public final JsonReader.a d;

    /* renamed from: ld.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0203a<K, P> {

        /* renamed from: a  reason: collision with root package name */
        public final String f12783a;

        /* renamed from: b  reason: collision with root package name */
        public final f<P> f12784b;

        /* renamed from: c  reason: collision with root package name */
        public final KProperty1<K, P> f12785c;
        public final KParameter d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12786e;

        /* JADX WARN: Multi-variable type inference failed */
        public C0203a(String jsonName, f<P> adapter, KProperty1<K, ? extends P> property, KParameter kParameter, int i10) {
            Intrinsics.checkNotNullParameter(jsonName, "jsonName");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(property, "property");
            this.f12783a = jsonName;
            this.f12784b = adapter;
            this.f12785c = property;
            this.d = kParameter;
            this.f12786e = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0203a) {
                C0203a c0203a = (C0203a) obj;
                return Intrinsics.areEqual(this.f12783a, c0203a.f12783a) && Intrinsics.areEqual(this.f12784b, c0203a.f12784b) && Intrinsics.areEqual(this.f12785c, c0203a.f12785c) && Intrinsics.areEqual(this.d, c0203a.d) && this.f12786e == c0203a.f12786e;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (this.f12785c.hashCode() + ((this.f12784b.hashCode() + (this.f12783a.hashCode() * 31)) * 31)) * 31;
            KParameter kParameter = this.d;
            return ((hashCode + (kParameter == null ? 0 : kParameter.hashCode())) * 31) + this.f12786e;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Binding(jsonName=");
            m10.append(this.f12783a);
            m10.append(", adapter=");
            m10.append(this.f12784b);
            m10.append(", property=");
            m10.append(this.f12785c);
            m10.append(", parameter=");
            m10.append(this.d);
            m10.append(", propertyIndex=");
            return android.support.v4.media.a.i(m10, this.f12786e, ')');
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AbstractMutableMap<KParameter, Object> {

        /* renamed from: c  reason: collision with root package name */
        public final List<KParameter> f12787c;

        /* renamed from: f  reason: collision with root package name */
        public final Object[] f12788f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends KParameter> parameterKeys, Object[] parameterValues) {
            Intrinsics.checkNotNullParameter(parameterKeys, "parameterKeys");
            Intrinsics.checkNotNullParameter(parameterValues, "parameterValues");
            this.f12787c = parameterKeys;
            this.f12788f = parameterValues;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            if (obj instanceof KParameter) {
                KParameter key = (KParameter) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = this.f12788f[key.getIndex()];
                Class<Metadata> cls = c.f12789a;
                return obj2 != c.f12790b;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (obj instanceof KParameter) {
                KParameter key = (KParameter) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = this.f12788f[key.getIndex()];
                Class<Metadata> cls = c.f12789a;
                if (obj2 != c.f12790b) {
                    return obj2;
                }
                return null;
            }
            return null;
        }

        @Override // kotlin.collections.AbstractMutableMap
        public Set<Map.Entry<KParameter, Object>> getEntries() {
            List<KParameter> list = this.f12787c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i10 = 0;
            for (T t2 : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new AbstractMap.SimpleEntry((KParameter) t2, this.f12788f[i10]));
                i10 = i11;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (true) {
                for (T t8 : arrayList) {
                    Object value = ((AbstractMap.SimpleEntry) t8).getValue();
                    Class<Metadata> cls = c.f12789a;
                    if (value != c.f12790b) {
                        linkedHashSet.add(t8);
                    }
                }
                return linkedHashSet;
            }
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof KParameter) ? obj2 : super.getOrDefault((KParameter) obj, obj2);
        }

        @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            KParameter key = (KParameter) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof KParameter) {
                return super.remove((KParameter) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof KParameter) {
                return super.remove((KParameter) obj, obj2);
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(KFunction<? extends T> constructor, List<C0203a<T, Object>> allBindings, List<C0203a<T, Object>> nonIgnoredBindings, JsonReader.a options) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(allBindings, "allBindings");
        Intrinsics.checkNotNullParameter(nonIgnoredBindings, "nonIgnoredBindings");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f12780a = constructor;
        this.f12781b = allBindings;
        this.f12782c = nonIgnoredBindings;
        this.d = options;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.squareup.moshi.f
    public T fromJson(com.squareup.moshi.JsonReader r13) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.a.fromJson(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, T t2) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(t2, "value == null");
        writer.c();
        for (C0203a<T, Object> c0203a : this.f12781b) {
            if (c0203a != null) {
                writer.i(c0203a.f12783a);
                c0203a.f12784b.toJson(writer, (j) c0203a.f12785c.get(t2));
            }
        }
        writer.f();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("KotlinJsonAdapter(");
        m10.append(this.f12780a.getReturnType());
        m10.append(')');
        return m10.toString();
    }
}
