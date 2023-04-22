package jb;

import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import jb.a;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final jb.a f11664a;

    /* renamed from: b  reason: collision with root package name */
    public final b f11665b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11666c;

    /* loaded from: classes2.dex */
    public static abstract class a extends AbstractIterator<String> {

        /* renamed from: j  reason: collision with root package name */
        public final CharSequence f11667j;

        /* renamed from: m  reason: collision with root package name */
        public final jb.a f11668m;

        /* renamed from: u  reason: collision with root package name */
        public int f11670u;

        /* renamed from: t  reason: collision with root package name */
        public int f11669t = 0;
        public final boolean n = false;

        public a(i iVar, CharSequence charSequence) {
            this.f11668m = iVar.f11664a;
            this.f11670u = iVar.f11666c;
            this.f11667j = charSequence;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public i(b bVar) {
        a.d dVar = a.d.f11657f;
        this.f11665b = bVar;
        this.f11664a = dVar;
        this.f11666c = IntCompanionObject.MAX_VALUE;
    }

    public List<String> a(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        h hVar = (h) this.f11665b;
        Objects.requireNonNull(hVar);
        g gVar = new g(hVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (gVar.hasNext()) {
            arrayList.add(gVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
