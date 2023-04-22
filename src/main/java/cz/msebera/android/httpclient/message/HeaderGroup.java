package cz.msebera.android.httpclient.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.d;
import md.f;
import ud.h;

/* loaded from: classes.dex */
public class HeaderGroup implements Cloneable, Serializable {
    private static final long serialVersionUID = 2608834160639271617L;
    private final d[] EMPTY = new d[0];
    private final List<d> headers = new ArrayList(16);

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        this.headers.add(dVar);
    }

    public boolean b(String str) {
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            if (this.headers.get(i10).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public d c(String str) {
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            d dVar = this.headers.get(i10);
            if (dVar.getName().equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public Object clone() {
        return super.clone();
    }

    public d[] d(String str) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            d dVar = this.headers.get(i10);
            if (dVar.getName().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dVar);
            }
        }
        return arrayList != null ? (d[]) arrayList.toArray(new d[arrayList.size()]) : this.EMPTY;
    }

    public f f() {
        return new h(this.headers, null);
    }

    public f g(String str) {
        return new h(this.headers, str);
    }

    public void i(d[] dVarArr) {
        this.headers.clear();
        if (dVarArr == null) {
            return;
        }
        Collections.addAll(this.headers, dVarArr);
    }

    public String toString() {
        return this.headers.toString();
    }
}
