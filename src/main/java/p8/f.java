package p8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p8.f;

/* loaded from: classes2.dex */
public class f<T extends f> {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f13835a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, List<q8.a>> f13836b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public List<q8.b> f13837c = new ArrayList();
    public List<q8.a> d = new ArrayList();

    public Map<String, String> a() {
        HashMap hashMap = new HashMap(this.f13835a);
        int i10 = 1;
        for (q8.b bVar : this.f13837c) {
            hashMap.putAll(bVar.a(a0.b.z0("&promo", i10)));
            i10++;
        }
        int i11 = 1;
        for (q8.a aVar : this.d) {
            hashMap.putAll(aVar.a(a0.b.z0("&pr", i11)));
            i11++;
        }
        int i12 = 1;
        for (Map.Entry<String, List<q8.a>> entry : this.f13836b.entrySet()) {
            String z02 = a0.b.z0("&il", i12);
            int i13 = 1;
            for (q8.a aVar2 : entry.getValue()) {
                String valueOf = String.valueOf(z02);
                String valueOf2 = String.valueOf(a0.b.z0("pi", i13));
                hashMap.putAll(aVar2.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                i13++;
            }
            if (!TextUtils.isEmpty(entry.getKey())) {
                hashMap.put(String.valueOf(z02).concat("nm"), entry.getKey());
            }
            i12++;
        }
        return hashMap;
    }

    public final T b(String str, String str2) {
        this.f13835a.put(str, str2);
        return this;
    }
}
