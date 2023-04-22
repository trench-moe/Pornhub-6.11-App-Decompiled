package bf;

import java.util.List;
import java.util.RandomAccess;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class p extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    public static final a f3685j = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public final ByteString[] f3686c;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3687f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(long j10, f fVar, int i10, List<? extends ByteString> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            f fVar2;
            int i17 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(list.get(i18).f() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i11);
            ByteString byteString2 = list.get(i12 - 1);
            if (i17 == byteString.f()) {
                int i19 = i11 + 1;
                i13 = i19;
                i14 = list2.get(i11).intValue();
                byteString = list.get(i19);
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.i(i17) == byteString2.i(i17)) {
                int min = Math.min(byteString.f(), byteString2.f());
                int i20 = 0;
                for (int i21 = i17; i21 < min && byteString.i(i21) == byteString2.i(i21); i21++) {
                    i20++;
                }
                long b10 = b(fVar) + j10 + 2 + i20 + 1;
                fVar.q0(-i20);
                fVar.q0(i14);
                int i22 = i17 + i20;
                while (i17 < i22) {
                    fVar.q0(byteString.i(i17) & UByte.MAX_VALUE);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (!(i22 == list.get(i13).f())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    fVar.q0(list2.get(i13).intValue());
                    return;
                }
                f fVar3 = new f();
                fVar.q0(((int) (b(fVar3) + b10)) * (-1));
                a(b10, fVar3, i22, list, i13, i12, list2);
                fVar.f0(fVar3);
                return;
            }
            int i23 = 1;
            for (int i24 = i13 + 1; i24 < i12; i24++) {
                if (list.get(i24 - 1).i(i17) != list.get(i24).i(i17)) {
                    i23++;
                }
            }
            long b11 = b(fVar) + j10 + 2 + (i23 * 2);
            fVar.q0(i23);
            fVar.q0(i14);
            for (int i25 = i13; i25 < i12; i25++) {
                byte i26 = list.get(i25).i(i17);
                if (i25 == i13 || i26 != list.get(i25 - 1).i(i17)) {
                    fVar.q0(i26 & UByte.MAX_VALUE);
                }
            }
            f fVar4 = new f();
            while (i13 < i12) {
                byte i27 = list.get(i13).i(i17);
                int i28 = i13 + 1;
                int i29 = i28;
                while (true) {
                    if (i29 >= i12) {
                        i15 = i12;
                        break;
                    } else if (i27 != list.get(i29).i(i17)) {
                        i15 = i29;
                        break;
                    } else {
                        i29++;
                    }
                }
                if (i28 == i15 && i17 + 1 == list.get(i13).f()) {
                    fVar.q0(list2.get(i13).intValue());
                    i16 = i15;
                    fVar2 = fVar4;
                } else {
                    fVar.q0(((int) (b(fVar4) + b11)) * (-1));
                    i16 = i15;
                    fVar2 = fVar4;
                    a(b11, fVar4, i17 + 1, list, i13, i15, list2);
                }
                fVar4 = fVar2;
                i13 = i16;
            }
            fVar.f0(fVar4);
        }

        public final long b(f fVar) {
            return fVar.f3669f / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
            continue;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final bf.p c(okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.p.a.c(okio.ByteString[]):bf.p");
        }
    }

    public p(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f3686c = byteStringArr;
        this.f3687f = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f3686c[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f3686c.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
