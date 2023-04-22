package h9;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Account f10282a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f10283b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f10284c;
    public final Map<d9.a<?>, v> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10285e;

    /* renamed from: f  reason: collision with root package name */
    public final String f10286f;

    /* renamed from: g  reason: collision with root package name */
    public final ba.a f10287g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f10288h;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f10289a;

        /* renamed from: b  reason: collision with root package name */
        public p.c<Scope> f10290b;

        /* renamed from: c  reason: collision with root package name */
        public String f10291c;
        public String d;

        public c a() {
            return new c(this.f10289a, this.f10290b, null, 0, null, this.f10291c, this.d, ba.a.f3624b);
        }
    }

    public c(Account account, Set set, Map map, int i10, View view, String str, String str2, ba.a aVar) {
        this.f10282a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f10283b = emptySet;
        Map<d9.a<?>, v> emptyMap = Collections.emptyMap();
        this.d = emptyMap;
        this.f10285e = str;
        this.f10286f = str2;
        this.f10287g = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (v vVar : emptyMap.values()) {
            Objects.requireNonNull(vVar);
            hashSet.addAll(null);
        }
        this.f10284c = Collections.unmodifiableSet(hashSet);
    }
}
