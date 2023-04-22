package j0;

import j0.j;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class i implements m0.a<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11113a;

    public i(String str) {
        this.f11113a = str;
    }

    @Override // m0.a
    /* renamed from: a */
    public void accept(j.a aVar) {
        synchronized (j.f11116c) {
            p.g<String, ArrayList<m0.a<j.a>>> gVar = j.d;
            ArrayList<m0.a<j.a>> arrayList = gVar.get(this.f11113a);
            if (arrayList == null) {
                return;
            }
            gVar.remove(this.f11113a);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                arrayList.get(i10).accept(aVar);
            }
        }
    }
}
