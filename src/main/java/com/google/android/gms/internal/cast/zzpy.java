package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t9.t1;

/* loaded from: classes.dex */
public final class zzpy<K, V> extends LinkedHashMap<K, V> {
    private boolean zzb;

    static {
        new zzpy().zzb = false;
    }

    private zzpy() {
        this.zzb = true;
    }

    public zzpy(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    public static int d(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof t9.n1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = t1.f15353a;
        int length = bArr.length;
        for (byte b10 : bArr) {
            length = (length * 31) + b10;
        }
        if (length == 0) {
            length = 1;
        }
        return length;
    }

    public final zzpy<K, V> a() {
        return isEmpty() ? new zzpy<>() : new zzpy<>(this);
    }

    public final void b() {
        this.zzb = false;
    }

    public final boolean c() {
        return this.zzb;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i10 += d(entry.getValue()) ^ d(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v2) {
        f();
        Charset charset = t1.f15353a;
        Objects.requireNonNull(k10);
        Objects.requireNonNull(v2);
        return (V) super.put(k10, v2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        f();
        for (K k10 : map.keySet()) {
            Charset charset = t1.f15353a;
            Objects.requireNonNull(k10);
            Objects.requireNonNull(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        f();
        return (V) super.remove(obj);
    }
}
