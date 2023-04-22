package n5;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f13324b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f13325c;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f13326b;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<h>> f13327a = f13326b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f13326b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f13328a;

        public b(String str) {
            this.f13328a = str;
        }

        @Override // n5.h
        public String a() {
            return this.f13328a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f13328a.equals(((b) obj).f13328a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13328a.hashCode();
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("StringHeaderFactory{value='");
            m10.append(this.f13328a);
            m10.append('\'');
            m10.append('}');
            return m10.toString();
        }
    }

    public i(Map<String, List<h>> map) {
        this.f13324b = Collections.unmodifiableMap(map);
    }

    @Override // n5.g
    public Map<String, String> a() {
        if (this.f13325c == null) {
            synchronized (this) {
                if (this.f13325c == null) {
                    this.f13325c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f13325c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        while (true) {
            for (Map.Entry<String, List<h>> entry : this.f13324b.entrySet()) {
                List<h> value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                int size = value.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String a10 = value.get(i10).a();
                    if (!TextUtils.isEmpty(a10)) {
                        sb2.append(a10);
                        if (i10 != value.size() - 1) {
                            sb2.append(',');
                        }
                    }
                }
                String sb3 = sb2.toString();
                if (!TextUtils.isEmpty(sb3)) {
                    hashMap.put(entry.getKey(), sb3);
                }
            }
            return hashMap;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f13324b.equals(((i) obj).f13324b);
        }
        return false;
    }

    public int hashCode() {
        return this.f13324b.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("LazyHeaders{headers=");
        m10.append(this.f13324b);
        m10.append('}');
        return m10.toString();
    }
}
