package kotlin.jvm.internal;

import a1.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class SpreadBuilder {
    private final ArrayList<Object> list;

    public SpreadBuilder(int i10) {
        this.list = new ArrayList<>(i10);
    }

    public void add(Object obj) {
        this.list.add(obj);
    }

    public void addSpread(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.list;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.list, objArr);
            }
        } else if (obj instanceof Collection) {
            this.list.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.list.add(obj2);
            }
        } else if (!(obj instanceof Iterator)) {
            StringBuilder m10 = a.m("Don't know how to spread ");
            m10.append(obj.getClass());
            throw new UnsupportedOperationException(m10.toString());
        } else {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.list.add(it.next());
            }
        }
    }

    public int size() {
        return this.list.size();
    }

    public Object[] toArray(Object[] objArr) {
        return this.list.toArray(objArr);
    }
}
